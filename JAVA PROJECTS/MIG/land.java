import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class land extends Thread 
{
	JFrame f = new JFrame("LAND");
	JButton b1;
	
	land()
	{
		
		gui();
		
	}
	
	public void gui() 
	{
		
		try 
		{
			System.out.print("\n \n \n \n \n \n \n \n \n \n");
			sleep(2000);
			System.out.println("**************LANDING COMMANDS OVERRIDING***************");
			sleep(2000);
			System.out.println("Landing Sequence Initiated");
			sleep(2000);
			JOptionPane.showMessageDialog(null,"LOADING LANDING FRAME");
			sleep(1000);
			System.out.println("Checking Conditions for Landing");
			sleep(1000);
			System.out.println("FLAPS DOWN!!!!!");
			sleep(1000);
			System.out.println("TIRES OUT!!!!");
			sleep(1000);
			System.out.println("READY TO LAND!!!!");
			sleep(1000);
			System.out.println("STARTING DECREASING ALTITUDE!!!");
			sleep(2000);
				
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(350,230);
		f.setVisible(true);
		
		
		ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\FLIGHT.jpg");
	    JLabel lable = new JLabel(ii);
	    JScrollPane jsp = new JScrollPane(lable);
		
		b1 = new JButton("Land");
		b1.setSize(new Dimension(80, 30));
		b1.setLocation(120, 80);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				try 
				{
					System.out.print("\n \n \n \n \n \n \n \n \n \n");
					System.out.println("HOME BASE VISIBLE!!!!");
					sleep(2000);
					System.out.println("DEPLOYING FLAPS DECREASING ALTITIUDE!!!!");
					sleep(2000);
					System.out.println("DECREASING SPEED AIR BRAKES DEPLOYED!!!!");
					sleep(2000);
					System.out.println("TYRES OUT!!!!");
					sleep(2000);
					System.out.println("CONTACT WITH LAND!!!!");
					sleep(2000);
					System.out.println("APPLYING BRAKES DECREASING SPEED!!!");
					sleep(2000);
					System.out.println("SWITCHING OFF COMMANDS!!!");
					sleep(2000);
					System.out.println("HATCH OPENING!!!!");
					sleep(2000);
					System.out.println("SUCCESS LANDING ALL FUNCTIONS HALTED AND TERMINATED!!!!");
					sleep(2000);
				}
				catch(Exception e1) 
				{
					System.out.println(e1);
				}
			}
				
		});
		
		f.add(b1);
		
		f.add(jsp);	
	}

}
