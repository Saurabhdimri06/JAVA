
public class sleeping extends Thread
{
	sleeping()
	{
		display();
	}

	public void display() 
	{
		
		System.out.println("*************This is the method to implement thread*************");
		try 
		{
			System.out.println("To implement thread class we have to used it between try and catch block");
			sleep(1000);
			System.out.println("This is the first output Now next one will be printed after 2 seconds");
			sleep(2000);
			System.out.println("This is the second output");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String args[]) 
	{
		new sleeping();
	}
}
