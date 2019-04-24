package work;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class miscallneous 
{
	public static void main (String args[]) 
	{
		FileReader fr;
		FileWriter fw;
		try 
		{
			
			File file = new File("C:\\users\\Dimri\\Desktop\\prog3.txt");
			if(file.exists()) 
			{
				System.out.println("File FOUND");
				System.out.println("========= READING FROM FILE ===========");
				System.out.println("Reading the values of the file");
				fr = new FileReader(file);
				int ch;
				while((ch =fr.read())!= -1) 
				{
					System.out.print((char)ch);
				}
				
				System.out.println("/n========= WRITING IN FILE ===========/n");
				System.out.println("\nAppending the new contents in the file");
				String str = "\n\n \n================================\n"
						+"Latest segment added By this code  "+
						"\n ADDED BY SAURABH DIMRI/n /n"; 
		  
		        						// attach a file to FileWriter  
		        fw=new FileWriter(file,true); 
		        fw.write(str);
		        System.out.println("Writing successful/n"); 
		        //close the file  
		        fw.close();
			}
			else 
			{
				System.out.println("File NOT FOUND");
				file.createNewFile();
				System.out.println("New file created");
			}
		}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
