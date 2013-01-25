package homework3;

import java.util.ArrayList;

public class Polygon {
	
	public ArrayList<Triangle> triangles = new ArrayList<Triangle>();
	
	private ArrayList<Vertex> verts = new ArrayList<Vertex>();
	
	public Polygon(ArrayList<Vertex> verts) {
		this.verts = verts;
		triangulate();
	}
	
	//the additional boolean parameter exists to differentiate between the two constructors
	public Polygon(ArrayList<Triangle> triangles, boolean useless) {
		this.triangles = triangles;
	}
	
	public void triangulate() {
		int size = verts.size();
		Vertex pivot = verts.get(0);
			
		for (int i = 2; i < size; i++) {
			triangles.add(new Triangle(pivot, verts.get(i-1), verts.get(i)));
		}
	}
}
