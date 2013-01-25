package homework2;

import java.io.*;
import org.antlr.runtime.*;

public class HW2 {
	
	static final int xRes=400, yRes=400;
	
	static OpenInventorData oid;

	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		
		final String FILE = "cube.iv";
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(FILE));
        OpenInventorLexer lexer = new OpenInventorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OpenInventorParser parser = new OpenInventorParser(tokens);
                	
        oid = parser.openinventor();
        
        final int xRes=400, yRes=400;
        
        Wireframe w = new Wireframe(oid);
        w.wireframe(xRes, yRes);
        
        System.out.println("End of Program");
        
        System.exit(0);
	}
	
}
