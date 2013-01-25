package homework0;

import java.nio.FloatBuffer;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
 
class Renderer implements GLEventListener 
{
    private GLU glu = new GLU();
    private GLUquadric quad;
 
    public void display(GLAutoDrawable gLDrawable) 
    {
        final GL2 gl = gLDrawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        glu.gluSphere(quad, 2.0, 256, 256);
    }
  
    public void displayChanged(GLAutoDrawable gLDrawable, boolean modeChanged, boolean deviceChanged) 
    {
    	System.out.println("displayChanged called");
    }
 
    public void init(GLAutoDrawable gLDrawable) 
    {
        GL2 gl = gLDrawable.getGL().getGL2();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL2.GL_SMOOTH);
        gl.glEnable(GL2.GL_CULL_FACE);
        gl.glEnable(GL2.GL_DEPTH_TEST);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glFrustum(-0.5, 0.5, -0.5, 0.5, 1, 10);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
        glu.gluLookAt(5, 5, 5, 0, 0, 0, 1, 0, 0);
        
        // Initialize lights
        initLights(gLDrawable);
        initMaterial(gLDrawable);
        
        quad = glu.gluNewQuadric();
        glu.gluQuadricOrientation(quad, GLU.GLU_OUTSIDE);
        
    }
 
    public void reshape(GLAutoDrawable gLDrawable, int x, int y, int width, int height) 
    {
        final GL2 gl = gLDrawable.getGL().getGL2();
 
        if (height <= 0) // avoid a divide by zero error!
        {
            height = 1;
        }
        
        if (width > height)
        	width = height;
        else
        	height = width;
 
        gl.glViewport(0, 0, width, height);
        
    }
 
	public void dispose(GLAutoDrawable arg0) 
	{
		System.out.println("dispose() called");
	}
	
	private void initLights(GLAutoDrawable gLDrawable) {
        final GL2 gl = gLDrawable.getGL().getGL2();
        float amb[] = { 1.0f, 1.0f, 1.0f, 1.0f };
        float diff[]= { 1.0f, 1.0f, 1.0f, 1.0f };
        float spec[]= { 1.0f, 1.0f, 1.0f, 1.0f };
        float lightpos[]= { 2.0f, 2.0f, 5.0f, 1.0f };
        float shiny = 4.0f;
        
        gl.glLightModelfv(GL2.GL_LIGHT_MODEL_AMBIENT, FloatBuffer.wrap(amb));
        
        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, amb, 0);
        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, diff, 0);
        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_SPECULAR, spec, 0);
        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, lightpos, 0);
        gl.glLightf(GL2.GL_LIGHT0, GL2.GL_SHININESS, shiny);
        gl.glEnable(GL2.GL_LIGHT0);
        
        gl.glEnable(GL2.GL_LIGHTING);
	}
	
	private void initMaterial(GLAutoDrawable gLDrawable) {
        final GL2 gl = gLDrawable.getGL().getGL2();
		float emit[] = {0.0f, 0.0f, 0.0f, 1.0f};
		float  amb[] = {0.0f, 0.0f, 0.0f, 1.0f};
		float diff[] = {0.0f, 0.0f, 1.0f, 1.0f};
		float spec[] = {1.0f, 1.0f, 1.0f, 1.0f};
		float shiny = 20.0f;

		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_AMBIENT, amb, 0);
		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_DIFFUSE, diff, 0);
		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_SPECULAR, spec, 0);
		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_EMISSION, emit, 0);
		gl.glMaterialf(GL2.GL_FRONT, GL2.GL_SHININESS, shiny);
	}
}