package test;

import java.util.Iterator;
import java.util.Vector;

public class VectorString 
{
	public static void main(String args[]) 
	{
	Vector<String> v = new Vector<String>();
	v.add("Hi");
	v.add("SAURABH");
	v.add("This");
	v.add("Side");
	
	Iterator i = v.iterator();
	while(i.hasNext())
		System.out.print(i.next()+" , ");

	}
}
