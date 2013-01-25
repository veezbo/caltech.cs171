package homework3;

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

import homework1.Matrix;
import homework2.Triple;

public class Vertex {
	
	RealVector location;
	RealVector norm;
	
	public Triple rgb;
	
	float[] data;
	int numData;
	float x, y, z;
	
	public Vertex(Triple location, Triple norm) {
		this.location = Matrix.createHomogenizedVector(location.data);
		this.norm = Matrix.createHomogenizedVector(norm.data);
	}
	
	public Vertex(RealVector location, RealVector norm) {
		this.location = location;
		this.norm = norm;
	}
	
	public Vertex (float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Mutator Method
	public void transformToWorldSpace(RealMatrix O, RealMatrix tRSinv) {
		location = Matrix.mult(O, location);
		location = Matrix.homogenize(location);
		
		norm = Matrix.mult(tRSinv, norm);
		norm = Matrix.homogenize(norm);
	}
	
	public static Vertex avgVertex(Vertex a, Vertex b, Vertex c) {
		RealVector avgLocation = Matrix.mult(Matrix.add(a.location, Matrix.add(b.location, c.location)), 1/3.);
		RealVector avgNorm = Matrix.mult(Matrix.add(a.norm, Matrix.add(b.norm, c.norm)), 1/3.);
		
		return new Vertex (avgLocation, avgNorm);
	}
	
}
