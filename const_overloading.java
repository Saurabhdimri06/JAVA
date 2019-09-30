//Basics of constructor overloading


public class const_overloading 
{
	const_overloading()												//Constructor with no arguments
	{
		System.out.println("Calling default constructor");
	}
	const_overloading(int a)										//Parameterized constructor with 1 argument
	{
		System.out.println("Calling Parameterized constructor 1");
		System.out.println("Value of a is : "+a);
	}
	const_overloading(int a, int b)									//Parameterized constructor with 2 arguments
	{
		System.out.println("Calling Parameterized constructor 2");
		System.out.println("Value of a is : "+a+" and b is : "+b);
	}
	
	public static void main(String args[]) 
	{
		
		const_overloading a = new const_overloading();				//Declaring Objects a,b,c
		const_overloading b = new const_overloading(10);
		const_overloading c = new const_overloading(10,20);
	}
}
