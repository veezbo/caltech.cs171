package homework1;

import org.apache.commons.math3.linear.*;

public class HW1Part0Test {
	
	public static void main(String[] args) {
		
		double[][] dd = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		double[][] dd2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		double[][] dd3 = {{1, 5, 3}, {2, 4, 9}, {3, 4, 5}};
		
		RealMatrix m = Matrix.createMatrix(dd);
		RealMatrix m2 = Matrix.createMatrix(dd2);
		RealMatrix m3 = Matrix.createMatrix(dd3);
		
		double[] d = {4.3, 5.2, 1};
		double[] d2 = {1, 1, 1};
		RealVector v = Matrix.createVector(d);
		RealVector v2 = Matrix.createVector(d2);
		
		//Matrix*Matrix
		System.out.println(m + " * " + v + " = " + Matrix.mult(m, v));
		//Matrix*Vector
		System.out.println(m + " * " + m2 + " = " + Matrix.mult(m, m2) + "\n");
		
		//Dot Product
		System.out.println(v + " * " + v2 + " = " + Matrix.dotProduct(v, v2) + "\n");
		
		//Transpose
		System.out.println("transpose(" + m2 + ") = " + Matrix.transpose(m2) + "\n");
		
		//Inverse
		System.out.println(m3 + "^-1 = " + Matrix.inverse(m3));
		System.out.println(m3 + " * " + m3 + "^-1 = " + Matrix.mult(m3, Matrix.inverse(m3)) + "\n");
		
		//Addition
		System.out.println(v + " + " + v2 + " = " + Matrix.add(v, v2) + "\n");
		
		//Normalization
		System.out.println("normalize(" + v + ") = " + Matrix.normalize(v));
		System.out.println("normalize(" + v2 + ") = " + Matrix.normalize(v2));
		
		//Homogenization
		double[] d3 = {12, 6, 18, 4};
		RealVector v3 = Matrix.createVector(d3);
		System.out.println("homogenize(" + v3 + ") = " + Matrix.homogenize(v3));
	}
	
}
