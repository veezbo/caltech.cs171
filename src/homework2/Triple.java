package homework2;

import java.util.Arrays;

/*
 * Generic class to hold 3 data points
 */
public class Triple {
	
	public double[] data = new double[3];
	
	public Triple(double a, double b, double c) {
		data[0] = a;
		data[1] = b;
		data[2] = c;
	}
	
	public Triple(double[] d) {
		data[0] = d[0];
		data[1] = d[1];
		data[2] = d[2];
	}
	
	public Triple mult(double d) {
		return new Triple(data[0]*d, data[1]*d, data[2]*d);
	}
	
	public Triple add(Triple other) {
		return new Triple(data[0] + other.data[0], data[1] + other.data[1], data[2] + other.data[2]);
	}

	@Override
	public String toString() {
		return Arrays.toString(data);
	}
	
	public static Triple mult (Triple a, double d) {
		return new Triple(a.data[0]*d, a.data[1]*d, a.data[2]*d);
	}
	
	public static Triple add (Triple a, Triple b) {
		return new Triple(a.data[0]+b.data[0], a.data[1]+b.data[1], a.data[2]+b.data[2]);
	}
	
	public static Triple add(Triple a, Triple b, Triple c, Triple d) {
		return Triple.add(add(Triple.add(c, d), b), a);
	}
}
