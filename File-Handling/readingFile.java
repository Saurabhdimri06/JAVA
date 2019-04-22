package work;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class readingFile 
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int g = 1;
		FileReader fr = null;
		while(g>=1) 
		{
			try 
			{	
				System.out.print("Enter the path of the file you want to search: ");
				String s;
				s = sc.nextLine();
				File file = new File(s);
				if(file.exists()) 
				{
					g--;
					System.out.println("File FOUND");
					System.out.println("==============THE CONTENTS OF FILE ARE============");
					/*read = new Scanner(file);
					while (read.hasNextLine())
						System.out.println(sc.nextLine());
					*/
					
					fr = new FileReader(file);
					int ch;
					while((ch =fr.read())!= -1) 
					{
						System.out.print((char)ch);
					}
					
				}
				else 
				{
					System.out.println("File NOT FOUND");
				}

			}
	
			catch (Exception e) 
			{
				System.out.println(e);
			}	
		}	
	}
}
