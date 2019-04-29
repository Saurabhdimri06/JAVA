package work;

import java.util.Scanner;
public class checkString 
{
	public static void main(String args[]) 
	{
		try {
			int flag = 0;
			Scanner sc = new Scanner(System.in); 
			String[] s1 = new String[5];
			String s2 = "not";
			
			System.out.println("Enter the string you want to check");
			for(int i = 0; i< 5; i++) 
			{
				s1[i] = sc.next();
			}
			for(int i = 0; i< 5; i++) 
			{
				System.out.println(s1[i]);
				if(s1[i].equals(s2)) 
				{
					flag = 1;
				}
			}
			sc.close();
			if(flag == 1) {System.out.println("Negative String");}
			else {System.out.println("Positive String");}
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}
}
