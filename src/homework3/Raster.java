package homework3;

import java.util.ArrayList;

import homework1.Matrix;
import homework2.Triple;

public class Raster {
	
	public static class RasterCoord {
		public int x, y;
		public RasterCoord (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static float windowXMin, windowXMax, windowYMin, windowYMax;
	static int xRes, yRes;
	
	public static void initDraw(float xMin, float xMax, float yMin, float yMax, int xr, int yr) {
		windowXMin = xMin;
		windowXMax = xMax;
		windowYMin = yMin;
		windowYMax = yMax;
		xRes = xr;
		yRes = yr;
	}
	
	static int getPixelX (float x) {
	    return (int)((x - windowXMin) / (windowXMax - windowXMin) * xRes);
	}
	static int getPixelY (float y) {
		return (int)((y - windowYMin) / (windowYMax - windowYMin) * yRes);
	}
		
	static int f (RasterCoord vert0, RasterCoord vert1, int x, int y) {
		int x0 = vert0.x;
		int y0 = vert0.y;
		int x1 = vert1.x;
		int y1 = vert1.y;
		return (y0 - y1) * x + (x1 - x0) * y + x0 * y1 - x1 * y0;
	}
	
	
	public static ArrayList<Vertex> raster (Vertex[] verts, Canvas c, int n) {
	    int xMin, xMax, yMin, yMax;
	    
	    // Sufficiently small and large, respectively
	    xMin = xRes + 1; yMin = yRes + 1;
	    xMax = yMax = -1;
	   
	    RasterCoord[] coords = new RasterCoord[3];
	    
	    for (int i = 0; i < 3; i++) {
	    	coords[i] = new RasterCoord(getPixelX(verts[i].data[0]), getPixelY(verts[i].data[1]));
	    }
	    
	    // find the bounding box
	    for (int i = 0; i < 3; i++) {
	        if (coords[i].x < xMin)
	            xMin = coords[i].x;
	        if (coords[i].y < yMin)
	            yMin = coords[i].y;
	        if (coords[i].x > xMax)
	            xMax = coords[i].x;
	        if (coords[i].y > yMax)
	            yMax = coords[i].y;
	    }
	    
	    float fAlpha, fBeta, fGamma;
	    
	    fAlpha = f(coords[1], coords[2], coords[0].x, coords[0].y);
	    fBeta = f(coords[2], coords[0], coords[1].x, coords[1].y);
	    fGamma = f(coords[0], coords[1], coords[2].x, coords[2].y);
	    
	    // check for zero denominators. if found, these indicate a degenerate
		// triangle which should not be drawn, so just return.
	    if(Math.abs(fAlpha) < .0001 || Math.abs(fBeta) < .0001 || Math.abs(fGamma) < .0001)
			return null;
	    
	    //only used for phong-shading
	    ArrayList<Vertex> ps = new ArrayList<Vertex>();
	    
	    // go over every pixel in the bounding box
	    for (int y = (int)((yMin > 0) ? yMin : 0); y < yMax && y < yRes; y++) {
	        for (int x = (int)((xMin > 0) ? xMin : 0); x < xMax && x < xRes; x++) {
	            
	            // calculate the pixel's barycentric coordinates
	            float alpha = f(coords[1], coords[2], x, y) / fAlpha;
	            float beta = f(coords[2], coords[0], x, y) / fBeta;
	            float gamma = f(coords[0], coords[1], x, y) / fGamma;
	            
	            // if the coordinates are positive, do the next check
	            if (alpha >= 0 && beta >= 0 && gamma >= 0) {
	                    // create storage to send interpolated data
	                    int numData = verts[0].numData;
	                    float[] data = new float[numData];
	                    
	                    // interpolate all data
	                    for (int i = 0; i < numData; i++) {
	                        data[i] = (alpha * verts[0].data[i] +
	                                   beta * verts[1].data[i] +
	                                   gamma * verts[2].data[i]);
	                    }
	                    
	                    //and finally, draw the pixel as needed, dependent on the type of shading
	                    if (n==0) {
	                    	c.drawPixel(x, y, data[2], verts[0].rgb);
	                    }
	                    
	                    if (n==1) {
	                    	c.drawPixel(x, y, data[2], new Triple (data[3], data[4], data[5]));
	                    }
	                    
	                    if (n==2) {
	                    	Vertex add = new Vertex (x, y, data[2]);
	                    	add.norm = Matrix.createHomogenizedVector(new double[] { data[3], data[4], data[5] });
	                    	add.location = Matrix.createHomogenizedVector(new double[] { data[0], data[1], data[2] });
	                    	ps.add(add);
	                    }
	                    
	            }
	        }
	    }
	    return ps;
	}
}
