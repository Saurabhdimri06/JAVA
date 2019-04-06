import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class gun extends Thread
{
	

	JFrame f = new JFrame("Missile");
	JButton b1;
	
	gun()
	{
		display();
	}
	
	public void display() 
	{
		try 
		{
			
			System.out.println("\n \n \n \n \n \n \n \n \n \n \n");
			
			System.out.println("*************************NOSE GUN ACCESS GRANTED*****************************");
			sleep(1000);
			System.out.println("NOSE GUN Overriding activating");
			sleep(2000);
			System.out.println("Switching controls to manual");
			sleep(2000);
			System.out.println("Manual firing activated Firing on command");
			sleep(2000);
			System.out.println("GUN HOT AND READY TO ENGAGE");
			sleep(2000);
			JOptionPane.showMessageDialog(null,"Firing panel Activating Hot and Ready for action");
			sleep(2000);
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(300,250);
			f.setVisible(true);
			
			b1 = new JButton("FIRE");
			b1.setSize(new Dimension(80, 30));
			b1.setLocation(100, 0);
			b1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					f.dispose();
					try {
						sleep(2000);
					} catch (InterruptedException e1) 
					{
						e1.printStackTrace();
					}
					
					try
					{
						System.out.println("\n \n \n \n \n \n \n \n \n \n");
						System.out.println("****************Firing NOSE GUNNER************************");
						sleep(250);
						System.out.println("***");
						sleep(250);
						System.out.println("***");
						sleep(250);
						System.out.println("***");
						sleep(250);
						System.out.println("***");
						sleep(250);
						System.out.println("***");
						sleep(1000);
						JOptionPane.showMessageDialog(null,"Nice Shooting Bogie Hit");
					}
					catch(Exception e3)
					{
						System.out.println(e3);
					}
					try 
					{
						sleep(2000);
						int g = -1;
						while(g<0) 
						{
							String input = JOptionPane.showInputDialog("Want to explore the sky or go back to base");
							String s1 = "explore";
							String s2 = "home";
							System.out.println("Command needed explore or home");
							if(input.equals(s1))
							{
								g++;
								System.out.println("\n \n \n \n \n \n \n \n \n \n \n");
								System.out.println("Roger that Uploading the new trajectories to you");
								sleep(1000);
								System.out.println("Homebase asking permission to explore");
								sleep(1000);
								System.out.println("HOMEBASE: Ranger 1 You are clear to explore over!!!!");
								sleep(1000);
								System.out.println("RANGER 1: COPY THAT!");
								sleep(1000);
								
								new Flight();
							}
							else 
							{
								if(input.equals(s2)) 
								{
									g++;
									System.out.println("\n \n \n \n \n \n \n \n \n \n \n");
									System.out.println("Roger that Uploading the trajectories to you");
									sleep(1000);
									System.out.println("Homebase asking permission to Come Back");
									sleep(1000);
									System.out.println("HOMEBASE: Ranger 1 You are clear to return to base over!!!!");
									sleep(1000);
									System.out.println("RANGER 1 copy returning back to base!!");
									sleep(1000);
									new land();
									
									break;
								}		
						
								System.out.println("Valid Command required!");
							}
						}
						
					}
					catch(Exception e2) 
					{
						System.out.println(e2);
					}
				}	
			});
			
		ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\GUN.jpg");
		JLabel lable = new JLabel(ii);
		JScrollPane jsp = new JScrollPane(lable);
		
		f.add(b1);
		
		f.add(jsp);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	
	}
	
}
