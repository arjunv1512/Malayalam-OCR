package neocognitron;

import java.io.File;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File f=new File("data/Saved Networks/BestNeocognitron-ch_21-26.neo");
		Neocognitron n=Neocognitron.OpenNeocognitron(f);
		NeocognitronStructure  s= n.getStructure();
		
     
		File f1=new File("data/test/21_01.bmp");
		double [][] input =	s.readImage(f1);
		
		System.out.println(input);
		
		int output=n.propagate(input, false);
		System.out.println(output);
		
	}
}

