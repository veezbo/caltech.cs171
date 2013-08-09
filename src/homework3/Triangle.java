package homework3;

import java.util.ArrayList;

/*
 * Basically a generic class that holds 3 vertices
 */
public class Triangle {
	
	ArrayList<Vertex> verts;
	Vertex v1, v2, v3;
	
	public Triangle(ArrayList<Vertex> verts) {
		this.verts = verts;
		v1 = verts.get(0);
		v2 = verts.get(1);
		v3 = verts.get(2);
	}
	
	public Triangle(Vertex v1, Vertex v2, Vertex v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		verts = new ArrayList<Vertex>(3);
		verts.add(v1);
		verts.add(v2);
		verts.add(v3);
	}
}
