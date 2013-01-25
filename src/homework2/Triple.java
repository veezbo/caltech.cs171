package homework2;

import java.util.Arrays;

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

	@Override
	public String toString() {
		return Arrays.toString(data);
	}
}
