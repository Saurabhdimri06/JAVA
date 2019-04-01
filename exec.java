//An Exception Handling Program
import java.util.Scanner;

public class exec
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("***************Exception Handling**************");
			System.out.print("Enter first value : ");
			int i = sc.nextInt();
			System.out.print("Enter second value (preferably 0 or any other alphabet): ");
			int j = sc.nextInt();
			System.out.print("The division is  : "+(i/j));
		}
		catch(Exception e)
		{
			System.out.println(e + " => Is the error faced by the try block");
		}
	}
}
