//Basic Example to show method overriding
//In java Dynamic MEthod overriding is solved by Dynamic Method Dispatch

public class parent
{
	void box() 
	{
		System.out.println("Calling Box of parent class");
	}
}

public class child extends parent									//Inheriting the Parent class
{
	void box() 														//Overriding the object box in parent and showing output of child show
	{
		System.out.println("Calling Box of child class");			
	}
}


public class overriding 
{
	public static void mian(String args[])
	{
		child c = new child();
		c.box();
		
	}
	
}

