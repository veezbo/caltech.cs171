package homework5redone;

import homework1.Point;

import java.awt.Frame;
import java.awt.event.*;
import java.util.ArrayList;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;


public class JOGLEventListener implements GLEventListener, KeyListener, MouseListener, MouseMotionListener {

	private GLCanvas canvas;
	private Frame frame;
	
	ArrayList<Double> t = new ArrayList<Double>();
	ArrayList<Point> P = new ArrayList<Point>();
	final double du = 0.0005;
	final int xRes, yRes;
	
	public JOGLEventListener (int xRes, int yRes, GLCanvas canvas, Frame frame) {
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
		this.frame = frame;
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private double parametrizeX(int x) {
		return (double) (x - ((double) xRes)/2.) / (((double) xRes) / 2.);
	}
	private double parametrizeY(int y) {
		return -1. * (double) (y - ((double)yRes)/2.) / (((double) yRes) / 2.);
	}
	
	int px, py;
	double X, Y;
	int clickedIndex = -1;
	
	@Override
	public void mousePressed(MouseEvent m) {

		//Process a right click
		if (m.getButton() == 3) {
			int n = P.size() - 1;
			ArrayList<Point> Pn = new ArrayList<Point>(n+2);
			
			for (int i = 1; i <= n; i++) {
				//What is the difference between control points and knots?
				//The assignment 
			}
		}
		
		//Process a left click
		else if (m.getButton() == 1) {
			px = m.getX();
			py = m.getY();
			X = parametrizeX(px);
			Y = parametrizeY(py);
			
			int n = P.size() - 1;
			
			//System.out.println(X + " " + Y);
			
			//check if the clicked portion is within the bounds of a control point
			for (int i = 1; i <= n; i++) {
				if (Math.abs(X - P.get(i).x) <= 0.02 && Math.abs(Y - P.get(i).y) <= 0.02) {
					clickedIndex = i;
					System.out.println("IN");
					return;
				}
			}
			System.out.println("OUT");
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent m) {

		//Check to see if the clicked point actually makes sense. If not, end.
		if (Math.abs(X) > 1.0001 || Math.abs(Y) > 1.0001) {
			return;
		}
		
		if (clickedIndex == -1) return;
		
		
		//We're going to assume there was some kind of a drag here if the previous clicked point is reasonable
		P.set( clickedIndex, new Point(parametrizeX(m.getX()), parametrizeY(m.getY())) );
		this.coxDeBoor();
		
		//Reset clickedIndex, px, py, X, and Y
		clickedIndex = -1;
		px = -1;
		py = -1;
		X = -5;
		Y = -5;
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == 27 || e.getKeyChar() == 'q' || e.getKeyChar() == 'Q')
			System.exit(0);		
	}

	public void coxDeBoor () {
		
		point = true;
		
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
			
			//System.out.println(linComb);
			x = linComb.x;
			y = linComb.y;
			canvas.display();
		}
		
		point = false;
		line = true;
		canvas.display();
		line = false;
		//canvas.display();
		
	}
	
	private double x, y;
	boolean point = false;
	boolean line = false;
	
	@Override
	public void display(GLAutoDrawable glDrawable) {
		
		if (point) {
			drawPoint(glDrawable);
		}
		if (line) {
			drawPolyLine(glDrawable);
		}
		if (point || line) return;
		
		clearScreen(glDrawable);
		
		drawPoint(glDrawable);
		drawPolyLine(glDrawable);
		
		
	}
	
	private void clearScreen(GLAutoDrawable glDrawable) {
		final GL gl = glDrawable.getGL();

        // first clear the screen
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // background is black
        gl.glClear(GL.GL_COLOR_BUFFER_BIT); // clear the window
        gl.glFlush();
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        /* canvas.destroy();
		GLProfile profile = GLProfile.get(GLProfile.GL2);
	    GLCanvas canvas = new GLCanvas(new GLCapabilities (profile));
	    canvas.addGLEventListener(this);
	    canvas.addKeyListener(this);
	    canvas.addMouseListener(this);
	    canvas.addMouseMotionListener(this);
	    frame.add(canvas);
	    this.canvas = canvas; */
	}
	private void drawPoint(GLAutoDrawable glDrawable) {
		glDrawable.setAutoSwapBufferMode(true);
		GL2 gl = glDrawable.getGL().getGL2();
		
		gl.glBegin(GL.GL_POINTS);
		gl.glColor3d(1.0, 1.0, 1.0);
		gl.glVertex2d(x, y);
		gl.glEnd();
	}
	private void drawPolyLine(GLAutoDrawable glDrawable) {
		final double SIZE = 0.02;
		
		GL2 gl = glDrawable.getGL().getGL2();
		
		int n = P.size() - 1;
		for (int i = 1; i <= n; i++) {
			gl.glBegin(GL2.GL_QUADS);
			gl.glColor3d(1.0, 1.0, 1.0);
			gl.glVertex2d(P.get(i).x - SIZE, P.get(i).y - SIZE);
			gl.glVertex2d(P.get(i).x - SIZE, P.get(i).y + SIZE);
			gl.glVertex2d(P.get(i).x + SIZE, P.get(i).y + SIZE);
			gl.glVertex2d(P.get(i).x + SIZE, P.get(i).y - SIZE);
			gl.glEnd();
		}
		
		for (int i = 1; i <= n-1; i++) {
			gl.glBegin(GL2.GL_LINES);
			gl.glVertex2d(P.get(i).x, P.get(i).y);
			gl.glVertex2d(P.get(i+1).x, P.get(i+1).y);
			gl.glEnd();
		}
		
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void init(GLAutoDrawable glDrawable) {
		final GL2 gl = glDrawable.getGL().getGL2();
        final GLU glu = new GLU();

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-1.0f, 1.0f, -1.0f, 1.0f); // drawing square
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
        
        
	}

	@Override
	public void reshape(GLAutoDrawable glDrawable, int x, int y, int width, int height) {
		final GL2 gl = glDrawable.getGL().getGL2();
		//final GLU glu = glDrawable.getGLU();
		
		gl.glViewport(0, 0, width, height); //update the viewport
	}
	
}
