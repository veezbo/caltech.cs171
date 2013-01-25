package homework2;

import homework1.Matrix;

import java.util.ArrayList;
import org.apache.commons.math3.linear.*;

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
		}
		O = o;
	}
	
}
