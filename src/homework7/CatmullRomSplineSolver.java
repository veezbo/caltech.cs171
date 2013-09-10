package homework7;

import homework2.Quadruple;
import homework2.Triple;

public class CatmullRomSplineSolver {

	final double tension;

	int numFrames;
	int numKeyFrames;
	Keyframes keyframes;

	//Translation Data
	Triple[] locFrames;

	//Rotation Data
	Quadruple[] rotFrames;

	//Scaling Data
	Triple[] scaleFrames;

	public CatmullRomSplineSolver (int numFrames, Keyframes keyframes, double tension) {
		this.numFrames = numFrames;
		this.numKeyFrames = keyframes.size();
		this.locFrames = new Triple[numFrames];
		this.rotFrames = new Quadruple[numFrames];
		this.scaleFrames = new Triple[numFrames];
		this.keyframes = keyframes;
		this.tension = tension;
		
		generateTranslationFrames();
		generateRotationFrames();
		generateScaleFrames();
	}

	public Triple getFrameLoc(int i) {
		return locFrames[i];
	}
	public Quadruple getFrameRot(int i) {
		return rotFrames[i];
	}
	public Triple getFrameScale(int i) {
		return scaleFrames[i];
	}

	private void generateTranslationFrames() {
		for (int i = 0; i < numKeyFrames-1; i++) {
			Keyframe k0, k1, k2, k3;
			if (i==0) {
				k0 = keyframes.get(numKeyFrames-1);
				k1 = keyframes.get(i);
			}
			else {
				k0 = keyframes.get(i-1);
				k1 = keyframes.get(i);
			}
			if (i==numKeyFrames-2) {
				k2 = keyframes.get(i+1);
				k3 = keyframes.get(i+1);
			}
			else {
				k2 = keyframes.get(i+1);
				k3 = keyframes.get(0);
			}
			
			Triple p0 = k0.translation;
			Triple p1 = k1.translation;
			Triple p2 = k2.translation;
			Triple p3 = k3.translation;
			
			int keyStart = k1.frameNumber;
			int keyEnd = k2.frameNumber;
			
			double du = 1. / (double) (keyEnd - keyStart);
			double u = 0;
			for (int j = keyStart; j <= keyEnd; j++) {
				//splining equation taken from catmullRomSpline paper
				locFrames[j] = Triple.add(p1, 
										  Triple.mult(Triple.add(Triple.mult(p0, -1*tension), Triple.mult(p2, tension)), u),
										  Triple.mult(Triple.add(Triple.mult(p0, 2*tension), Triple.mult(p1, tension-3), Triple.mult(p2, 3-2*tension), Triple.mult(p3, -1*tension)), u*u),
										  Triple.mult(Triple.add(Triple.mult(p0, -1*tension), Triple.mult(p1, 2-tension), Triple.mult(p2, tension-2), Triple.mult(p3, tension)), u*u*u)
										  );
				u+=du;
			}
		}
		Keyframe finalframe = keyframes.get(numKeyFrames - 1);
		for (int j = finalframe.frameNumber; j < numFrames; j++) {
			locFrames[j] = finalframe.translation;
		}
	}

	private void generateRotationFrames() {
		for (int i = 0; i < numKeyFrames-1; i++) {
			//get the relevant keyframes
			Keyframe k0, k1, k2, k3;
			if (i==0) {
				k0 = keyframes.get(numKeyFrames-1);
				k1 = keyframes.get(i);
			}
			else {
				k0 = keyframes.get(i-1);
				k1 = keyframes.get(i);
			}
			if (i==numKeyFrames-2) {
				k2 = keyframes.get(i+1);
				k3 = keyframes.get(i+1);
			}
			else {
				k2 = keyframes.get(i+1);
				k3 = keyframes.get(0);
			}
			
			//access the relevant data (in this case, rotation 4-vector)
			Quadruple p0 = k0.rotation;
			Quadruple p1 = k1.rotation;
			Quadruple p2 = k2.rotation;
			Quadruple p3 = k3.rotation;
			
			int keyStart = k1.frameNumber;
			int keyEnd = k2.frameNumber;
			
			double du = 1. / (double) (keyEnd - keyStart);
			double u = 0;
			for (int j = keyStart; j <= keyEnd; j++) {
				//splining equation taken from catmullRomSpline paper
				Quadruple ipl = Quadruple.add(p1, 
	  										Quadruple.mult(Quadruple.add(Quadruple.mult(p0, -1*tension), Quadruple.mult(p2, tension)), u),
	  										Quadruple.mult(Quadruple.add(Quadruple.mult(p0, 2*tension), Quadruple.mult(p1, tension-3), Quadruple.mult(p2, 3-2*tension), Quadruple.mult(p3, -1*tension)), u*u),
	  										Quadruple.mult(Quadruple.add(Quadruple.mult(p0, -1*tension), Quadruple.mult(p1, 2-tension), Quadruple.mult(p2, tension-2), Quadruple.mult(p3, tension)), u*u*u)
								);
				//rotFrames[j] = new Quadruple(Matrix.getVectorArray(Matrix.normalize(Matrix.createVector(ipl.data))));
				//determined that you don't have to normalize the previous vector (quadruple)
				rotFrames[j] = ipl;
				u+=du;
			}
		}
		Keyframe finalframe = keyframes.get(numKeyFrames - 1);
		for (int j = finalframe.frameNumber; j < numFrames; j++) {
			rotFrames[j] = finalframe.rotation;
		}
	}

	private void generateScaleFrames() {
	    for (int i = 0; i < numKeyFrames-1; i++) {
			Keyframe k0, k1, k2, k3;
			if (i==0) {
				k0 = keyframes.get(numKeyFrames-1);
				k1 = keyframes.get(i);
			}
			else {
				k0 = keyframes.get(i-1);
				k1 = keyframes.get(i);
			}
			if (i==numKeyFrames-2) {
				k2 = keyframes.get(i+1);
				k3 = keyframes.get(i+1);
			}
			else {
				k2 = keyframes.get(i+1);
				k3 = keyframes.get(0);
			}
			
			Triple p0 = k0.scale;
			Triple p1 = k1.scale;
			Triple p2 = k2.scale;
			Triple p3 = k3.scale;
			
			int keyStart = k1.frameNumber;
			int keyEnd = k2.frameNumber;
			
			double du = 1. / (double) (keyEnd - keyStart);
			double u = 0;
			for (int j = keyStart; j <= keyEnd; j++) {
				//splining equation taken from catmullRomSpline paper
				scaleFrames[j] = Triple.add(p1, 
										    Triple.mult(Triple.add(Triple.mult(p0, -1*tension), Triple.mult(p2, tension)), u),
										    Triple.mult(Triple.add(Triple.mult(p0, 2*tension), Triple.mult(p1, tension-3), Triple.mult(p2, 3-2*tension), Triple.mult(p3, -1*tension)), u*u),
										    Triple.mult(Triple.add(Triple.mult(p0, -1*tension), Triple.mult(p1, 2-tension), Triple.mult(p2, tension-2), Triple.mult(p3, tension)), u*u*u)
										  );
				u+=du;
			}
		}
		Keyframe finalframe = keyframes.get(numKeyFrames - 1);
		for (int j = finalframe.frameNumber; j < numFrames; j++) {
			scaleFrames[j] = finalframe.scale;
		}
	}

}
