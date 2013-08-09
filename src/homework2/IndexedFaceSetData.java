package homework2;

import java.util.ArrayList;

/*
 * Class to hold indices set read in. Preprocessing done to indicate whether we draw between two points or not
 */
public class IndexedFaceSetData {
	ArrayList<Integer> indices = new ArrayList<Integer>();
	ArrayList<Boolean> drawBetween = new ArrayList<Boolean>();
	
	private int firstFaceIndex = -1;
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
	}
}
