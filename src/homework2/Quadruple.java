package homework2;

import java.util.Arrays;

public class Quadruple {

	public double[] data = new double[4];
	
	public Quadruple (double a, double b, double c, double d) {
		data[0] = a;
		data[1] = b;
		data[2] = c;
		data[3] = d;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(data);
	}
}
