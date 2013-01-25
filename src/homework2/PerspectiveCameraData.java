package homework2;

import homework1.Matrix;

import org.apache.commons.math3.linear.*;

public class PerspectiveCameraData {
	public Triple position;
	public Quadruple orientation;
	public double n, f, l, r, t, b;
	public RealMatrix Cinv;
	public RealMatrix P;
	
	public PerspectiveCameraData(Triple trip, Quadruple quad, 
			double nd, double fd, double left, double right, double top, double bottom) {
		
		position = trip;
		orientation = quad;
		
		n = nd;
		f = fd;
		l = left;
		r = right;
		t = top;
		b = bottom;
		
		RealMatrix T = Matrix.createTranslationMatrix(position.data);
		RealMatrix R = Matrix.createRotationMatrix(orientation.data);
		Cinv = Matrix.mult(Matrix.inverse(R), Matrix.inverse(T));
		
		P = Matrix.createPerspectiveProjection(l, r, b, t, n, f);
	}
	
}
