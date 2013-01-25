package homework5redone;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
	
public class HW5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int xRes = 500, yRes = 500;
		
		Frame frame = new Frame ("Hello World");
		GLProfile profile = GLProfile.get(GLProfile.GL2);
	    GLCanvas canvas = new GLCanvas(new GLCapabilities (profile));
	    
	    frame.setSize(xRes, yRes);
	    frame.setBackground(Color.BLACK);
	    frame.setLocation(50, 50);
        frame.setUndecorated(true);
	    
	    frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
	    
	    //make a new JOGLEventListener to handle the events
	    JOGLEventListener listener = new JOGLEventListener (xRes, yRes, canvas, frame);
	    canvas.addGLEventListener(listener);
	    canvas.addKeyListener(listener);
	    canvas.addMouseListener(listener);
	    canvas.addMouseMotionListener(listener);
	    
	    frame.addMouseListener(listener);
	    frame.addMouseMotionListener(listener);
	    frame.addKeyListener(listener);
	    
	    frame.add(canvas);
	    
	    frame.setVisible(true);
	    
	    listener.coxDeBoor();
	    
	}
}
