package neocognitron;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File f=new File("data/Saved Networks/BestNeocognitron-ch_0-8.neo");
		Neocognitron n=Neocognitron.OpenNeocognitron(f);
		NeocognitronStructure  s= n.getStructure();
		
     
		File f1=new File("data/Training Images/26_03.bmp");
		double [][] input =	s.readImage(f1);
		
		System.out.println(input);
		
		int output=n.propagate(input, false);
		System.out.println(output);
		
	}
}

