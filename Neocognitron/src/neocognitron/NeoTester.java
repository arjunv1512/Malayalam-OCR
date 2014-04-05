package neocognitron;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class NeoTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] files = new File[5];
		files[0] = new File ("data/Training Images/0_00.bmp");
		files[1] = new File ("data/Training Images/1_00.bmp");
		files[2] = new File ("data/Training Images/2_00.bmp");
		files[3] = new File ("data/Training Images/3_00.bmp");
		files[4] = new File ("data/Training Images/4_00.bmp");
		
		ArrayList<double[][]> inputs = new ArrayList<double[][]>();
		for(int i = 0; i < files.length; i++ ) {
			try {
				inputs.add(NeocognitronStructure.readImage(files[i]));
			}
			catch (IOException e) {
				System.out.println("\nERROR!");
			}
		}
		

		files = new File[15];
		files[0] = new File ("data/Training Images/0_01.bmp");
		files[1] = new File ("data/Training Images/1_01.bmp");
		files[2] = new File ("data/Training Images/2_01.bmp");
		files[3] = new File ("data/Training Images/3_01.bmp");
		files[4] = new File ("data/Training Images/4_01.bmp");
		files[5] = new File ("data/Training Images/0_02.bmp");
		files[6] = new File ("data/Training Images/1_02.bmp");
		files[7] = new File ("data/Training Images/2_02.bmp");
		files[8] = new File ("data/Training Images/3_02.bmp");
		files[9] = new File ("data/Training Images/4_02.bmp");
		files[10] = new File ("data/Training Images/0_03.bmp");
		files[11] = new File ("data/Training Images/1_03.bmp");
		files[12] = new File ("data/Training Images/2_03.bmp");
		files[13] = new File ("data/Training Images/3_03.bmp");
		files[14] = new File ("data/Training Images/4_03.bmp");
		
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


