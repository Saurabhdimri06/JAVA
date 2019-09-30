package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileInputandOutputReader 
{
	public static void main(String args[]) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the path of the file : ");
			String path;
			path = sc.next();
			File file = new File (path);
			FileOutputStream fout = new FileOutputStream(path);
			if(file.exists()) 
			{
				String s = "Hello Writing Something in the file";
				byte b[] = s.getBytes();
				fout.write(b);
				fout.close();
				System.out.println("Contents Written");
			}
			else 
			{
				file.createNewFile();
				String s = "Hello Writing Something in the file Let's see what happens";
				byte b[] = s.getBytes();
				fout.write(b);
				System.out.println("Contents Written");
				fout.close();
			}
			
			FileInputStream fin = new FileInputStream(path);
			int i = 0;
			System.out.println("\nReading Contents of the file\n");
			while((i=fin.read())!=-1) 
			{
				System.out.print((char)i);
			}
			fin.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
