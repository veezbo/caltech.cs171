package homework3;

import homework2.Triple;

/*
 * Holds all the ObjectData read in from the file
 */
public class MaterialData {
	public Triple ambientColor = new Triple (.2, .2, .2);
	public Triple diffuseColor = new Triple (.8, .8, .8);
	public Triple specularColor = new Triple (0, 0, 0);
	public double shininess = 0.2;
	
	public MaterialData(Triple ambientColor, Triple diffuseColor, Triple specularColor, double shininess) {
		if (ambientColor != null) {
			this.ambientColor = ambientColor;
		}
		if (diffuseColor != null) {
			this.diffuseColor = diffuseColor;
		}
		if (specularColor != null) {
			this.specularColor = specularColor;
		}
		if (shininess != 0) {
			this.shininess = shininess;
		}
	}
}
