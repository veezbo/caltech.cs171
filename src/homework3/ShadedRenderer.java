package homework3;

import java.util.ArrayList;

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

import homework1.Matrix;
import homework2.Triple;

public class ShadedRenderer {
	
	Canvas c;
	static final int FLAT_SHADING = 0;
    static final int GOURAND_SHADING = 1;
    static final int PHONG_SHADING = 2;
	
	public ShadedRenderer(Canvas c) {
		this.c = c;
	}
	
	public void shaded(int n, int xRes, int yRes, OpenInventorData oid) {
		
		Raster.initDraw(-1, 1, -1, 1, xRes, yRes);
		
		for (SeparatorData sd : oid.sds) {
			
			//What we ultimately want- generate the list by evaluating all the parsed data
			ArrayList<Polygon> faces = new ArrayList<Polygon>();
			
			//saving the data here so only one method call (for the points and normals themselves)
			ArrayList<Triple> points = sd.cd.points;
			ArrayList<Triple> normals = sd.nd.vectors;
			
			//saving the data here so only one method call (for the indices and normalIndices themselves)
			ArrayList<Integer> cindices = sd.ifs.indices;
			ArrayList<Integer> nindices = sd.ifs.nindices;
			int size = cindices.size();
			
			//temp storage for all the vertices of the polygon being read in
			ArrayList<Vertex> verts = new ArrayList<Vertex>();
			
			for (int i = 0; i < size; i++) {
				
				int cindex = cindices.get(i), nindex = nindices.get(i);
				if (cindex == -1 && nindex == -1) {
					faces.add(new Polygon(verts));
					verts.clear();
				}
				else {
					//create the new Vertex from the parsed in data, and then transform to World Space
					Vertex add = new Vertex(points.get(cindex), normals.get(nindex));
					add.transformToWorldSpace(sd.O, sd.tRSinv);
					
					verts.add(add);
				}
			}
			
			if (n==FLAT_SHADING) flatShading(xRes, yRes, oid, sd, faces);
			if (n==GOURAND_SHADING) gourandShading(xRes, yRes, oid, sd, faces);
			if (n==PHONG_SHADING) phongShading(xRes, yRes, oid, sd, faces);
		}
	}
	
	private ArrayList<Polygon> backfaceCulling (ArrayList<Polygon> fs, OpenInventorData oid, SeparatorData sd) {
		ArrayList<Polygon> faces = new ArrayList<Polygon>();
		for (Polygon f : fs) {
			ArrayList<Triangle> ts = new ArrayList<Triangle>();
			for (Triangle t : f.triangles) {
				//currently in world space, need to convert to NDC
				RealVector v1 = t.v1.location, v2 = t.v2.location, v3 = t.v3.location;
				RealMatrix PCinv = Matrix.mult(oid.pcd.P, oid.pcd.Cinv);
				v1 = Matrix.mult(PCinv, v1);
				v2 = Matrix.mult(PCinv, v2);
				v3 = Matrix.mult(PCinv, v3);
				
				RealVector n = Matrix.crossProduct(Matrix.sub(v3, v2), Matrix.sub(v1, v2));
				if (n.getEntry(2) > 0) {
					ts.add(t);
				}
			}
			faces.add(new Polygon(ts, false));
		}
		return faces;
	}
	
	private void flatShading(int xRes, int yRes, OpenInventorData oid, SeparatorData sd, ArrayList<Polygon> faces) {
		faces = backfaceCulling (faces, oid, sd);
		for (Polygon face : faces) {
			for (Triangle tri : face.triangles) {
				Vertex avg = Vertex.avgVertex(tri.v1, tri.v2, tri.v3);
				Triple rgb = new Triple (lightFunction(avg.norm, avg.location, sd.md, oid.plds, Matrix.createVector(oid.pcd.position.data)).toArray());
				tri.v1.rgb = rgb;
				tri.v2.rgb = rgb;
				tri.v3.rgb = rgb;
				
				//Convert to NDC here?
				RealMatrix PCinv = Matrix.mult(oid.pcd.P, oid.pcd.Cinv);
				tri.v1.location = Matrix.mult(PCinv, tri.v1.location);
				tri.v2.location = Matrix.mult(PCinv, tri.v2.location);
				tri.v3.location = Matrix.mult(PCinv, tri.v3.location);
				tri.v1.location = Matrix.homogenize(tri.v1.location);
				tri.v2.location = Matrix.homogenize(tri.v2.location);
				tri.v3.location = Matrix.homogenize(tri.v3.location);
				
				Vertex[] verts = {tri.v1, tri.v2, tri.v3};
				for (int i = 0; i < 3; i++) {
					verts[i].data = new float[3];
					verts[i].data[0] = (float) verts[i].location.getEntry(0);
					verts[i].data[1] = (float) verts[i].location.getEntry(1);
					verts[i].data[2] = (float) verts[i].location.getEntry(2);
					verts[i].numData = 3;
				}
				Raster.raster(verts, c, 0);
			}
		}
	}
	
	private void gourandShading(int xRes, int yRes, OpenInventorData oid, SeparatorData sd, ArrayList<Polygon> faces) {
		faces = backfaceCulling (faces, oid, sd);
		for (Polygon face: faces) {
			for (Triangle tri: face.triangles) {
				tri.v1.rgb = new Triple (lightFunction(tri.v1.norm, tri.v1.location, sd.md, oid.plds, Matrix.createVector(oid.pcd.position.data)).toArray());
				tri.v2.rgb = new Triple (lightFunction(tri.v2.norm, tri.v2.location, sd.md, oid.plds, Matrix.createVector(oid.pcd.position.data)).toArray());
				tri.v3.rgb = new Triple (lightFunction(tri.v3.norm, tri.v3.location, sd.md, oid.plds, Matrix.createVector(oid.pcd.position.data)).toArray());
				
				//Convert to NDC here?
				RealMatrix PCinv = Matrix.mult(oid.pcd.P, oid.pcd.Cinv);
				tri.v1.location = Matrix.mult(PCinv, tri.v1.location);
				tri.v2.location = Matrix.mult(PCinv, tri.v2.location);
				tri.v3.location = Matrix.mult(PCinv, tri.v3.location);
				tri.v1.location = Matrix.homogenize(tri.v1.location);
				tri.v2.location = Matrix.homogenize(tri.v2.location);
				tri.v3.location = Matrix.homogenize(tri.v3.location);
				
				Vertex[] verts = {tri.v1, tri.v2, tri.v3};
				
				for (int i = 0; i < 3; i++) {
					verts[i].data = new float[6];
					verts[i].data[0] = (float) verts[i].location.getEntry(0);
					verts[i].data[1] = (float) verts[i].location.getEntry(1);
					verts[i].data[2] = (float) verts[i].location.getEntry(2);
					verts[i].data[3] = (float) verts[i].rgb.data[0];
					verts[i].data[4] = (float) verts[i].rgb.data[1];
					verts[i].data[5] = (float) verts[i].rgb.data[2];
					verts[i].numData = 6;
				}
				
				Raster.raster(verts, c, 1);
				
			}
		}
	}
	
	private void phongShading(int xRes, int yRes, OpenInventorData oid, SeparatorData sd, ArrayList<Polygon> faces) {
		faces = backfaceCulling(faces, oid, sd);
		ArrayList<Vertex> pixels = new ArrayList<Vertex>();
		
		for (Polygon face: faces) {
			for (Triangle tri: face.triangles) {
				
				//Convert to NDC here?
				RealMatrix PCinv = Matrix.mult(oid.pcd.P, oid.pcd.Cinv);
				tri.v1.location = Matrix.mult(PCinv, tri.v1.location);
				tri.v2.location = Matrix.mult(PCinv, tri.v2.location);
				tri.v3.location = Matrix.mult(PCinv, tri.v3.location);
				tri.v1.location = Matrix.homogenize(tri.v1.location);
				tri.v2.location = Matrix.homogenize(tri.v2.location);
				tri.v3.location = Matrix.homogenize(tri.v3.location);
				
				Vertex[] verts = {tri.v1, tri.v2, tri.v3};
				
				for (int i = 0; i < 3; i++) {
					verts[i].data = new float[6];
					verts[i].data[0] = (float) verts[i].location.getEntry(0);
					verts[i].data[1] = (float) verts[i].location.getEntry(1);
					verts[i].data[2] = (float) verts[i].location.getEntry(2);
					verts[i].data[3] = (float) verts[i].norm.getEntry(0);
					verts[i].data[4] = (float) verts[i].norm.getEntry(1);
					verts[i].data[5] = (float) verts[i].norm.getEntry(2);
					verts[i].numData = 6;
				}
				
				pixels = Raster.raster(verts, c, 2);
				if (pixels == null) continue;
				for (Vertex pixel : pixels) {
					//Call the lighting function on all of the returned pixels
					//Then, call the drawPixel method on these pixels and their values
					
					pixel.rgb = new Triple (lightFunction(pixel.norm, pixel.location, sd.md, oid.plds, Matrix.createVector(oid.pcd.position.data)).toArray());
					c.drawPixel((int) pixel.x, (int) pixel.y, pixel.z, pixel.rgb);
				}
			}
		}
		
	}
	
	private static RealVector zeroclip(RealVector X) {
		int size = X.getDimension();
		for (int i = 0; i < size; i++) {
			double x = X.getEntry(i);
			if (x <= 0) {
				x = 0;
			}
			X.setEntry(i, x);
		}
		return X;
	}
	private static double zeroclip(double x) {
		if (x <= 0)	return 0;
		else return x;
	}
	private static RealVector oneclip(RealVector X) {
		int size = X.getDimension();
		for (int i = 0; i < size; i++) {
			double x = X.getEntry(i);
			if (x >= 1) {
				x = 1;
			}
			X.setEntry(i, x);
		}
		return X;
	}
	private static RealVector unit(RealVector X) {
		return Matrix.normalize(X);
	}
	
	public static RealVector lightFunction(RealVector n, RealVector v, MaterialData material, ArrayList<PointLightData> lights, RealVector cameraPos) {
		
		//Clean-Up Code
		v = Matrix.dehomogenize(v);
		n = Matrix.dehomogenize(n);
		//End Clean-Up Code
		
		RealVector scolor = Matrix.createVector(material.specularColor.data);
		RealVector dcolor = Matrix.createVector(material.diffuseColor.data);
		RealVector acolor = Matrix.createVector(material.ambientColor.data);
		double shiny = material.shininess;
		
		RealVector diffuse = Matrix.createVector(new double[] {0.0, 0.0, 0.0});
		RealVector specular = Matrix.createVector(new double[] {0.0, 0.0, 0.0});
		
		//copy the ambient color (for the eyelight extra credit code, you can chage it here to rely on distance from the camera
		RealVector ambient = acolor;
		
		for (PointLightData l : lights) {
			
			RealVector lx = Matrix.dehomogenize(l.location);
			RealVector lc = Matrix.createVector(l.color.data);
			
			//calculate the addition this light makes to the diffuse part
			RealVector ddiffuse = zeroclip(Matrix.mult(lc, Matrix.dotProduct(n, unit(Matrix.sub(lx, v)))));
			//accumulate that
			diffuse = Matrix.add(diffuse, ddiffuse);
			
			//calculate the specular exponent
			double k = zeroclip(Matrix.dotProduct(n, unit(Matrix.add(unit(Matrix.sub(cameraPos, v)), unit(Matrix.sub(lx, v))))));
			//calculate the addition to the specular highlight
			//k^shiny is a scalar, lc is (r, g, b)
			RealVector dspecular = zeroclip(Matrix.mult(lc, Math.pow(k, shiny)));
			//accumulate that
			specular = Matrix.add(specular, dspecular);

		}
		//after working on all the lights, clamp the diffuse value to 1
		RealVector d = oneclip(diffuse);
		
		RealVector rgb = oneclip(Matrix.add(ambient, Matrix.add(Matrix.componentMult(d, dcolor), Matrix.componentMult(specular, scolor))));
		return rgb;
	}
}
