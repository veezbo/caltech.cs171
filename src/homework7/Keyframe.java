package homework7;

import homework2.Quadruple;
import homework2.Triple;

public class Keyframe {
	
	Triple translation;
	Quadruple rotation;
	Triple scale;
	
	int frameNumber;
	
	public Keyframe(Triple translation, Triple scale, Quadruple rotation,int frameNumber) {
		this.translation = translation;
		this.rotation = rotation;
		this.scale = scale;
		this.frameNumber = frameNumber;
	}
	
	
	
}
