package homework3;

import org.apache.commons.math3.linear.RealVector;

import homework1.Matrix;
import homework2.Triple;

public class PointLightData {
	public Triple loc = new Triple (0, 0, 1);
	public Triple color = new Triple (1, 1, 1);
	
	public RealVector location;
	
	public PointLightData(Triple loc, Triple color) {
		if (loc != null) {
			this.loc = loc;
		}
		if (color != null) {
			this.color = color;
		}
		location = Matrix.createHomogenizedVector(loc.data);
	}
}
