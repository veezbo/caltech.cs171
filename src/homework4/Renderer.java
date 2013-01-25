package homework4;

import homework1.Matrix;
import homework2.PerspectiveCameraData;
import homework2.Quadruple;
import homework2.TransformData;
import homework2.Triple;
import homework3.IndexedFaceSetData;
import homework3.MaterialData;
import homework3.OpenInventorData;
import homework3.PointLightData;
import homework3.SeparatorData;

import java.nio.FloatBuffer;
import java.util.ArrayList;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLCanvas;


public class Renderer implements GLEventListener 
{
    private OpenInventorData oid;
    
    static final int WIREFRAME_SHADING = 0;
    static final int FLAT_SHADING = 1;
    static final int GOURAND_SHADING = 2;
    int shadingStyle = 2;
    
    GLCanvas canvas;
    
    public Renderer(OpenInventorData oid, GLCanvas canvas) {
    	this.oid = oid;
    	this.canvas = canvas;
    }
    
    public void setShading(int n) {
    	shadingStyle = n;
    }
    
    public void init(GLAutoDrawable glDrawable) {
    	
        //Initial Stuff
            final GL2 gl = glDrawable.getGL().getGL2();
            gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    	 	gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

            gl.glEnable(GL2.GL_CULL_FACE);
            gl.glEnable(GL2.GL_DEPTH_TEST);
            
        //Projection Mode, to create the Frustrum
            PerspectiveCameraData pcd = oid.pcd;
            gl.glMatrixMode(GL2.GL_PROJECTION);
            gl.glLoadIdentity();
            gl.glFrustum(pcd.l, pcd.r, pcd.b, pcd.t, pcd.n, pcd.f);
            
        //ModelView Mode, which is where we'll stay for the rest of the program
            gl.glMatrixMode(GL2.GL_MODELVIEW);
            gl.glLoadIdentity();
        
        //Camera Orientation (location via translation and orientation via rotation)
            Triple camPosition = pcd.position;
            gl.glTranslatef(-1.0f * (float) camPosition.data[0], -1.0f * (float) camPosition.data[1], -1.0f * (float) camPosition.data[2]);
            
            Quadruple orientation = pcd.orientation;
            float deg = (float) ( orientation.data[3]/(Math.PI) * 180.0f ); 
            gl.glRotatef(deg, (float) orientation.data[0], (float) orientation.data[1], (float) orientation.data[2]);
            
            
        // Set lights
            setLights(glDrawable);
            
        }
 
    public void display(GLAutoDrawable glDrawable) 
    {
        final GL2 gl = glDrawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        
        if (shadingStyle == Renderer.FLAT_SHADING) {
        	gl.glShadeModel(GL2.GL_FLAT);
    	}
        if (shadingStyle == Renderer.GOURAND_SHADING) {
        	gl.glShadeModel(GL2.GL_SMOOTH);
        }
        
        int sdCount = 0;
        for (SeparatorData sd : oid.sds) {
        	//Ensure that the transformations are only applied to this particular Separator (object)
        	gl.glPushMatrix();
        	
        	setMaterial(glDrawable, sdCount);
        	
        	for (TransformData td : sd.tds) {
        		Triple scale = td.scaleFactor;
        		Quadruple rot = td.rotation;
        		Triple trans = td.translation;
        		
        	//Translation, Rotation, and then Scaling
        		gl.glTranslatef((float) trans.data[0], (float) trans.data[1], (float) trans.data[2]);
        		
        		float deg = (float) ( rot.data[3]/(Math.PI) * 180.0f ); 
        		gl.glRotatef(deg, (float) rot.data[0], (float) rot.data[1], (float) rot.data[2]);
        		
        		gl.glScalef((float) scale.data[0], (float) scale.data[1], (float) scale.data[2]);
                
        	}
        	
        	IndexedFaceSetData ifs = sd.ifs;
        	ArrayList<Integer> coordIndices = ifs.indices;
        	ArrayList<Integer> normalIndices = ifs.nindices;
        	ArrayList<Triple> points = sd.cd.points;
        	ArrayList<Triple> normals = sd.nd.vectors;
        	int pointSetSize = coordIndices.size();
        	
        	int i = 0;
        	while (true) {
        		if (i >= pointSetSize) break;
        		if (shadingStyle == Renderer.WIREFRAME_SHADING) {
            		gl.glBegin(GL2.GL_LINE_LOOP);
            	}
        		else {
        			gl.glBegin(GL2.GL_POLYGON);
        		}
        		
        		while (true) {
        			int coordIndex = coordIndices.get(i), normalIndex = normalIndices.get(i);
        			if (coordIndex == -1) {
        				gl.glEnd();
        				break;
        			}
        			
        			Triple point = points.get(coordIndex);
        			Triple normal = normals.get(normalIndex);
        			
        			gl.glNormal3f((float) normal.data[0], (float) normal.data[1], (float) normal.data[2]);
        			gl.glVertex3f((float) point.data[0], (float) point.data[1], (float) point.data[2]);
        			
        			i++;
        		}
        		
        		i++;
        	}
        	
        	//Remove the pushed matrix for this particular separator block
        	gl.glPopMatrix();
        	sdCount++;
        }
    }
 
    public void setLights(GLAutoDrawable glDrawable) {
    	
    	final GL2 gl = glDrawable.getGL().getGL2();
    	
    	int counter = 0;
    	for (PointLightData pld : oid.plds) {
    		float amb[] = { 0.0f, 0.0f, 0.0f, 1.0f }; //supposed to be set to (0, 0, 0)
    		//float amb[] = Matrix.getVectorFloatArray(Matrix.createHomogenizedVector(pld.color.data));
    		
    		//diff and spec are the color passed in
            float diff[]= Matrix.getVectorFloatArray(Matrix.createHomogenizedVector(pld.color.data));
            float spec[]= Matrix.getVectorFloatArray(Matrix.createHomogenizedVector(pld.color.data));
            float lightpos[]= Matrix.getVectorFloatArray(Matrix.createHomogenizedVector(pld.loc.data));
            
            //no need to worry about shininess
            //float shiny = (float) md.shininess;
            
            gl.glLightModelfv(GL2.GL_LIGHT_MODEL_AMBIENT, FloatBuffer.wrap(amb));
            
            if (counter == 0) {
            	gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, amb, 0);
                gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, diff, 0);
                gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_SPECULAR, spec, 0);
                gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, lightpos, 0);
                //gl.glLightf(GL2.GL_LIGHT0, GL2.GL_SHININESS, shiny);
                gl.glEnable(GL2.GL_LIGHT0);
            }
            
            if (counter == 1) {
            	gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_AMBIENT, amb, 0);
                gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_DIFFUSE, diff, 0);
                gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_SPECULAR, spec, 0);
                gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_POSITION, lightpos, 0);
                //gl.glLightf(GL2.GL_LIGHT1, GL2.GL_SHININESS, shiny);
                gl.glEnable(GL2.GL_LIGHT1);
            }
            
            if (counter == 2) {
            	gl.glLightfv(GL2.GL_LIGHT2, GL2.GL_AMBIENT, amb, 0);
                gl.glLightfv(GL2.GL_LIGHT2, GL2.GL_DIFFUSE, diff, 0);
                gl.glLightfv(GL2.GL_LIGHT2, GL2.GL_SPECULAR, spec, 0);
                gl.glLightfv(GL2.GL_LIGHT2, GL2.GL_POSITION, lightpos, 0);
                //gl.glLightf(GL2.GL_LIGHT2, GL2.GL_SHININESS, shiny);
                gl.glEnable(GL2.GL_LIGHT2);
            }
            
            counter++;
    	}
        
        gl.glEnable(GL2.GL_LIGHTING);
    }
    
    public void setMaterial(GLAutoDrawable glDrawable, int sdCount) {
    	
    	MaterialData md = oid.sds.get(sdCount).md;
    	final GL2 gl = glDrawable.getGL().getGL2();
    	    	
    	float emit[] = { 0.0f, 0.0f, 0.0f, 1.0f }; 
       	
    	float amb[] = Matrix.getVectorFloatArray(Matrix.createHomogenizedVector(md.ambientColor.data));
        float diff[]= Matrix.getVectorFloatArray(Matrix.createHomogenizedVector(md.diffuseColor.data));
        float spec[]= Matrix.getVectorFloatArray(Matrix.createHomogenizedVector(md.specularColor.data));
        float shiny = (float) md.shininess;
		
		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_AMBIENT, amb, 0);
		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_DIFFUSE, diff, 0);
		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_SPECULAR, spec, 0);
		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_EMISSION, emit, 0);
		gl.glMaterialf(GL2.GL_FRONT, GL2.GL_SHININESS, shiny);
    	
    }
    
//Uninteresting and Unused Methods
    
    public void displayChanged(GLAutoDrawable gLDrawable, boolean modeChanged, boolean deviceChanged) {
    	System.out.println("displayChanged called");
    }
    
    public void reshape(GLAutoDrawable gLDrawable, int x, int y, int width, int height) {
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
    
//	private void initLights(GLAutoDrawable gLDrawable) {
//        final GL2 gl = gLDrawable.getGL().getGL2();
//        float amb[] = { 0.0f, 0.0f, 0.0f, 1.0f };
//        float diff[]= { 1.0f, 1.0f, 1.0f, 1.0f };
//        float spec[]= { 1.0f, 1.0f, 1.0f, 1.0f };
//        float lightpos[]= { 2.0f, 2.0f, 5.0f, 1.0f };
//        float shiny = 4.0f;
//        
//        gl.glLightModelfv(GL2.GL_LIGHT_MODEL_AMBIENT, FloatBuffer.wrap(amb));
//        
//        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, amb, 0);
//        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, diff, 0);
//        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_SPECULAR, spec, 0);
//        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, lightpos, 0);
//        gl.glLightf(GL2.GL_LIGHT0, GL2.GL_SHININESS, shiny);
//        gl.glEnable(GL2.GL_LIGHT0);
//        
//        gl.glEnable(GL2.GL_LIGHTING);
//	}
//	
//	private void initMaterial(GLAutoDrawable gLDrawable) {
//        final GL2 gl = gLDrawable.getGL().getGL2();
//		float emit[] = {0.0f, 0.0f, 0.0f, 1.0f};
//		float  amb[] = {0.0f, 0.0f, 0.0f, 1.0f};
//		float diff[] = {0.0f, 0.0f, 1.0f, 1.0f};
//		float spec[] = {1.0f, 1.0f, 1.0f, 1.0f};
//		float shiny = 20.0f;
//		
//		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_AMBIENT, amb, 0);
//		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_DIFFUSE, diff, 0);
//		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_SPECULAR, spec, 0);
//		gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_EMISSION, emit, 0);
//		gl.glMaterialf(GL2.GL_FRONT, GL2.GL_SHININESS, shiny);
//		
//	}
	
	public void dispose(GLAutoDrawable arg0) {
		System.out.println("dispose() called");
	}
}