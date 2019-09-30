//This is a basic while program used to calculate factorial of a number

import java.util.Scanner;

public class whilE 
{
	whilE()
	{
		display();
	}
	
	public void display() 
	{
		
		System.out.println("***********CODE TO CALCULATE FACTORIAL OF A NUMBER**********");
		System.out.print("Enter the number whoose factorial you want to calculate: ");
		Scanner sc = new Scanner(System.in);								//Defining variable sc used to take input
		int i = sc.nextInt();												//TO take user input as an integer type
		int j = 1;
		int fact = 1;
		while(j <= i)
		{
			fact = fact*j;
			j++;
		}
		System.out.println("The factorial of number "+i+" is : "+fact);
	}
	
	public static void main(String args[]) 
	{
		
		new whilE();
	}
}
