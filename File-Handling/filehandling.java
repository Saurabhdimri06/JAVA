package work;
import java.util.Scanner;
import java.io.File;

public class filehandling {
	public static void main (String args[]) 
	{
		try 
		{
			
			File file = new File("C:\\users\\Dimri\\Desktop\\prog3.txt");
			if(file.exists()) 
			{
				System.out.println("File FOUND");
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
