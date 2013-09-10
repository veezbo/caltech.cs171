package homework7;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class HW7 {

    public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
    	
    //Parse Input
    	//ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(FILE));
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        KeyframeLexer lexer = new KeyframeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KeyframeParser parser = new KeyframeParser(tokens);
        
        Keyframes keyframes = parser.keyframeParse();
        
    //Setting up OpenGL
    	final int xRes = 500, yRes = 500;
    	// setup OpenGL Version 2
    	GLProfile profile = GLProfile.get(GLProfile.GL2);
    	GLCapabilities capabilities = new GLCapabilities(profile);

    	// The canvas is the widget that's drawn in the JFrame
    	GLCanvas canvas = new GLCanvas(capabilities);
    	canvas.setSize( xRes , yRes );
    	
    	Renderer r = new Renderer(canvas, keyframes);
    	
    	// keyboard event handler
    	CallbackListener callbackHandler = new CallbackListener(xRes, yRes, r, canvas);
    	
    	// Add canvas event listeners
    	canvas.addGLEventListener(r);
    	canvas.addKeyListener(callbackHandler);
    	canvas.addMouseListener(callbackHandler);
    	
    	// Set up Frame
        JFrame frame = new JFrame( "CS171 HW7" );
        //frame.setLayout(new GridLayout());
        frame.getContentPane().add(canvas);
        
        // Add window event listeners
       	frame.addKeyListener(callbackHandler);
        frame.addMouseListener(callbackHandler);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
        
        // Set certain properties of the frame for convenience
        frame.setUndecorated(true);
        frame.setLocation(50, 50);
        frame.setSize( xRes, yRes );
        frame.setVisible( true );        
    }
}
