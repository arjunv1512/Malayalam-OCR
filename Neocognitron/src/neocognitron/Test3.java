package neocognitron;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Test3 {
	private static File[] images;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File f1=new File("data/Saved Networks/BestNeocognitron-ch-0-8.neo");
		File f2=new File("data/Saved Networks/BestNeocognitron-ch-10-14.neo");
		File f3=new File("data/Saved Networks/BestNeocognitron-ch16_20.neo");
		Neocognitron n1=Neocognitron.OpenNeocognitron(f1);
		NeocognitronStructure  s1= n1.getStructure();
		Neocognitron n2=Neocognitron.OpenNeocognitron(f2);
		NeocognitronStructure  s2= n2.getStructure();
		Neocognitron n3=Neocognitron.OpenNeocognitron(f3);
		NeocognitronStructure  s3= n3.getStructure();
		int i=0;
		
		File f4=new File("data/seg images");
		images=f4.listFiles();
		Comparator<File> comp=new Comparator<File>() {
			
			@Override
			public int compare(File o1, File o2) {
				// TODO Auto-generated method stub
				return getFileId(o1).compareTo(getFileId(o2));
			}
		};
		Arrays.sort(images,comp);
		for(File image:images)
		{
			
		File f5;
		f5=image;
		double [][] i1 =	s1.readImage(f5);
		double [][] i2 =	s2.readImage(f5);
		double [][] i3 =	s3.readImage(f5);
		
		//System.out.println(input);
		
		int o1=n1.propagate(i1, false);
		int o2=n2.propagate(i2, false);
		int o3=n3.propagate(i3, false);
		//System.out.println(output);
		switch (o1)
		{
		case 14: System.out.print("ഇ");
		break;
		case 2: System.out.print("എ");
		break;
		case 24: System.out.print("5");
		break;
		case 33: System.out.print("7");
		break;
		case 39: System.out.print("8");
		break;
		case 21: 
			if((o2==13)&&((o3==1)||(o3==21)||(o3==28)))
			System.out.print("അ");
			else if((o2==13)&&((o3==21)||(o3==28)))
				System.out.print("10");
			else if((o2==33)&&(o3==28))
			System.out.print("18");
			else if((o2==33)&&(o3==0))
				System.out.print("19");
			else if((o3==8)&&((o2==13)||(o3==33)))
				System.out.print("20");
		break;
		case 10: 
			if((o2==13)&&((o3==1)||(o3==28)))
					System.out.print("ഉ");
			else if((o2==13)&&((o3==21)||(o3==28)))
				System.out.print("10");
		break;
		case 38:
			if((o2==13)&&(o3==38))
				System.out.print("ഒ");
			else if((o2==8)&&(o3==20))
					System.out.print("17");
		break;
		case 26:
			if(((o2==13)||(o2==9)||(o2==6))&&((o3==28)||(o3==23)))
				System.out.print("6");
			else if((o2==36)&&(o3==27))
					System.out.print("11");
			break;
		case 27:
			if((o2==13)&&((o3==28)||(o3==21)))
				System.out.print("10");
			else if((o2==33)&&(o3==28))
					System.out.print("18");
			break;
		case 36:
			if((o2==9)&&(o3==20))
				System.out.print("17");
			else if(((o2==33)||(o2==13))&&(o3==8))
					System.out.print("20");
			break;
		case 40:
			if((o2==9)&&(o3==20))
				System.out.print("13");
			else if(((o2==33)||(o2==13))&&(o3==8))
				System.out.print("20");
			break;
		case 44:
			if((o2==9)&&(o3==20))
				System.out.print("13");
			break;
		case 49:
			if((o2==9)&&(o3==20))
				System.out.print("17");
			break;
			default:
				System.out.println(" ch not in database");
				break;
		}
		}
	}
	private static Integer getFileId(File file)
	{
		String fileName=first(file.getName().split(".bmp"));
		String fileId=last(fileName.split("_"));
		return Integer.parseInt(fileId);
	}
	private static <T> T last(T[] array)
	{
		return array[array.length - 1];
	}
	private static <T> T first(T[] array) {
		return array[0];
	}
}


