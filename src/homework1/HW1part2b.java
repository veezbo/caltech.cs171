package homework1;

import java.io.*;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

public class HW1part2b {

    public static void main(String[] args) throws FileNotFoundException, IOException {
    	
    	//Basic Lexer/Parser Stuff
    	ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("nonagons-box.2d"));
        polylineCalcLexer lexer = new polylineCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        polylineCalcParser parser = new polylineCalcParser(tokens);
        
        //super important to the rest of the program
        //determines the size of the image to be displayed
        final int xRes=400, yRes=400;

        //Initialization of the Data Structures that Hold our Information
    	ArrayList<String> inputs = new ArrayList<String>(); //Will hold the strings the parser returns
        ArrayList<Point> points = new ArrayList<Point>(); //Will hold the points corresponding to those strings
        ArrayList<Boolean> drawBetween = new ArrayList<Boolean>(); //Will indicate whether a line is to be drawn between two
        														   //consecutive points in the list 'points'
        
        //continue looping through the polylines, until there are none left
        while (true) {
        	
        	try {
    			inputs = parser.polyline();
    		} catch (Exception e) {
    			e.printStackTrace();
    			break;
    		}
            
        	if (inputs==null) break; //indicates the parser has reached the end of the file
        	
        	//convert the Strings into points
            int size = inputs.size();
            for (int i = 0; i < size; i+=2) {
            	points.add(new Point(Double.parseDouble(inputs.get(i)), Double.parseDouble(inputs.get(i+1))));
            	if (i!=0) drawBetween.add(true); //draw lines between consecutive points in the same polyline "group"
            }
            
            drawBetween.add(false); //do not draw a line between points of separate polyline "groups"
        }
        
        
        Canvas canvas = new Canvas(points, drawBetween);
        canvas.pixels = new boolean[xRes+1][yRes+1];
        
        //ensuring that the starting state is a boolean array filled with false
        for (int i = 0; i <= xRes; i++) {
        	for (int j = 0; j <= yRes; j++) {
        		canvas.pixels[i][j] = false;
        	}
        }
        
        //let canvas handle the line-drawing, given the size of the image
        canvas.draw2d(xRes, yRes);
        
        //print out the generated grid in PPM format
        Canvas.ppmGen(canvas.pixels, xRes, yRes);
        
    }

}   
