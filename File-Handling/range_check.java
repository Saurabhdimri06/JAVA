package work;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner; 
public class range_check
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    File file = new File("C:\\Users\\Dimri\\Desktop\\android.txt"); 
    Scanner sc = new Scanner(file); 
  
    while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); 
  } 
} 