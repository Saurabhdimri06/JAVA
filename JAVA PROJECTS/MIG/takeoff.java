import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class takeoff extends Thread
{
	
	JFrame f;
	JPanel p;
	JButton b1;
	JButton b2;
	
	
	
	takeoff()
	{
		gui();
	}

	public void gui() 
	{
		int i = -1;
		while(i<0)
		{
			String input = JOptionPane.showInputDialog("Initiate the Checks yes/no");
			String s1 = "yes";
			String s2 = "no";
			if(input.equals(s1))
			{	 
				i++;
				try
				{		
					System.out.println("*********************INITIATING CHECKING FOR FLIGHT!!!!**********************");
					sleep(1500);
					System.out.println("VAR LOGS CHECKED!!!!");
					sleep(1500);
					System.out.println("CONTROL BOX WORKING!!!!");
					sleep(1500);
					System.out.println("AVIONICS STARTED!!!!");
					sleep(1500);
					System.out.println("CARB HEAT BOOSTED!!!!");
					sleep(1500);
					System.out.println("FLAPS UP!!!!");
					sleep(1500);
					System.out.println("FUEL SELECTOR MIXING BOTH!!!!");
					sleep(1500);
					System.out.println("RADAR ON AND WORKING!!!!");
					sleep(1500);
					System.out.println("SONAR ON AND WORKING!!!!");
					sleep(1500);
					System.out.println("NOSE GUNNER AT POINT!!!!");
					sleep(1500);
					System.out.println("TRANSPONDER AND BLACK BOX ON SPOT!!!!");
					sleep(1500);
					System.out.println("BOMBS AND MISSILIES LOADED AND READY FOR ACTION!!!!");
					sleep(1500);
					show();
				}	
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else 
			{
				if(input.contentEquals(s2)) 
				{
					i++;
					try 
					{
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("***********************Skipping Check Sequence*********************");
						sleep(1000);
						
						sleep(1000);
						show();
					}
					catch(Exception e) 
					{
						System.out.println(e);
					}
				}
			}
		}
		
	}
	
	public void show() 
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		try 
		{
			sleep(1000);
			System.out.println("READY FOR TAKE OFF");
			sleep(1000);
			System.out.println("SUITABLE WEATHER FOR FLIGHT");
			sleep(1000);
			System.out.println("OEVRRIDING CONTROLS TO MANUAL");
			sleep(1000);
			System.out.println("BOOSTING THROTTLE");
			sleep(1000);
			System.out.println("STARTING ENGINE");
			sleep(1000);
			System.out.println("INCREASING SPEED");
			sleep(1000);
			System.out.println("CURRENT SPEED - 50 mph");
			sleep(1000);
			System.out.println("CURRENT SPEED - 150 mph");
			sleep(1000);
			System.out.println("TYRES RETRACTED !!!!!");
			sleep(1000);
			System.out.println("CURRENT SPEED - 350 mph");
			sleep(1000);
			System.out.println("READY TO TAKE FLIGHT OVER 500 mph");
			sleep(1000);
			System.out.println("GIVING COMMAND TO USER!!!");
			sleep(1000);
			new display();
		}
		
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		
		
	}
	
}
