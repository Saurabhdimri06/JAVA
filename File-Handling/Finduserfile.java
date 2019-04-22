package work;

import java.io.File;
import java.util.Scanner;

public class Finduserfile
{
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int g = 1;
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
					System.out.println("File FOUND");
					g--;
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