import javax.swing.JOptionPane;

public class flares extends Thread
{
	flares()
	{
		display();
	}
	
	public void display() 
	{
		
		try 
		{
			System.out.print("\n \n \n \n \n \n \n \n \n \n");
			sleep(1000);
			System.out.println("******************DEPLOYING FLARES****************");
			sleep(1000);
			System.out.println("Missile Location detected");
			sleep(1000);
			System.out.println("SHOOTING FLARES!!!!!");
			sleep(1000);
			System.out.println("SAVED FROM MISSILE");
			sleep(1000);
			String in = JOptionPane.showInputDialog("Action to take -- explore air or land ");
			int i = -1;
			while (i<0)
			{
				switch(in) 
				{
					case "explore" : i++; 
						System.out.println("COMMAND CONFIRMED -- Flight command overriding");
									new Flight();
									break;
									
					case "land" : i++; 
						System.out.println("COMMAND CONFIRMED -- Flight command overriding");
					sleep(1000);
					System.out.println("\n \n \n \n \n \n \n \n \n \n \n");
					
					System.out.println("HomeBase to Ranger 1 Permission to Fall Back Granted");
					sleep(2000);
					System.out.println("Ranger 1 return to launchpad immediately");
					sleep(2000);
					System.out.println("Beware of the air while returning back ");
					sleep(2000);				
					new land();
					break;
					
					default : System.out.println("Command needed explore or land");
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
