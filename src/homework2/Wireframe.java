package homework2;

import homework1.Canvas;
import homework1.Matrix;
import homework1.Point;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.math3.linear.*;

public class Wireframe {
	
	//default values
	int xRes=400, yRes=400;
	
	OpenInventorData oid;
	
	public Wireframe(OpenInventorData oid) {
		this.oid = oid;
	}
	public Wireframe(OpenInventorData oid, int xRes, int yRes) {
		this.oid = oid;
		this.xRes = xRes;
		this.yRes = yRes;
	}
	public void setRes(int xRes, int yRes) {
		this.xRes = xRes;
		this.yRes = yRes;
	}
	
	
	
	public void wireframe(int xRes, int yRes) throws IOException {
		this.xRes = xRes;
		this.yRes = yRes;
		wireframe();
	}
	public void wireframe () throws IOException {
		
		ArrayList<Point> points = new ArrayList<Point>();
		ArrayList<Boolean> drawBetween = new ArrayList<Boolean>();
		
		RealMatrix PCinv = Matrix.mult(oid.pcd.P, oid.pcd.Cinv);	
		
		int size = oid.sds.size();
		for (int i = 0; i < size; i++) {
			SeparatorData sd = oid.sds.get(i);
			RealMatrix PCinvO = Matrix.mult(PCinv, sd.O);
			
			int len = sd.ifs.indices.size();
			for (int j = 0; j < len; j++) {
				//Get the Indexed Point as indicated by IndexedFaceSet, and conver to a RealVector
				Triple xyz = sd.cd.points.get(sd.ifs.indices.get(j));
				RealVector v = Matrix.createHomogenizedVector(xyz.data);
				
				//Transform and Homogenize v
				v = Matrix.mult(PCinvO, v);
				v = Matrix.homogenize(v);
				
				//Ignore the z-coordinate, and add to the tally of points
				Point xy = new Point(v.getEntry(0), v.getEntry(1));
				points.add(xy);
			}
			
			drawBetween.addAll(sd.ifs.drawBetween);
		}
		
		
		Canvas c = new Canvas (points, drawBetween);
		c.pixels = new boolean[xRes+1][yRes+1];
		c.draw2d(xRes, yRes);
		
		Canvas.ppmGen(c.pixels, xRes, yRes);
	}
	
}
