package neocognitron;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import neocognitron.Neocognitron;
import neocognitron.NeocognitronStructure;
import neocognitron.NeocognitronTrainer;
import neocognitron.OutputConnections;


public class NT2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File[] files = new File[6];
		files[0] = new File ("data/Training Images/21_00.bmp");
		files[1] = new File ("data/Training Images/22_00.bmp");
		files[2] = new File ("data/Training Images/23_00.bmp");
		files[3] = new File ("data/Training Images/24_00.bmp");
		files[4] = new File ("data/Training Images/25_00.bmp");
		files[5] = new File ("data/Training Images/26_00.bmp");
		
		
		ArrayList<double[][]> inputs = new ArrayList<double[][]>();
		for(int i = 0; i < files.length; i++ ) {
			try {
				inputs.add(NeocognitronStructure.readImage(files[i]));
			}
			catch (IOException e) {
				System.out.println("\nERROR!");
			}
		}
		
files = new File[18];
		
		files[0] = new File ("data/Training Images/21_01.bmp");
		files[1] = new File ("data/Training Images/22_01.bmp");
		files[2] = new File ("data/Training Images/23_01.bmp");
		files[3] = new File ("data/Training Images/24_01.bmp");
		files[4] = new File ("data/Training Images/25_01.bmp");
		files[5] = new File ("data/Training Images/26_01.bmp");
		files[6] = new File ("data/Training Images/21_02.bmp");
		files[7] = new File ("data/Training Images/22_02.bmp");
		files[8] = new File ("data/Training Images/23_02.bmp");
		files[9] = new File ("data/Training Images/24_02.bmp");
		files[10] = new File ("data/Training Images/25_02.bmp");
		files[11] = new File ("data/Training Images/26_02.bmp");
		files[12] = new File ("data/Training Images/21_03.bmp");
		files[13] = new File ("data/Training Images/22_03.bmp");
		files[14] = new File ("data/Training Images/23_03.bmp");
		files[15] = new File ("data/Training Images/24_03.bmp");
		files[16] = new File ("data/Training Images/25_03.bmp");
		files[17] = new File ("data/Training Images/26_03.bmp");
		
		ArrayList<double[][]> testInputs = new ArrayList<double[][]>();
		for(int i = 0; i < files.length; i++ ) {
			try {
				testInputs.add(NeocognitronStructure.readImage(files[i]));
			}
			catch (IOException e) {
				System.out.println("\nERROR!");
			}
		}
		
		
		File[] faFiles = new File("data/Saved Networks").listFiles();
		for (File file : faFiles) {
			int dotPosition = file.toString().lastIndexOf(".");
			if (dotPosition != -1) {
			    if (file.toString().substring(dotPosition).equals(".neo")) {
			    	System.out.println();
			    	System.out.println(file.getAbsolutePath());
			    	Neocognitron n = Neocognitron.OpenNeocognitron(file);
			    	NeocognitronStructure s = n.getStructure();
			    	NeocognitronTrainer trainer = new NeocognitronTrainer(inputs, testInputs,null);
			    	System.out.println("\n"+trainer.verifyTraining(n));
			    	double error = trainer.verifyNeocognitron(n,true);
			    	System.out.println("Eror Rate: " + error);
			    	System.out.println("Planes: " + s.numCPlanes[0]);
			    	System.out.println("r values: " + OutputConnections.arrayToString(s.r) );
			    	System.out.println("q values: " + OutputConnections.arrayToString(s.q) );
			    	System.out.println("alpha: " + s.alpha);
			    	System.out.println("gamma: " +  OutputConnections.arrayToString(s.gamma) );
			    	System.out.println("delta: " +  OutputConnections.arrayToString(s.delta) );
			    	System.out.println("delta_bar: " +  OutputConnections.arrayToString(s.delta_bar) );
			    }
			}
		}
	}

}
