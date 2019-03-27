//This is a basic if-else program used to check if the age entered by the iuser is eligible for vote or not


import java.util.Scanner;
public class ifElse 
{
	ifElse()
	{
		display();
	}
	
	public void display() 
	{
		System.out.println("********THIS PROGRAM IS USED TO DISPLAY BASIC IF ELSE ***********");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you age : ");
		int i = sc.nextInt();
		if(i<18) 
		{
			i = 18-i;
			System.out.println("You are not eligible to give vote ");
			System.out.println("You have to wait for "+i+" years more");
		}
		else 
		{
			System.out.println("You are eligible to give Vote!!!");
		}
		
	}
	
	public static void main(String args[]) 
	{
		new ifElse();
	}
}
