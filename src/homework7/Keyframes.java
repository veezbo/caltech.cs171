package homework7;

import java.util.ArrayList;

public class Keyframes {
	ArrayList<Keyframe> keyframes;
	int numFrames;
	double maxDist;
	
	public Keyframes(ArrayList<Keyframe> keyframes, int numFrames) {
		this.keyframes = keyframes;
		this.numFrames = numFrames;
		//this.maxDist = 
	}
	
	//TODO: Decide whether you need something like this to keep the I-bar in the viewing area
	@SuppressWarnings("unused")
	private double findMaxDist() {
		return -1.;
	}
	
	public Keyframe get(int i) {
		return keyframes.get(i);
	}
	
	public int size() {
		return keyframes.size();
	}
}
