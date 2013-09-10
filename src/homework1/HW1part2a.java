package homework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.antlr.runtime.*;
import org.apache.commons.math3.linear.*;

public class HW1part2a {

	//inner class that is useful for storing data
	static class TransformData {
		
		String id;
		ArrayList<Double> vals = new ArrayList<Double>();
		
		public TransformData(String $id, ArrayList<String> $vals) {
			id = $id;
			for (String s : $vals) {
				vals.add(Double.parseDouble(s));
			}
		}
		
	}

	//to be used throughout the program
	static RealMatrix rm = Matrix.createIdentityMatrix44();


	public static void main(String[] args) throws IOException {
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("transform-error-msg.tf"));
		transformCalcLexer lexer = new transformCalcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		transformCalcParser parser = new transformCalcParser(tokens);

		ArrayList<TransformData> tds = new ArrayList<TransformData>();
		        
		while (true) {
			try {
				
		    	ArrayList<String> inputs = parser.transformation();
		    	if (inputs==null  || inputs.isEmpty()) break;
				String id = inputs.get(0);
				inputs.remove(0);
				tds.add( new TransformData(id, inputs) );
				continue;
				
			} catch (Exception e) {
				System.out.println("program ended in error");
				System.exit(-1);
			}
		}


		//start running the program
		int size = tds.size();
		for (int i = size-1; i >= 0; i--) {
			caller(tds.get(i));
		}

		System.out.println(rm);
	}

	public static void caller(TransformData td) {
		String check = td.id;
		if (check.equals("translation")) translation(td.vals);
		if (check.equals("rotation")) rotation(td.vals);
		if (check.equals("scaleFactor")) scaleFactor(td.vals);
	}

	public static void translation(ArrayList<Double> vals) {
		
		double[][] data = {{1, 0, 0, vals.get(0)},
						   {0, 1, 0, vals.get(1)},
						   {0, 0, 1, vals.get(2)},
						   {0, 0, 0, 1}};
		
		rm = Matrix.createMatrix(data).multiply(rm);
		
	}

	public static void rotation(ArrayList<Double> vals) {
		
		double[] vectorvals = {vals.get(0), vals.get(1), vals.get(2)};
		RealVector rv = Matrix.createVector(vectorvals);
		rv = Matrix.normalize(rv);
		vectorvals = Matrix.getVectorArray(rv);
		double x=vectorvals[0], y=vectorvals[1], z=vectorvals[2], th = vals.get(3);
		
		double[][] data = 
			{
				{x*x+(1-x*x)*Math.cos(th), x*y*(1-Math.cos(th))-z*Math.sin(th), x*z*(1-Math.cos(th))+y*Math.sin(th), 0},
				{x*y*(1-Math.cos(th))+z*Math.sin(th), y*y+(1-y*y)*Math.cos(th), y*z*(1-Math.cos(th))-x*Math.sin(th), 0},
				{x*z*(1-Math.cos(th))-y*Math.sin(th), y*z*(1-Math.cos(th))+x*Math.sin(th), z*z+(1-z*z)*Math.cos(th), 0},
				{0, 0, 0, 1}
			};
		
		rm = Matrix.createMatrix(data).multiply(rm);
		
	}

	public static void scaleFactor(ArrayList<Double> vals) {
		
		double[][] data = {{vals.get(0), 0, 0, 0},
				   		   {0, vals.get(1), 0, 0},
				   		   {0, 0, vals.get(2), 0},
				   		   {0, 0, 0, 1}};
		
		rm = Matrix.createMatrix(data).multiply(rm);
		
	}

}