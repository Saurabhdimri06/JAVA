//Basic For program to calculate the factorial of a number

import java.util.Scanner;
public class for_loop 
{												
	double num;														//Global Variable					
	double fact = 1;
	for_loop()														//Constructor created
	{
		
		show();
	}
	
	public void show() 
	{
		
		System.out.println("**********TO CALCULATE FACTORIAL OF A NUMBER**********");
		System.out.print("Enter the number whoose factorial you want to calculate: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		factorial();
	}
	public void factorial() 
	{
		for(int i = 1; i<=num; i++)									//INITIATING FOR LOOP
		{
			fact *= i;	
		}
		System.out.println("The factorial of number "+num+" is : "+fact);
		
	}
	
	public static void main (String args[]) 
	{
		
		new for_loop();															//Calling
	}
}
