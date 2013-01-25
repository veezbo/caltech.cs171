package homework0;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class HW0 
{
    public static void main(String[] args) 
    {
    	// setup OpenGL Version 2
    	GLProfile profile = GLProfile.get(GLProfile.GL2);
    	GLCapabilities capabilities = new GLCapabilities(profile);
 
    	// The canvas is the widget that's drawn in the JFrame
    	GLCanvas canvas = new GLCanvas(capabilities);
    	canvas.setSize( 600, 600);
    	
    	// keyboard event handler
    	CallbackListener callbackHandler = new CallbackListener();
    	
    	// Add canvas event listeners
    	canvas.addGLEventListener(new Renderer());
    	canvas.addKeyListener(callbackHandler);
        JFrame frame = new JFrame( "CS171 HW0" );
        frame.getContentPane().add(canvas);
        
        // Add window event listeners
       	frame.addKeyListener(callbackHandler);
        // shutdown the program on windows close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
 
        frame.setSize( frame.getContentPane().getPreferredSize() );
        frame.setVisible( true );
    }
}