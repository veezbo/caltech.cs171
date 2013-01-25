package homework7;

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
	
	public Renderer(GLCanvas canvas, Keyframes keyframes) {
		this.canvas = canvas;
		this.keyframes = keyframes;
	}
	
	@Override
	public void init(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
		
        clearScreen(drawable);
        
        gl.glShadeModel(GL2.GL_FLAT);
        //gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_DEPTH_TEST);
        
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glFrustum(-1., 1., -1., 1., 1, 10);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
        glu.gluLookAt(5, 5, 5, 0, 0, 0, 1, 0, 0);
		
        quad = glu.gluNewQuadric();
        glu.gluQuadricOrientation(quad, GLU.GLU_OUTSIDE);
        
    //Display the I-bar
        displayCylinders(drawable);
        
        //TODO: Precompute interpolations of the cubic spline with catmull-rom
        
        
	}

	@Override
	public void display(GLAutoDrawable drawable) {
		
	}
	
	private void clearScreen(GLAutoDrawable drawable) {
		final GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
	}
	
	private void displayCylinders(GLAutoDrawable drawable) {
		
		final GL2 gl = drawable.getGL().getGL2();
		
		final double height = 2.;
		final double ratio = 15.;
		
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
	}
	
//Unused Methods
	@Override
	public void dispose(GLAutoDrawable arg0) {}
	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {}

}
