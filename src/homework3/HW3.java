package homework3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class HW3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		
		final String FILE = "lion1.iv";	
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(FILE));
        OpenInventorNewLexer lexer = new OpenInventorNewLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OpenInventorNewParser parser = new OpenInventorNewParser(tokens);
                	
        OpenInventorData oid = parser.openinventor();
        
        final int xRes = 400, yRes = 400;
        Canvas c = new Canvas (xRes, yRes);
        
        ShadedRenderer sr = new ShadedRenderer (c);
        
        sr.shaded (2, xRes, yRes, oid);
        
        Canvas.ppmGen(c.grid, xRes, yRes);
        
        System.exit(0);
        
	}

}
