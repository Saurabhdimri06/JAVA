import javax.swing.JOptionPane;

public class Comms extends Thread{
	
	Comms()
	{
		
		work();
	}

	public void work() 
	{
		try 
		{
	
			System.out.println("\n \n \n \n \n \n \n \n \n \n \n");
			
			System.out.println("*************************ESTABLISHING HOME BASE COMMUNICATION********************************");
			sleep(1000);
			System.out.println("************Resolving RADAR***************");
			System.out.println("Clear air for flight");
			sleep(1000);
			System.out.println("No Bogies for a 30 miles");
			System.out.println("Flight conditions stable");
			sleep(5000);
			System.out.println("RADAR picking a Randon Bogie Signal");
			sleep(2000);
			JOptionPane.showMessageDialog(null,"High Speed Bogie approaching ");
			
			
			int g = -1;
			while(g<0)
			{
				String input = JOptionPane.showInputDialog("Please enter your command");
				String s1 = "engage";
				String s2 = "disengage";
				System.out.println("Command needed engage or disengage");
				if(input.equals(s1))
				{
					g++;
					System.out.println("");
					System.out.println("Initiating");
					sleep(1000);
					
					System.out.println("Authorisation Overriding Activating firing command");
					sleep(1000);
					System.out.println("Fire on command initiated");
					sleep(1000);
					String in = JOptionPane.showInputDialog("Action to take -- Nose Gun or Missiles ");
					
					/*Scanner sc = new Scanner(System.in);
					int c = sc.nextInt();
					*/
					
					String in1 = "Nose Gun";
					String in2 = "Missiles";
					//String in3 = "Heavy Artilery";
						if(in.equals(in1))
						{
							g++;
							new gun();
						}
						else 
						{
							if(in.contentEquals(in2)) 
							{
								g++;
								new Missiles();
							}
							
						}
					}
					else 
					{
						if(input.equals(s2)) 
						{
							System.out.println("\n \n \n \n \n \n \n \n");
							System.out.println("*************Let's Divert the Bogie**************");
							sleep(2000);
							System.out.println("------>>> Deploying flares			");
							sleep(500);
							System.out.println("------>>> GOOD Flares there Let's Roll Out			");
							sleep(2000);
							System.out.println("Ranger 1 to homebase Random Bogie Encountered ");
							sleep(2000);
							System.out.println("Played Safe Request to land back to base");
							sleep(2000);
							System.out.println("\n \n \n \n \n \n \n \n \n \n \n");
							
							System.out.println("HomeBase to Ranger 1 Permission to Fall Back Granted");
							sleep(2000);
							System.out.println("Ranger 1 return to launchpad immediately");
							sleep(2000);
							System.out.println("Beware of the air while returning back ");
							sleep(2000);
							
							new land();
							break;
						}
					
						System.out.println("Command needed to engage or disengage");
					}
				
			}
			
		}	
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
