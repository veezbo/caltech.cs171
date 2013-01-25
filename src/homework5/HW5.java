package homework5;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;


public class HW5 {
	
	public static void main(String[] args) {
		
		final int xRes = 500, yRes = 500;
		// setup OpenGL Version 2
    	GLProfile profile = GLProfile.get(GLProfile.GL2);
    	GLCapabilities capabilities = new GLCapabilities(profile);
 
    	// The canvas is the widget that's drawn in the JFrame
    	GLCanvas canvas = new GLCanvas(capabilities);
    	canvas.setSize( xRes , yRes );
    	
    	
    	NURBSEditor nurbs = new NURBSEditor(xRes, yRes, canvas);
    	
    	// keyboard event handler
    	CallbackListener callbackHandler = new CallbackListener(xRes, yRes, canvas, nurbs, nurbs.P);
    	
    	// Add canvas event listeners
    	canvas.addGLEventListener(nurbs);
    	canvas.addKeyListener(callbackHandler);
    	canvas.addMouseListener(callbackHandler);
        JFrame frame = new JFrame( "CS171 HW5" );
        //frame.setLayout(new GridLayout());
        frame.getContentPane().add(canvas);
        
        // Add window event listeners
       	frame.addKeyListener(callbackHandler);
        frame.addMouseListener(callbackHandler);
        // shutdown the program on windows close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
       
        frame.setUndecorated(true);
        frame.setLocation(50, 50);
        frame.setSize( xRes, yRes );
        frame.setVisible( true );
        
        //nurbs.coxDeBoor();
        
        //FPSAnimator animator = new FPSAnimator(canvas, 60, true);
        //animator.start();
	}

}
