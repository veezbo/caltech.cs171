package homework3;

import homework2.Triple;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * A more reasonable Canvas class, that only draws individual pixels, and then overall generates the ppm based
 * on those pixels
 */
public class Canvas {
	
	Vertex[][] grid;
	int xRes, yRes;
	
	public Canvas (int xRes, int yRes) {
		this.xRes = xRes;
		this.yRes = yRes;
		grid = new Vertex[xRes+1][yRes+1];
	}
	
	private static int toIntColor(double c) {
		return (int) (c * 255);
	}
	public static void ppmGen(Vertex[][] grid, int xRes, int yRes) throws IOException {
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.ppm")));

		out.println("P3");
		out.println((xRes+1) + " " + (yRes+1)); //the dimensions are actually one more than xRes and yRes each
		out.println("255\n");
		
		//looping through the y's first because arrays are silly and we need to rotate the grid
		//so it's natural...
		for (int y = 0; y <= yRes; y++) {
			for (int x = 0; x <= xRes; x++) {
				Vertex pixel = grid[x][y];
				if (pixel == null) {
					out.println("0 0 0"); //print out a black pixel if nothing saved
					continue;
				}
				double[] rgb = pixel.rgb.data;
				int r = toIntColor(rgb[0]), g = toIntColor(rgb[1]), b = toIntColor(rgb[2]);
				out.println(r + " " + g + " " + b + " "); //print based on the data provided by the pixel in the grid
			}
		}
		
		out.close();

	}
	
	/* public void drawPixel(int x, int y, float[] data) {
		int size = data.length;
		if (size==3) drawFlatPixel(x, y, data[2]);
	} */
	
	public void drawPixel(int x, int y, float z, Triple rgb) {
		Vertex compare = grid[x][y];
		Vertex v = new Vertex(x, y, z);
		v.rgb = rgb;
		
		if (compare != null) {
			double zz = compare.z;
			if (z < zz) {
				grid[x][y] = v;
			}
		}
		else {
			grid[x][y] = v;
		}
	}
	
	/*public void drawPixel(Vertex v) {
		int x = (int) v.location.getEntry(0), y = (int) v.location.getEntry(1), z = (int) v.location.getEntry(2); 
		Vertex compare = grid[x][y];
		if (compare != null){
			int zz = (int) compare.location.getEntry(2);
			if (z < zz) {
				grid[x][y] = v;
			}
		}
	} */
	
}
