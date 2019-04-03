import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Flight extends Thread
{
	
	private JFrame f = new JFrame("PILOT");
	JPanel p1;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	
	static double altitude = 15000 ;
	static double la = 38.898648 ;
	static double lo = 77.037692 ;
	static double speed = 400;
	static int i = 0;
	static double fuel= 5000;
	
	 Flight() {
		 
		 start();
	 }
	 
	 public void start() 
	 {
	
			
			
		try 
		{
			/*if() 
			{
				
			}
			else 
			{
				
			}
			*/
			System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n");
			sleep(1000);
			System.out.println("MANUAL FLIGHT COMMAND ACCEPTED!!!!!");
			sleep(2000);
			System.out.println("Click button to move to the direction");
			sleep(1000);
			JOptionPane.showMessageDialog(null,"Loading flight panel");

			
			
			
			
			sleep(1000);
			System.out.println("CURRENT ALTITUDE: "+altitude+"ft");
			sleep(1000);
			System.out.println("CURRENT Longitude: "+lo+"N");
			sleep(1000);
			System.out.println("CURRENT Latitude: "+la+"W");
			sleep(1000);
			System.out.println("CURRENT SPEED: "+speed+"mph");
			sleep(1000);
		} 
			
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
		 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(650,450);
		f.setVisible(true);
		
		
		ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\control.jpeg");
	    JLabel lable = new JLabel(ii);
	    JScrollPane jsp = new JScrollPane(lable);
		
	    
		
		b1 = new JButton("UP");
		b1.setSize(new Dimension(90, 30));
		b1.setLocation(270, 55);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(i<=12) 
				{
					i++;
					System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n");
					System.out.println("Gaining the altitude");
					altitude += 1000;
					fuel -= 100;
					if(altitude > 20000) 
					{
						JOptionPane.showMessageDialog(null,"Flying Dangerously High Lower altitude immediately");
					}
					System.out.println("New Altitude :"+altitude+"ft");
					System.out.println("Fuel Remaining :"+fuel+"l");
				}
				else 
				{
					f.dispose();
					new display();
				}
			}	
				
		});
		
		b2 = new JButton("DOWN");
		b2.setSize(new Dimension(90, 30));
		b2.setLocation(270, 330);
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(i<=12) 
				{
					i++;
					System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n");
					System.out.println("Dropping the altitude");
					altitude -= 1000;
					
					if(altitude < 10000) 
					{
						JOptionPane.showMessageDialog(null,"Flying Low Raise altitude immediately");
					}	
					System.out.println("New Altitude :"+altitude+"ft");
				}
				else 
				{
					f.dispose();
					new display();
				}
			}
		});
		
		
		b3 = new JButton("LEFT");
		b3.setSize(new Dimension(90, 30));
		b3.setLocation(50, 189);
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(i<=12) 
				{
					i++;
					System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n");
					System.out.println("Changing the Course doing a Left Dive");
					la = la + 0.001023;
					lo = lo + 0.000145;
					System.out.println("New Longitude: "+lo+"N");
					System.out.println("New Latitude: "+la+"W");
				}
				else 
				{
					f.dispose();
					new display();
				}
			}
		});
		
		
		b4 = new JButton("RIGHT");
		b4.setSize(new Dimension(90, 30));
		b4.setLocation(500, 189);
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(i<=12) 
				{
					i++;
					System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n");
					System.out.println("Changing the Course doing a Right Dive");
					la = la - 0.001023;
					lo = lo - 0.000145;
					System.out.println("New Longitude: "+lo+"N");
					System.out.println("New Latitude: "+la+"W");
				}
				else 
				{
					f.dispose();
					new display();
				}
			}
				
		});
		
		b5 = new JButton("FRONT");
		b5.setSize(new Dimension(90, 30));
		b5.setLocation(270, 189);
		b5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(i<=12) 
				{
					i++;
					System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n");
					System.out.println("Bossting for max front speed!!!");
					speed += 25;
					fuel -= 100;
					System.out.println("New Speed: "+speed+"mph");
					System.out.println("Fuel Remaining :"+fuel+"l");
				}
				else 
				{
					f.dispose();
					new display();
				}
			}
				
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		f.add(jsp);
		
	 }

}
