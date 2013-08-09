package homework2;

import java.util.Arrays;

/*
 * Generic class to hold 4 data points
 */
public class Quadruple {

	public double[] data = new double[4];
	
	public Quadruple (double a, double b, double c, double d) {
		data[0] = a;
		data[1] = b;
		data[2] = c;
		data[3] = d;
	}
	
	public Quadruple (double[] d) {
		data[0] = d[0];
		data[1] = d[1];
		data[2] = d[2];
		data[3] = d[3];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(data);
	}
	
	public Quadruple mult(double d) {
		return new Quadruple(data[0]*d, data[1]*d, data[2]*d, data[3]*d);
	}
	
	public Quadruple add(Quadruple other) {
		return new Quadruple (data[0]+other.data[0], data[1]+other.data[1], data[2]+other.data[2], data[3]+other.data[3]);
	}
	
	//Operator Overloading in Java is not a thing
	//I'm sad, Tuna
	public static Quadruple mult(Quadruple a, double d) {
		return new Quadruple(a.data[0]*d, a.data[1]*d, a.data[2]*d, a.data[3]*d);
	}
	public static Quadruple add(Quadruple a, Quadruple b) {
		return new Quadruple (a.data[0]+b.data[0], a.data[1]+b.data[1], a.data[2]+b.data[2], a.data[3]+b.data[3]);
	}
	public static Quadruple add(Quadruple a, Quadruple b, Quadruple c, Quadruple d) {
		return add(add(add(c, d), b), a);
	}
}
