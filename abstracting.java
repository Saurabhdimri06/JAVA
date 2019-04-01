//Here the use of abstract class is shown 
//In abstract class if there is any abstract method defined then we have to redefine the same in the main class to
//ensure it's usage


abstract class sum
{
	abstract void add();
	int i = 10;
	int j = 20;
	void mul() 											//Not an abstract method hence no overriding is required
	{
		System.out.println("");
		System.out.println("Invoking mthod of abstract class");
		System.out.println("The multiplication of "+i+" and "+j+" is : "+(i*j));
	}
}

class abstracting extends sum 
{
	public void add() 									//Abstract method so overriding in main class is required
	{
		System.out.println("Invoking members and method of abstract class after overriding");
		System.out.println("The sum of "+i+" and "+j+" is: "+(i+j));
	}
	
	public static void main(String args[]) 
	{
		abstracting obj = new abstracting();
		obj.add();
		obj.mul();
	}
}
