package work;

import java.util.*;  

class ArrayList_Collection
{  
   public static void main(String args[])
   {  
      ArrayList<String> alist=new ArrayList<String>();
      int n;
      String s;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the elemets you want to enter in the String: ");
      n = sc.nextInt();
      for(int i = 0 ; i < n ; i++) 
      {
    	  s = sc.next();
    	  alist.add(s);
      }
      System.out.println(alist);			//displaying elements
      System.out.println("Adding a new elemet Steve to the String");
      alist.add(3, "Steve");				//Adding "Steve" at the fourth position
      System.out.println(alist);			//displaying elements
   }  
}