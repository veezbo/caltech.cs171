package homework2;

import homework1.Matrix;

import org.apache.commons.math3.linear.*;

public class TransformData {
	
	public Triple translation;
	public Quadruple rotation;
	public Triple scaleFactor;
	
	public RealMatrix R, S;
	public RealMatrix TRS;
	
	public TransformData(Triple $translation, Quadruple $rotation, Triple $scaleFactor) {
		translation = $translation;
		rotation = $rotation;
		scaleFactor = $scaleFactor;
		
		calculateTRS();
	}
	
	public void calculateTRS() {
		RealMatrix T = Matrix.createIdentityMatrix44(),
				   R = Matrix.createIdentityMatrix44(),
				   S = Matrix.createIdentityMatrix44();
		
		if (translation != null) {
			T = Matrix.createTranslationMatrix(translation.data);
		}
		else {
			translation = new Triple (0, 0, 0);
		}
		if (rotation != null) {
			R = Matrix.createRotationMatrix(rotation.data);
		}
		else {
			rotation = new Quadruple (0, 0, 0, 0);
		}
		if (scaleFactor != null) {
			S = Matrix.createScaleFactorMatrix(scaleFactor.data);
		}
		else {
			scaleFactor = new Triple (1, 1, 1);
		}
		
		this.R = R;
		this.S = S;
		//TRS = Matrix.mult(T, Matrix.mult(R, S));
		TRS = Matrix.mult(S, Matrix.mult(R, T));
	}
	
}
