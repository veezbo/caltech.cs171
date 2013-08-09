package homework5;

import homework1.Point;

import java.util.ArrayList;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;


public class NURBSEditor implements GLEventListener {
	
	GLCanvas canvas;
	GLU glu;
	
	ArrayList<Double> t = new ArrayList<Double>();
	ArrayList<Point> P = new ArrayList<Point>();
	final double du = 0.0005;
	final int xRes, yRes;
	
	//private double x, y;
	
	//Parallel ArrayLists that hold the values of the drawnNurb pixels
	ArrayList<Point> drawnNurbs = new ArrayList<Point>();
	ArrayList<Double> uvals = new ArrayList<Double>();
		
	public NURBSEditor(int xRes, int yRes, GLCanvas canvas) {
		this.xRes = xRes;
		this.yRes = yRes;
		
		final double DUMMY = -1.;
		t.add(DUMMY);
		P.add(new Point(DUMMY, DUMMY));
		
		t.add(0.); t.add(0.); t.add(0.); t.add(0.);
		t.add(1.); t.add(1.); t.add(1.); t.add(1.);
		P.add(new Point(-0.5, 0.5)); P.add(new Point(-0.5, -0.5));
		P.add(new Point(0.5, -0.5)); P.add(new Point(0.5, 0.5));
		
		this.canvas = canvas;
	}
	
	public void coxDeBoor () {
	
		drawnNurbs.clear();
		uvals.clear();
		
		int n = P.size() - 1;
		for (double u = 0.; u <= 1.; u+=du) {
			
			//1-index to parallel the paper
			double N[][] = new double[n+1][5];
			
			//Set up k=1
			for (int i = 1; i <= n; i++) {
				if (t.get(i) <= u && t.get(i+1) > u) {
					N[i][1] = 1.;
				}
				else {
					N[i][1] = 0.;
				}
			}
			
			//Recurse through k=2, 3, 4
			for (int k = 2; k <= 4; k++) {
				for (int i = 1; i <= n; i++) {
					double term1 = ((u - t.get(i)) * N[i][k-1]);
					double term2 = (t.get(i+k-1) - t.get(i));
					double term3;
					if (i+1>n) {
						term3 = 0;
					}
					else {
						term3 = ((t.get(i+k) - u) * N[i+1][k-1]);
					}
					double term4 = (t.get(i+k) - t.get(i+1));
					
					//account for the fact that 0/0 = 0
					if (term1==0 && term2==0) 
						if (term3==0 && term4==0) N[i][k] = 0;
						else N[i][k] = term3/term4;
					else if (term3==0 && term4==0) N[i][k] = term1/term2;
					else N[i][k] = term1/term2 + term3/term4;
				}
			}
			
			Point linComb = new Point(0, 0);
			for (int i = 1; i <= n; i++) {
				linComb = Point.add(linComb, P.get(i).mult(N[i][4]));
			}
			
			drawnNurbs.add(linComb);
			uvals.add(u);
		}
		
	}
	
	private void clearScreen(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
	 	gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
	 	gl.glFlush();
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
	 	
	 	gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
	 	gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
	 	gl.glFlush();
	 	
	 	glu = new GLU();
	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
				
		this.clearScreen(drawable);
		this.coxDeBoor();
		
		drawSpline(drawable);
		displayPolyLine(drawable);
	}
		
	private void drawSpline(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
		
		int size = drawnNurbs.size();
		for (int i = 0; i < size; i++) {
			gl.glBegin(GL2.GL_POINTS);
			gl.glColor3d(1.0, 1.0, 1.0);
			gl.glVertex2d(drawnNurbs.get(i).x, drawnNurbs.get(i).y);
			gl.glEnd();
		}
	}
	
	private void displayPolyLine(GLAutoDrawable drawable) {
		
		final double SIZE = 0.02;
		
		GL2 gl = drawable.getGL().getGL2();
		
		int n = P.size() - 1;
		for (int i = 1; i <= n; i++) {
			gl.glBegin(GL2.GL_QUADS);
			gl.glColor3d(1.0, 1.0, 1.0);
			gl.glVertex2d(P.get(i).x - SIZE, P.get(i).y - SIZE);
			gl.glVertex2d(P.get(i).x - SIZE, P.get(i).y + SIZE);
			gl.glVertex2d(P.get(i).x + SIZE, P.get(i).y + SIZE);
			gl.glVertex2d(P.get(i).x + SIZE, P.get(i).y - SIZE);
			gl.glEnd();
			gl.glFlush();
		}
		
		for (int i = 1; i <= n-1; i++) {
			gl.glBegin(GL2.GL_LINES);
			gl.glVertex2d(P.get(i).x, P.get(i).y);
			gl.glVertex2d(P.get(i+1).x, P.get(i+1).y);
			gl.glEnd();
			gl.glFlush();
		}
		
	}
	
	//UNUSED METHODS
	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {}
	@Override
	public void dispose(GLAutoDrawable arg0) {}
}
