package homework2;

import java.util.ArrayList;

public class Coordinate3Data {
	
	public ArrayList<Triple> points = new ArrayList<Triple>();
	
	public Coordinate3Data(ArrayList<Triple> pts) {
		points = pts;
	}
	
	public void add(Triple t) {
		points.add(t);
	}
	
}
