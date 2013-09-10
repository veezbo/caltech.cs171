package homework4;

import homework3.OpenInventorData;
import homework3.OpenInventorNewLexer;
import homework3.OpenInventorNewParser;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class HW4 {

    public static void main(String[] args) throws IOException, RecognitionException {
    	
    //Parse Input
    	//ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(FILE));
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        OpenInventorNewLexer lexer = new OpenInventorNewLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OpenInventorNewParser parser = new OpenInventorNewParser(tokens);
        
        OpenInventorData oid = parser.openinventor();

        int xRes, yRes;
        if (args.length < 2) {
            xRes = 600;
            yRes = 600;
        }
        else {
            xRes = Integer.parseInt(args[0]);
            yRes = Integer.parseInt(args[1]);
        }
    	
        
    //Set up OpenGL
    	GLProfile profile = GLProfile.get(GLProfile.GL2);
    	GLCapabilities capabilities = new GLCapabilities(profile);
        
    	// The canvas is the widget that's drawn in the JFrame
    	GLCanvas canvas = new GLCanvas(capabilities);
    	canvas.setSize( xRes , yRes );
    	
    	// Renderer object to be used for the canvas
    	Renderer r = new Renderer(oid, canvas);
    	
    	// keyboard event handler
    	CallbackListener callbackHandler = new CallbackListener(r);
    	
    	// Add canvas event listeners
    	canvas.addGLEventListener(r);
    	canvas.addKeyListener(callbackHandler);
        JFrame frame = new JFrame( "CS171 HW4" );
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
