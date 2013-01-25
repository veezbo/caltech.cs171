package homework3;

import homework1.Matrix;
import homework2.Coordinate3Data;
import homework2.TransformData;

import java.util.ArrayList;
import org.apache.commons.math3.linear.*;

public class SeparatorData {
	public ArrayList<TransformData> tds;
	public Coordinate3Data cd;
	public IndexedFaceSetData ifs;
	public MaterialData md;
	public NormalData nd;
	
	RealMatrix O;
	RealMatrix tRSinv;
	
	public SeparatorData(ArrayList<TransformData> $tds, Coordinate3Data $cd, IndexedFaceSetData $ifs,
						 MaterialData $md, NormalData $nd) {
		tds = $tds;
		cd = $cd;
		ifs = $ifs;
		md = $md;
		nd = $nd;
		
		createO();
		createtRSinv();
	}
	
	public void createO() {
		int size = tds.size();
		RealMatrix o = Matrix.createIdentityMatrix44();
		for (int i = size - 1; i >= 0; i--) {
			o = Matrix.mult(tds.get(i).TRS, o);
		}
		O = o;
	}
	
	public void createtRSinv() {
		int size = tds.size();
		RealMatrix R = Matrix.createIdentityMatrix44();
		RealMatrix S = Matrix.createIdentityMatrix44();
		
		for (int i = size - 1; i >= 0; i--) {
			TransformData t = tds.get(i);
			R = Matrix.mult(t.R, R);
			S = Matrix.mult(t.S, S);
		}
		
		tRSinv = Matrix.transpose(Matrix.inverse(Matrix.mult(R, S)));
	}
	
}
