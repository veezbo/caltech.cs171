package homework5;

import homework1.Point;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.media.opengl.awt.GLCanvas;


public class CallbackListener implements KeyListener, MouseListener {
	
	final int xRes, yRes;
	ArrayList<Point> P;
	GLCanvas canvas;
	NURBSEditor nurbs;
	
	private double parametrizeX(int x) {
		return (double) (x - ((double) xRes)/2.) / (((double) xRes) / 2.);
	}
	private double parametrizeY(int y) {
		return -1. * (double) (y - ((double)yRes)/2.) / (((double) yRes) / 2.);
	}
	
	public CallbackListener(int xRes, int yRes, GLCanvas canvas, NURBSEditor nurbs, ArrayList<Point> P) {
		this.xRes = xRes;
		this.yRes = yRes;
		this.canvas = canvas;
		this.nurbs = nurbs;
		this.P = P;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == 27 || e.getKeyChar() == 'q' || e.getKeyChar() == 'Q')
			System.exit(0);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		
	}

	public void mouseDragged(MouseEvent m) {
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	int x, y;
	double X, Y;
	int clickedIndex = -1;

	@Override
	public void mousePressed(MouseEvent m) {
		
	//Process a right click
		if (m.getButton() == 3) {
			
//			System.out.println("RIGHT CLICK");
			
		//finding the new knot value 
			x = m.getX();
			y = m.getY();
			X = parametrizeX(x);
			Y = parametrizeY(y);
			Point check = new Point(X, Y);
			
			double tprime = -10;
			
			int index = 1;
			for (Point p : nurbs.drawnNurbs) {
				if (p.equals(check)) {
					tprime = nurbs.uvals.get(index);
					break;
				}
				index++;
			}
			if (tprime == -10) return;
			
		//calculating the insertion point of the new knot
			int insert = Collections.binarySearch(nurbs.t, tprime);
			if (insert < 0) insert = -1 * (insert + 1);
			//nurbs.t.add(insert, tprime);
			
		//creating the new control point arraylist
			int n = P.size() - 1;
			ArrayList<Point> Pn = new ArrayList<Point>(n+2);
			//dummy point
			Pn.add(new Point(-1, -1));
		
			for (int i = 1; i <= n+1; i++) {
				if (i==1) {
					Pn.add(nurbs.P.get(i));
					continue;
				}
				if (i==n+1) {
					Pn.add(nurbs.P.get(i-1));
					continue;
				}
				double ai = -1;
				if (i >= 1 && i <= insert-4) ai = 1.;
				else if (i >= insert && i <= n) ai = 0;
				else if (i >= insert-3 && i <= insert-1) {
					ai = (tprime - nurbs.t.get(i)) / (nurbs.t.get(i+3) - nurbs.t.get(i));
				}
				
				double newx, newy;
				newx = (1.-ai) * nurbs.P.get(i-1).x + ai * nurbs.P.get(i).x;
				newy = (1.-ai) * nurbs.P.get(i-1).y + ai * nurbs.P.get(i).y;
				
				Pn.add(new Point(newx, newy));
			}
			
			nurbs.P = Pn;
			P = Pn;
			nurbs.t.add(insert, tprime);
			
			nurbs.canvas.display();
		}
		
		//Process a left click
		else if (m.getButton() == 1) {
			
			x = m.getX();
			y = m.getY();
			X = parametrizeX(x);
			Y = parametrizeY(y);
			
			int n = P.size() - 1;
			
			//System.out.println(X + " " + Y);
			
			//check if the clicked portion is within the bounds of a control point
			for (int i = 1; i <= n; i++) {
				if (Math.abs(X - P.get(i).x) <= 0.02 && Math.abs(Y - P.get(i).y) <= 0.02) {
					clickedIndex = i;
//					System.out.println("IN");
					return;
				}
			}
//			System.out.println("OUT");
			
		}
		
	}
	
	@Override
	public void mouseReleased(MouseEvent m) {
		
		//Check to see if the clicked point actually makes sense. If not, end.
		if (Math.abs(X) > 1.0001 || Math.abs(Y) > 1.0001) {
			return;
		}
		
		if (clickedIndex == -1) return;
		
		/* GL2 gl = canvas.getGL().getGL2();
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
	 	gl.glClear(GL.GL_COLOR_BUFFER_BIT); */
	 	

		//canvas.destroy();
		
		
		//We're going to assume there was some kind of a drag here if the previous clicked point is reasonable
		P.set( clickedIndex, new Point(parametrizeX(m.getX()), parametrizeY(m.getY())) );
		nurbs.P = this.P;
		
		nurbs.canvas.display();
		
		//Reset clickedIndex, x, y, X, and Y
		clickedIndex = -1;
		x = -1;
		y = -1;
		X = -5;
		Y = -5;
	}
}
