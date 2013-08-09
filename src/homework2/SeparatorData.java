package homework2;

import homework1.Matrix;

import java.util.ArrayList;
import org.apache.commons.math3.linear.*;

/*
 * Holds all of the transformation data, coordinate points, and indices in a particular separator block. 
 * Preprocessing done to calculate the overall transform (which is the product of all sets of transforms in this block)
 */
public class SeparatorData {
	ArrayList<TransformData> tds;
	Coordinate3Data cd;
	IndexedFaceSetData ifs;
		
	RealMatrix O;
	
	public SeparatorData(ArrayList<TransformData> $tds, Coordinate3Data $cd, IndexedFaceSetData $ifs) {
		tds = $tds;
		cd = $cd;
		ifs = $ifs;
		
		createO();
	}
	
	public void createO() {
		int size = tds.size();
		RealMatrix o = Matrix.createIdentityMatrix44();
		for (int i = size - 1; i >= 0; i--) {
			o = Matrix.mult(tds.get(i).TRS, o);
			//o = Matrix.mult(o, tds.get(i).TRS);
		}
		O = o;
	}
	
}
