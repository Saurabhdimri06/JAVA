//Implementing thread using runnable interface
class thread1 implements Runnable
{

	public void run() 
	{
		int i;
		for(i=0;i<5;i++) 
		{
			System.out.println("This is output of Thread 1 : "+i);
		}
	}
}

class thread2 implements Runnable
{

	public void run() 
	{
		int i;
		for(i=0;i<5;i++) 
		{
			System.out.println("This is output of Thread 2 : "+i);
		}
	}
}

class runn
{
	
	public static void main(String args[]) 
	{
		thread1 t = new thread1();
		Thread obj = new Thread(t);
		thread2 t1 = new thread2();
		Thread obj1 = new Thread(t1);
		obj.start();
		obj1.start();
	}

}
