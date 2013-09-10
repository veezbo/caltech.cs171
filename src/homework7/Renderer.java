package homework7;

import homework2.Quadruple;
import homework2.Triple;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Renderer implements GLEventListener {

	GLCanvas canvas;
	private GLU glu = new GLU();
	private GLUquadric quad;
	Keyframes keyframes;
	int numFrames;
	static final double TENSION = 0.5;

	CatmullRomSplineSolver crss;

	public Renderer(GLCanvas canvas, Keyframes keyframes) {
		this.canvas = canvas;
		this.keyframes = keyframes;
		this.numFrames = keyframes.numFrames;
		
		this.crss = new CatmullRomSplineSolver(this.numFrames, this.keyframes, TENSION);
	}

	boolean next = true;
	public void displayNext() {
		canvas.display();
	}
	public void displayPrevious() {
		next = false;
		canvas.display();
		next = true;
	}
	public void displayFrame(int frame) {
		currentFrame = frame - 1;
		canvas.display();
	}
	boolean loop = true;
	public void toggleLoopMode() {
		loop = !loop;
	}
	boolean keyEvent = false;
	int dir = -1;
	public void setKeyEvent(int dir) {
		keyEvent = true;
		this.dir = dir;
		canvas.display();
		keyEvent = false;
		this.dir = -1;
	}

	double zoomFactor = 120.;
	final double aspect = 1.0, zNear = .1, zFar = 40.;	
	@Override
	public void init(GLAutoDrawable drawable) {

		GL2 gl = drawable.getGL().getGL2();
		
	    clearScreen(drawable);
	    
	    gl.glShadeModel(GL2.GL_FLAT);
	    gl.glEnable(GL2.GL_DEPTH_TEST);
	    
	    gl.glMatrixMode(GL2.GL_PROJECTION);
	    gl.glLoadIdentity();
	    //gl.glFrustum(-1., 1., -1., 1., 1, 10);
	    glu.gluPerspective(zoomFactor, aspect, zNear, zFar);
	    
	    gl.glMatrixMode(GL2.GL_MODELVIEW);
	    gl.glLoadIdentity();
	    //glu.gluLookAt(-5., 0.001, 0.001, 0, 0, 0, 1, 0, 1);
	    Triple firstloc = crss.getFrameLoc(0);
	    glu.gluLookAt(-10, 0, 10, firstloc.data[0], firstloc.data[1], firstloc.data[2], 1, 0, 1);
		
	    quad = glu.gluNewQuadric();
	    
	}

	private int currentFrame = numFrames-1;

	public void update() {
		//either going to the next frame or not
		if (next) {
			if (!loop) {
				if (currentFrame != numFrames-1) {
					currentFrame+=1;
				}
			}
			else {
				currentFrame+=1;
				currentFrame%=numFrames;
			}
		}
		else {
			if (!loop) {
				if (currentFrame != 0) {
					currentFrame-=1;
				}
			}
			else {
				currentFrame -=1;
				if (currentFrame == -1) currentFrame = numFrames - 1;
			}	
		}
	}

	@Override
	public void display(GLAutoDrawable drawable) {
		
		update();
		clearScreen(drawable);

		//Aquiring Translation Data
		Triple nextloc = crss.getFrameLoc(currentFrame);
		
		//Acquiring Rotation Data (using Quaternions)
		Quadruple rot = crss.getFrameRot(currentFrame);
		System.out.println(rot);
		double angle = rot.data[3];
		Quadruple nextrot = new Quadruple(angle, rot.data[0], rot.data[1], rot.data[2]);
		
		//Acquiring Scaling Data
		Triple scale = crss.getFrameScale(currentFrame);
		
		//All transformations implemented- now draw the cylinders
		displayCylinders(drawable, nextloc, nextrot, scale);
		
	}

	private void displayCylinders(GLAutoDrawable drawable, Triple trans, Quadruple rot, Triple scale) {
				
		final GL2 gl = drawable.getGL().getGL2();
		
		final double height = 2.;
		final double ratio = 15.;
		
		gl.glPushMatrix();
		
			//transformations for interpolation
			gl.glTranslated(trans.data[0], trans.data[1], trans.data[2]);
			gl.glRotated(rot.data[0], rot.data[1], rot.data[2], rot.data[3]);
			gl.glScaled(scale.data[0], scale.data[1], scale.data[2]);

			//constant translate solution
			gl.glTranslatef(0.f, (float) -height/2, 0.f);

			gl.glPushMatrix();
			//clearScreen(drawable);
			gl.glColor3d(0., 1.0, 1.0);
			glu.gluCylinder(quad, height/ratio, height/ratio, height, 256, 256);
			gl.glPopMatrix();

			gl.glPushMatrix();
			//clearScreen(drawable);
			gl.glColor3d(1.0, 0., 1.0);
			gl.glTranslatef(0.f, (float) height, 0.f);
			gl.glRotatef(90.f, 1.f, 0.f, 0.f);
			gl.glTranslatef(0.f, (float) height/2, 0.f);	
			glu.gluCylinder(quad, height/ratio, height/ratio, height, 256, 256);
			gl.glPopMatrix();

			gl.glPushMatrix();
			gl.glColor3d(1.0, 1.0, 0.0);
			gl.glTranslatef(0.f, (float) height, 0.f);
			//gl.glRotatef(90.f, 1.f, 0.f, 0.f);
			//gl.glTranslatef(0.f, (float) -height/2, 0.f);
			glu.gluCylinder(quad, height/ratio, height/ratio, height, 256, 256);
			gl.glPopMatrix();

		gl.glPopMatrix();
	}


	private void clearScreen(GLAutoDrawable drawable) {
		final GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
	}

//Unused Methods
	@Override
	public void dispose(GLAutoDrawable arg0) {}
	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {}

}
