package work;
import java.util.ArrayList;

public class PassingArrayList 
{
	public static void main(String args[]) 
	{	
		ArrayList<String> a = new ArrayList<String>();
		a.add("Saurabh");
		a.add("Dimri");
		a.add("Divyanshu");
		a.add("Manoj");
		a.add("Satyam");
		System.out.println("*********Array Created**********\n");
		System.out.print("The elements of array are: ");
		display(a);
		System.out.print("The size of array is: ");
		getSize(a);

	}

private static void getSize(ArrayList<String> a) 
{
	System.out.println(a.size());
}

static void display(ArrayList<String> arrayList1) 
	{
		arrayList1.add("Sundaram");
		System.out.println(arrayList1); // passing the arraylist values and
                                    // adding the element
	}
}