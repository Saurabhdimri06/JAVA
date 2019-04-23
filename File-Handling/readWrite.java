package work;

import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
class readWrite 
{ 
    public static void main(String args[]) throws IOException 
    { 
        // Accept a string  
        String str = "File Handling in Java using \n"+ 
                " FileWriter and FileReader \n"+
        		"This is the new Written text written By saurabh Dimri"; 
  
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("C:\\users\\Dimri\\Desktop\\output.txt"); 
  
        // read character wise from string and write  
        // into FileWriter
        fw.write(str);
        
  
        System.out.println("Writing successful"); 
        //close the file  
        fw.close();
        System.out.println("");
        System.out.println("Reading the contents of a file"); 
        FileReader fr = new FileReader("C:\\users\\Dimri\\Desktop\\output.txt");
        int ch;
		while((ch =fr.read())!= -1) 
		{
			System.out.print((char)ch);
		}
    } 
}