package neocognitron;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import neocognitron.Neocognitron;
import neocognitron.NeocognitronStructure;
import neocognitron.NeocognitronTrainer;
import neocognitron.OutputConnections;


public class NT1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] files = new File[21];
		files[0] = new File ("data/Training Images/0_00.bmp");
		files[1] = new File ("data/Training Images/1_00.bmp");
		files[2] = new File ("data/Training Images/2_00.bmp");
		files[3] = new File ("data/Training Images/3_00.bmp");
		files[4] = new File ("data/Training Images/4_00.bmp");
		files[5] = new File ("data/Training Images/5_00.bmp");
		files[6] = new File ("data/Training Images/6_00.bmp");
		files[7] = new File ("data/Training Images/7_00.bmp");
		files[8] = new File ("data/Training Images/8_00.bmp");
		files[9] = new File ("data/Training Images/9_00.bmp");
		files[10] = new File ("data/Training Images/10_00.bmp");
		files[11] = new File ("data/Training Images/11_00.bmp");
		files[12] = new File ("data/Training Images/12_00.bmp");
		files[13] = new File ("data/Training Images/13_00.bmp");
		files[14] = new File ("data/Training Images/14_00.bmp");
		files[15] = new File ("data/Training Images/15_00.bmp");
		files[16] = new File ("data/Training Images/16_00.bmp");
		files[17] = new File ("data/Training Images/17_00.bmp");
		files[18] = new File ("data/Training Images/18_00.bmp");
		files[19] = new File ("data/Training Images/19_00.bmp");
		files[20] = new File ("data/Training Images/20_00.bmp");
		ArrayList<double[][]> inputs = new ArrayList<double[][]>();
		for(int i = 0; i < files.length; i++ ) {
			try {
				inputs.add(NeocognitronStructure.readImage(files[i]));
			}
			catch (IOException e) {
				System.out.println("\nERROR!");
			}
		}
		

		files = new File[63];
		files[0] = new File ("data/Training Images/0_01.bmp");
		files[1] = new File ("data/Training Images/1_01.bmp");
		files[2] = new File ("data/Training Images/2_01.bmp");
		files[3] = new File ("data/Training Images/3_01.bmp");
		files[4] = new File ("data/Training Images/4_01.bmp");
		files[5] = new File ("data/Training Images/5_01.bmp");
		files[6] = new File ("data/Training Images/6_01.bmp");
		files[7] = new File ("data/Training Images/7_01.bmp");
		files[8] = new File ("data/Training Images/8_01.bmp");
		files[9] = new File ("data/Training Images/9_01.bmp");
		files[10] = new File ("data/Training Images/10_01.bmp");
		files[11] = new File ("data/Training Images/11_01.bmp");
		files[12] = new File ("data/Training Images/12_01.bmp");
		files[13] = new File ("data/Training Images/13_01.bmp");
		files[14] = new File ("data/Training Images/14_01.bmp");
		files[15] = new File ("data/Training Images/15_01.bmp");
		files[16] = new File ("data/Training Images/16_01.bmp");
		files[17] = new File ("data/Training Images/17_01.bmp");
		files[18] = new File ("data/Training Images/18_01.bmp");
		files[19] = new File ("data/Training Images/19_01.bmp");
		files[20] = new File ("data/Training Images/20_01.bmp");
		files[21] = new File ("data/Training Images/0_02.bmp");
		files[22] = new File ("data/Training Images/1_02.bmp");
		files[23] = new File ("data/Training Images/2_02.bmp");
		files[24] = new File ("data/Training Images/3_02.bmp");
		files[25] = new File ("data/Training Images/4_02.bmp");
		files[26] = new File ("data/Training Images/5_02.bmp");
		files[27] = new File ("data/Training Images/6_02.bmp");
		files[28] = new File ("data/Training Images/7_02.bmp");
		files[29] = new File ("data/Training Images/8_02.bmp");
		files[30] = new File ("data/Training Images/9_02.bmp");
		files[31] = new File ("data/Training Images/10_02.bmp");
		files[32] = new File ("data/Training Images/11_02.bmp");
		files[33] = new File ("data/Training Images/12_02.bmp");
		files[34] = new File ("data/Training Images/13_02.bmp");
		files[35] = new File ("data/Training Images/14_02.bmp");
		files[36] = new File ("data/Training Images/15_02.bmp");
		files[37] = new File ("data/Training Images/16_02.bmp");
		files[38] = new File ("data/Training Images/17_02.bmp");
		files[39] = new File ("data/Training Images/18_02.bmp");
		files[40] = new File ("data/Training Images/19_02.bmp");
		files[41] = new File ("data/Training Images/20_02.bmp");
		files[42] = new File ("data/Training Images/0_03.bmp");
		files[43] = new File ("data/Training Images/1_03.bmp");
		files[44] = new File ("data/Training Images/2_03.bmp");
		files[45] = new File ("data/Training Images/3_03.bmp");
		files[46] = new File ("data/Training Images/4_03.bmp");
		files[47] = new File ("data/Training Images/5_03.bmp");
		files[48] = new File ("data/Training Images/6_03.bmp");
		files[49] = new File ("data/Training Images/7_03.bmp");
		files[50] = new File ("data/Training Images/8_03.bmp");
		files[51] = new File ("data/Training Images/9_03.bmp");
		files[52] = new File ("data/Training Images/10_03.bmp");
		files[53] = new File ("data/Training Images/11_03.bmp");
		files[54] = new File ("data/Training Images/12_03.bmp");
		files[55] = new File ("data/Training Images/13_03.bmp");
		files[56] = new File ("data/Training Images/14_03.bmp");
		files[57] = new File ("data/Training Images/15_03.bmp");
		files[58] = new File ("data/Training Images/16_03.bmp");
		files[59] = new File ("data/Training Images/17_03.bmp");
		files[60] = new File ("data/Training Images/18_03.bmp");
		files[61] = new File ("data/Training Images/19_03.bmp");
		files[62] = new File ("data/Training Images/20_03.bmp");
		
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
