package homework1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Canvas {
	
	ArrayList<Point> points;
	ArrayList<Boolean> drawBetween;
	int size;
	public boolean[][] pixels;
	
	public Canvas() {
		points = new ArrayList<Point>();
		drawBetween = new ArrayList<Boolean>();
		size = 0;
	}
	
	public Canvas(ArrayList<Point> $points, ArrayList<Boolean> $drawBetween) {
		points = $points;
		size = $points.size();
		drawBetween = $drawBetween;
	}
	
	public void addPolygon (ArrayList<Point> pts) {
		int ptssize = pts.size();
		for (int i = 0; i < ptssize; i++) {
			points.add(pts.get(i));
			if (i!=0) {
				drawBetween.add(true);
			}
		}
		drawBetween.add(false);
		size = points.size();
	}
	
	//returns values in the format [xmin, xmax, ymin, ymax]
	//only called locally to generate the scaling factors to convert between original point locations and pixel locations
	private double[] findxyextrema() {
		double xmin=Double.MAX_VALUE, xmax=Double.MIN_VALUE, ymin=Double.MAX_VALUE, ymax=Double.MIN_VALUE;
		for (int i = 0; i < size; i++){ 
			double x=points.get(i).x, y=points.get(i).y;
			if (x < xmin) xmin = x;
			if (x > xmax) xmax = x;
			if (y < ymin) ymin = y;
			if (y > ymax) ymax = y;
		}
		double[] returnVals = {xmin, xmax, ymin, ymax};
		return returnVals;
	}
	
	//the only accessible draw2d that accepts the image resolution as parameter
	//assumes that the current Canvas object has a saved list of points and drawBetweens
	public void draw2d(int xRes, int yRes) {
		double[] extrema = findxyextrema();
		draw2d(extrema[0], extrema[1], extrema[2], extrema[3], xRes, yRes);
	}
	
	//maps the original locations to pixel locations and calls the next draw method
	private void draw2d(double xmin, double xmax, double ymin, double ymax, int xRes, int yRes) {
		
		double x1, y1, x2, y2;
		
		x1 = points.get(0).x;
		y1 = points.get(0).y;
		for (int i = 1; i < size; i++) {
			
			x2 = points.get(i).x;
			y2 = points.get(i).y;
			
			//basically, if we are not supposed to draw a line between points i-1 and i, then do not
			if (!drawBetween.get(i-1)) {
				x1 = x2;
				y1 = y2;
				continue;
			}
			
			//maps according to this rule: (xmin, ymin) -> (0, 0) and (xmax, ymax) -> (xRes, yRes)
			//ensure that x2 > x1, or that x2 = x1 and y2 > y1 by switching the order of the points
			if (x2 > x1) {
				drawLine((x1-xmin)*(xRes/(xmax-xmin)), (y1-ymin)*(yRes/(ymax-ymin)), (x2-xmin)*(xRes/(xmax-xmin)), (y2-ymin)*(yRes/(ymax-ymin)));
			}
			else if (x2 == x1 && y2 > y1) {
				drawLine((x1-xmin)*(xRes/(xmax-xmin)), (y1-ymin)*(yRes/(ymax-ymin)), (x2-xmin)*(xRes/(xmax-xmin)), (y2-ymin)*(yRes/(ymax-ymin)));
			}
			else {
				drawLine((x2-xmin)*(xRes/(xmax-xmin)), (y2-ymin)*(yRes/(ymax-ymin)), (x1-xmin)*(xRes/(xmax-xmin)), (y1-ymin)*(yRes/(ymax-ymin)));
			}
			x1 = x2;
			y1 = y2;
		}
		
	}
	
	//makes the proper substitutions to ensure that the slope is between 0 and 1, while preserving x2 > x1...
	//...and keeping track of those changes so we can use Bresenham's algorithm, and undo the substitution
	private void drawLine(double $x1, double $y1, double $x2, double $y2) {
		
		//the parameters should almost be integers already for large resolutions
		int x1 = (int) Math.round($x1), y1= (int) Math.round($y1), x2 = (int) Math.round($x2), y2 = (int) Math.round($y2);
		
		boolean invert = false, reflect = false;
		int dx = x2-x1, dy = y2-y1;
		
		//check to see if |slope| > 1. If so, we need to substitute x for y and y for x (invert them).
		if (Math.abs(dx) < Math.abs(dy)) {
			invert = true;
		}
		//check to see if slope < 0. If so, we need to substitute -y for y.
		if (dy < 0) {
			reflect = true;
		}
		
		//now we act on the booleans we found before (to ensure the slope is between 0 and 1)
		if (invert) {
			if (reflect) {
				//original slope is less than -1
				drawBresenhamLine(y1*-1, x1, y2*-1, x2, invert, reflect);
			}
			else {
				//original slope is greater than 1
				drawBresenhamLine(y1, x1, y2, x2, invert, reflect);
			}
		}
		
		else if (reflect) {
			//original slope is between -1 and 0
			drawBresenhamLine(x2*-1, y2, x1*-1, y1, invert, reflect);
		}
		
		else {
			//original slope is between 0 and 1
			drawBresenhamLine(x1, y1, x2, y2, invert, reflect);
		}
	}
	
	//takes in two points to run Bresenham's Algorithm on...
	//...the pixels to be colored are saved in this instance's 2d pixel array (grid)
	//"invert" and "reflect" indicate substitutions, and the reverse substitution is made to draw the correct pixel
	private void drawBresenhamLine(int x1, int y1, int x2, int y2, boolean invert, boolean reflect) {
		
		int y = y1, dy = y2 - y1, dxdy = y2-y1+x1-x2, F = dxdy;
		
		for (int x = x1; x <= x2; x++) {
			
			//make the proper reverse substitution
			if (invert) {
				if (reflect) {
					drawPixel(y, x*-1);
				}
				else {
					drawPixel(y, x);
				}
			}
			else if (reflect) {
				drawPixel(x*-1, y);
			}
			else {
				drawPixel(x, y);
			}
			
			if (F < 0) {
				F+=dy;
			}
			
			else {
				y++;
				F+=dxdy;
			}
			
		}
		
	}
	
	//basically accesses the stored pixels grid/array and sets a particular pixel to true...
	//indicating that it should be turned white (so it is "drawn")
	private void drawPixel(int x, int y) {
		pixels[x][y] = true;
	}
	
	//takes a 2D boolean array/grid, indicating whether each pixel is black or white..
	//and prints it out in PPM format to a file called output.ppm
	public static void ppmGen(boolean[][] grid, int xRes, int yRes) throws IOException {
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.ppm")));
		
		out.println("P3");
		out.println((xRes+1) + " " + (yRes+1)); //the dimensions are actually one more than xRes and yRes each
		out.println("255\n");
		
		//looping through the y's first because arrays are silly and we need to rotate the grid
		//so it's natural...
		for (int y = 0; y <= yRes; y++) {
			for (int x = 0; x <= xRes; x++) {
				boolean check = grid[x][y];
				if (check) {
					out.println("255 255 255"); //print a white pixel
				}
				else {
					out.println("0 0 0"); //print a black pixel
				}
					
			}
		}
		
		out.close();
		
	}
}
