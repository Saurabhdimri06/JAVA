package test;

import java.util.Iterator;
import java.util.Stack;


public class StackImplementation 
{
	public static void main(String args[]) 
	{
		Stack<String> v = new Stack<String>();
		v.push("Hi");
		v.push("SAURABH");
		v.add("This");
		v.add("Side");
		v.pop();
		Iterator i = v.iterator();
		while(i.hasNext())
			System.out.print(i.next()+" , ");
	}
}
