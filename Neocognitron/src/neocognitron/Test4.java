package neocognitron;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Test4 {
	private static File[] images;
	static StringBuilder b = new StringBuilder();
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File f1=new File("data/Saved Networks/BestNeocognitron-ch_0-8.neo");
		File f2=new File("data/Saved Networks/BestNeocognitron-ch-10-14.neo");
		File f3=new File("data/Saved Networks/BestNeocognitron-ch16_20.neo");
		File f4=new File("data/Saved Networks/BestNeocognitron-ch_con.neo");
		File f5=new File("data/Saved Networks/BestNeocognitron-ch_21-26.neo");
		Neocognitron n1=Neocognitron.OpenNeocognitron(f1);
		NeocognitronStructure  s1= n1.getStructure();
		Neocognitron n2=Neocognitron.OpenNeocognitron(f2);
		NeocognitronStructure  s2= n2.getStructure();
		Neocognitron n3=Neocognitron.OpenNeocognitron(f3);
		NeocognitronStructure  s3= n3.getStructure();
		Neocognitron n4=Neocognitron.OpenNeocognitron(f4);
		NeocognitronStructure  s4= n4.getStructure();
		Neocognitron n5=Neocognitron.OpenNeocognitron(f5);
		NeocognitronStructure  s5= n5.getStructure();

		File f6=new File("data/segmented");
		images=f6.listFiles();
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
			
		File f7;
		f7=image;
		double [][] i1 =	s1.readImage(f7);
		double [][] i2 =	s2.readImage(f7);
		double [][] i3 =	s3.readImage(f7);
		double [][] i4 = 	s4.readImage(f7);
		double [][] i5 = 	s4.readImage(f7);
		
		//System.out.println(input);
		
		int o1=n1.propagate(i1, false);
		int o2=n2.propagate(i2, false);
		int o3=n3.propagate(i3, false);
		int o4=n4.propagate(i4, false);
		int o5=n5.propagate(i5, false);
		//System.out.println(output);
		switch (o1)
		{
		
		case 19: System.out.print("ക ");
		b.append("ക");
		break;
		case 9: System.out.print("ഒ ");
		b.append("ഒ");
		break;
		case 12: System.out.print("ച ");
		b.append("ച");
		break;
		case 45: System.out.print("ജ ");
		b.append("ജ");
		break;
		case 44: 
			if(o2==13)
				{System.out.print("ഇ ");
				b.append("ഇ ");
				}
			else if((o2==9)&&(o3==28)&&(o4==29))
				{System.out.print("ട ");
				b.append("ട ");
				}
		break;
		case 57: System.out.print("ഡ ");
		b.append("ഡ ");
		break;
		case 55: 
			if((o2==13)&&(o3==28))
			{System.out.print("അ ");
			b.append("അ ");
			}
			
			else if((o2==33)&&(o3==28)&&((o4==18)||(o4==46)||(o4==15)))
				{System.out.print("ന ");
				b.append("ന ");
				}
			else if((o2==33)&&((o3==28)||(o3==0)))
				{System.out.print("ണ ");
				b.append("ണ ");
				}
			else if((o2==9)&&(o3==1)&&(o4==29))
				{System.out.print("ഒ ");
				b.append("ഒ ");
				}
			else if((o2==9)&&(o3==1)&&(o4==26))
				{System.out.print("ജ ");
				b.append("ജ ");
				}
			else if((o2==14)&&(o3==28)&&(o4==46)&&(o5==15))
			{System.out.print("! ");
			b.append("! ");
			}
			else if(((o2==11)&&(o5==1))||(o2==13)&&((o3==19)&&(o4==25)&&(o5==1)))
			{System.out.print("ി ");
			b.append("ി ");
			}
			else if((o2==13)&&(o3==21)&&(o4==25)&&(o5==27))
			{System.out.print("വ ");
			b.append("വ ");
			}
			else if(((o2==13)&&(o3==28)&&(o4==46)&&(o5==18))||((o2==9)&&(o3==28)&&(o4==46)&&(o5==18)))
			{System.out.print("24 ");
			b.append("24 ");
			}
			else if((o2==13)&&(o3==19)&&(o4==25)&&((o5==16)||(o5==1)))
			{System.out.print("ാ ");
			b.append("ാ ");
			}
		break;
		case 52: 
			if((o2==13)&&(o3==28))
					{System.out.print("എ ");
					b.append("എ ");
					}
			else if(((o2==13)||(o2==3))&&((o3==0)||(o3==1)))
				{System.out.print("ഡ ");
				b.append("ഡ ");
				}
			else if((o2==13)&&(o3==21)&&(o4==29))
				{System.out.print("ഒ ");
			b.append("ഒ");}
		break;
		
		case 36:
			if((o2==13)&&(o3==21)&&((o4==29)||(o4==18)))
				{System.out.print("ര ");
				b.append("ര ");
				}
			else if((o2==10)&&(o3==1)&&((o4==29)||(o4==18)))
				{System.out.print("ര ");
				b.append("ര ");
				}
			else if((o2==9)&&(o3==20))
				{System.out.print("ധ ");
				b.append("ധ ");
				}
			else if((o2==33)&&(o3==28))
				{System.out.print("ന ");
				b.append("ന ");
				}
			else if((o2==10)&&(o3==21)&&(o4==25))
					{System.out.print("മ ");
					b.append("മ ");
					}
			else if((o2==33)&&(o3==14))
				{System.out.print("ങ ");
				b.append("ങ ");
				}
			else if((o2==10)&&(o3==21)&&(o4==29))
				{System.out.print("ഒ ");
				b.append("ഒ");
				}
			else if((o2==10)&&(o3==21)&&(o4==15))
				{System.out.print("ദ ");
				b.append("ദ ");
				}
			else if((o2==13)&&(o3==21)&&(o4==15))
				{System.out.print("ദ ");
				b.append("ദ ");
				}
			else if(((o2==13)&&(o3==21)&&(o4==25))&&((o5==28)||(o5==12)))
				{System.out.print("ദ ");
				b.append("ദ ");
				}
			else if(((o2==13)&&(o3==21)&&(o4==25)&&(o5==27))||((o2==9)&&(o3==28)&&(o4==15)&&(o5==18)))
			{System.out.print("വ ");
			b.append("വ ");
			}
			else if((o2==10)&&(o3==21)&&(o4==25)&&(o5==28))
			{System.out.print("24 ");
			b.append("24 ");
			}
			break;
		case 59: 
			if(((o2==9)||(o2==6))&&((o3==23)||(o3==28)))
					{System.out.print("ച ");
					b.append("ച");
					}
			else if((o2==36)&&(o3==27))
				{System.out.print("ഫ ");
				b.append("ഫ ");
				}
		break;
		case 33:
			if((o2==36)&&(o3==27))
				{System.out.print("ഫ ");
				b.append("ഫ ");
				}
			else if(((o2==10)&&(o3==28)&&(o4==27))||((o2==9)&&(o3==28)&&(o4==18)))
				{System.out.print("ട ");
				b.append("ട ");
				}
			else if((o2==9)&&(o3==20)&&(o4==18))
				{System.out.print("ധ ");
				b.append("ധ ");
				}

				
		break;
		case 18:
			if((o2==9)&&(o3==20)&&(o4==15))
				{System.out.print("ഗ ");
				b.append("ഗ ");
				}
			else if((o2==33)&&((o3==0)||(o3==28)))
				{System.out.print("ണ ");
				b.append("ണ ");
				}
			else if((o2==9)&&(o3==20)&&(o4==18))
				{System.out.print("ധ ");
				b.append("ധ ");
				}
				
		break;
		case 48:
			if((o2==9)&&(o3==20)&&(o4==15))
				{System.out.print("ഗ ");
				b.append("ഗ ");
				}
		break;
		case 49:
			if((o2==9)&&(o3==20)&&(o4==15))
				{System.out.print("ഗ ");
				b.append("ഗ ");
				}
		break;
		case 29:
			if((o3==21)&&(o2==13))
				{System.out.print("മ ");
				b.append("മ ");
				}
		break;
		case 32:
			if((o2==13)&&((o3==1)||(o3==28)))
			{System.out.print("ഉ ");
			b.append("ഉ ");
			}
			else if((o3==21)&&((o2==10)||(o2==13)))
				{System.out.print("മ ");
				b.append("മ ");
				}
			else if((o2==13)&&(o3==8))
				{System.out.print("ങ ");
				b.append("ങ ");
				}
			else if((o2==9)&&(o3==1)&&(o4==26))
				{System.out.print("ജ ");
				b.append("ജ ");
				}
		break;
		case 6:
			if((o2==33)&&(o3==28))
				{System.out.print("ന ");
				b.append("ന ");
				}
			else if((o2==13)&&(o3==28))
				{System.out.print("ങ ");
				b.append("ങ ");
				}
			break;
		case 43:
			if(o5==1)
			{System.out.print("ി ");
			b.append("ി ");
			}
		break;
		case 22:
			if((o5==16)||(o5==7))
			{System.out.print("25 ");
			b.append("25 ");
			}
			break;
			default:
				System.out.print("# ");
				b.append("# ");
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
	public String welcome()
	{
		String a1;
		a1=b.toString();
		return a1;
	}
}


