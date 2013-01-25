package homework1;

import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.linear.*;

public abstract class Matrix {
	
	
	//Constructors
	public static RealMatrix createMatrix(int x, int y) {
		return new Array2DRowRealMatrix(x, y);
	}
	
	public static RealMatrix createMatrix(double[] v) {
		return new Array2DRowRealMatrix(v);
	}
	
	public static RealMatrix createMatrix(double[][] d) {
		return new Array2DRowRealMatrix(d);
	}
	
	public static RealMatrix createIdentityMatrix44() {
		double[][] data = {{1, 0, 0, 0},
						   {0, 1, 0, 0},
						   {0, 0, 1, 0},
						   {0, 0, 0, 1}};
		return Matrix.createMatrix(data);
	}
	
	public static RealVector createVector(int size) {
		return new ArrayRealVector(size);
	}
	
	public static RealVector createVector(double[] d) {
		return new ArrayRealVector(d);
	}
	
	public static RealVector createHomogenizedVector(double[] d) {
		int length = d.length;
		double[] dd = new double[length+1];
		for (int i = 0; i < length; i++) {
			dd[i] = d[i];
		}
		dd[length] = 1;
		
		return new ArrayRealVector(dd);
	}
	
	
	//Creating Transform Matrices
	public static RealMatrix createTranslationMatrix (double[] vals) {
		
		double[][] data = {{1, 0, 0, vals[0]},
						   {0, 1, 0, vals[1]},
						   {0, 0, 1, vals[2]},
						   {0, 0, 0, 1}};
		
		return Matrix.createMatrix(data);
		
	}
	
	public static RealMatrix createRotationMatrix(double[] vals) {
		
		RealVector rv = Matrix.createVector(vals);
		rv = Matrix.normalize(rv);
		vals = Matrix.getVectorArray(rv);
		double x=vals[0], y=vals[1], z=vals[2], th = vals[3];
		
		double[][] data = 
			{
				{x*x+(1-x*x)*Math.cos(th), x*y*(1-Math.cos(th))-z*Math.sin(th), x*z*(1-Math.cos(th))+y*Math.sin(th), 0},
				{x*y*(1-Math.cos(th))+z*Math.sin(th), y*y+(1-y*y)*Math.cos(th), y*z*(1-Math.cos(th))-x*Math.sin(th), 0},
				{x*z*(1-Math.cos(th))-y*Math.sin(th), y*z*(1-Math.cos(th))+x*Math.sin(th), z*z+(1-z*z)*Math.cos(th), 0},
				{0, 0, 0, 1}
			};
		
		return Matrix.createMatrix(data);
		
	}
	
	public static RealMatrix createScaleFactorMatrix(double[] vals) {
		
		double[][] data = {{vals[0], 0, 0, 0},
				   		   {0, vals[1], 0, 0},
				   		   {0, 0, vals[2], 0},
				   		   {0, 0, 0, 1}};
		
		return Matrix.createMatrix(data);
		
	}
	
	public static RealMatrix createPerspectiveProjection(double l, double r, double b, double t, double n, double f) {
		
		double[][] data = {{2*n/(r-l), 0,         (r+l)/(r-l),    0           },
						  {0,          2*n/(t-b), (t+b)/(t-b),    0           },
						  {0,          0,         -(f+n)/(f-n), -2*f*n/(f-n)},
						  {0,          0,         -1,             0           }};
		
		return Matrix.createMatrix(data);
		
	}
		
	
	//Get Methods
	public static double[][] getMatrixArray (RealMatrix a) {
		return a.getData();
	}
	
	public static double[] getVectorArray (RealVector a) {
		return a.toArray();
	}
	
	public static float[] getVectorFloatArray (RealVector a) {
		double[] arr = Matrix.getVectorArray(a);
		int size = arr.length;
		float[] f = new float[size];
		
		for (int i = 0; i < size; i++) {
			f[i] = (float) arr[i];
		}
		return f;
	}
	
	
	//Addition
	public static RealMatrix add(RealMatrix a, RealMatrix b) {
		return a.add(b);
	}
	
	public static RealVector add(RealVector a, RealVector b) {
		return a.add(b);
	}
	
	//Subtraction
	public static RealMatrix sub(RealMatrix a, RealMatrix b) {
		return a.subtract(b);
	}
	
	public static RealVector sub(RealVector a, RealVector b) {
		return a.subtract(b);
	}
	
	//Multiplication
	public static RealMatrix mult(RealMatrix a, RealMatrix b) {
		return a.multiply(b);
	}
	
	public static RealVector mult(RealMatrix a, RealVector b) {
		return a.operate(b);
	}
	
	public static RealVector mult(RealVector a, RealMatrix b) {
		return b.preMultiply(a);
	}
	
	public static RealMatrix mult(RealMatrix a, double d) {
		return a.scalarMultiply(d);
	}
	
	public static RealVector mult(RealVector a, double d) {
		return a.mapMultiply(d);
	}
	
	public static RealVector componentMult(RealVector a, RealVector b) {
		int dim = a.getDimension();
		double[] data = new double[dim];
		for (int i = 0; i < dim; i++) {
			data[i] = a.getEntry(i) * b.getEntry(i);
		}
		return Matrix.createVector(data);
	}
	
	
	//Dot Products
	public static double dotProduct(RealVector a, RealVector b) {
		return a.dotProduct(b);
	}
	
	//Cross Products
	public static RealVector crossProduct (RealVector x, RealVector y) {
		RealVector a = Matrix.createVector(new double[] {x.getEntry(0), x.getEntry(1), x.getEntry(2) });
		RealVector b = Matrix.createVector(new double[] {y.getEntry(0), y.getEntry(1), y.getEntry(2) });
		Vector3D v1 = new Vector3D (a.toArray());
		Vector3D v2 = new Vector3D (b.toArray());
		return Matrix.createVector(Vector3D.crossProduct(v1, v2).toArray());
	}
	
	//Normalization and Homogenization
	public static RealVector normalize (RealVector a) {
		return a.unitVector();
	}
	
	public static RealVector homogenize (RealVector a) {
		int dim = a.getDimension();
		double w = a.getEntry( (dim-1) );
		
		if (w==0) throw new ArithmeticException("Homogenous Coordinate is Zero!");
		return Matrix.mult(a, 1./w);
	}
	
	public static RealVector dehomogenize (RealVector a) {
		return Matrix.createVector(new double[] {a.getEntry(0), a.getEntry(1), a.getEntry(2) });
	}
	
	//Matrix Transposition
	public static RealMatrix transpose(RealMatrix a) {
		return a.transpose();
	}
	
	
	//Matrix Inverse
	public static RealMatrix inverse(RealMatrix a) {
		return new LUDecomposition(a).getSolver().getInverse();
	}
}
