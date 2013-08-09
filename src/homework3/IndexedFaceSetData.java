package homework3;

import java.util.ArrayList;

/*
 * A more reasonable class that holds all the indices, and the normal indices as well
 * Also, doesn't calculate the drawBetween because that's silly
 */
public class IndexedFaceSetData {
	public ArrayList<Integer> indices = new ArrayList<Integer>();
	//public ArrayList<Boolean> drawBetween = new ArrayList<Boolean>();
	public ArrayList<Integer> nindices = new ArrayList<Integer>();
	
	public IndexedFaceSetData() {} // the actual constructor used
	
	public IndexedFaceSetData(ArrayList<Integer> indices, ArrayList<Integer> nindices) {
		this.indices = indices;
		this.nindices = nindices;
	}
	
	public void add(int i) {
		indices.add(i);
	}
	
	/* private int firstFaceIndex = -1;
	private boolean previousNegative = false;
	public void add(int i) {
		if (i == -1) {
			//Add the first face element back in
			indices.add(indices.get(firstFaceIndex));
			drawBetween.add(true);
			
			//Do not draw a line between this point and the next
			drawBetween.add(false);
			
			previousNegative = true;
		}
		else {
			int size = indices.size();
			if (size == 0 || previousNegative) {
				firstFaceIndex = size;
				indices.add(i);
				previousNegative = false;
			}
			else {
				indices.add(i);
				drawBetween.add(true);
			}
		}
	} */
	
	public void addNormalIndices (ArrayList<Integer> nindices) {
		this.nindices = nindices;
	}
}
