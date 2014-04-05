package neocognitron;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File f=new File("data/Saved Networks/BestNeocognitron-20140130-114219382.neo");
		Neocognitron n=Neocognitron.OpenNeocognitron(f);
		NeocognitronStructure  s= n.getStructure();
		
     
		File f1=new File("data/Training Images/1_02.bmp");
		double [][] input =	s.readImage(f1);
		
		System.out.println(input);
		
		int output=n.propagate(input, false);
		System.out.println(output);
		System.out.println("Recognized character:");
		
		switch(output)
		{
		case 13: System.out.println("അ");
		break;
		case 5: System.out.println("ഇ");
		break;
		case 11: System.out.println("ഉ");
		break;
		case 0: System.out.println("എ");
		break;
		case 2: System.out.println("ഒ");
		break;
		}
	
		
	}
}

