import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Fight extends Thread 
{
	JFrame f = new JFrame("Fight");
	JButton b1;
	JButton b2;
	JButton b3;


	Fight()
	{
		show();
	}
	
	public void show() 
	{
		
		
		System.out.println("\n \n \n \n \n \n \n ");
		System.out.println("********************Booting up the system to FIGHT MODE***********************");
		try 
		{
			sleep(1000);
			System.out.println("Loading Missiles and guns!!!!");
			sleep(1000);
			System.out.println("Manual Overriding the controls!!");
			sleep(1000);
			System.out.println("Authorising access to pilot");
			
			sleep(2000);
			
			int g = -1;
			while(g<0) 
			{
				String input = JOptionPane.showInputDialog("Please enter firing code to warm up missiles and guns");
				String s1 = "qwert";
				if(input.equals(s1))
				{
					g++;
					System.out.println("Overriding completed");
					sleep(500);
					System.out.println("Please select the firing Mode");
					sleep(500);
				
					JOptionPane.showMessageDialog(null,"RUNNING FIRING FRAME");
				}	
				else 
				{
					System.out.println("Invalid Command");
				}
			}
		}
		catch(Exception e1) 
		{
			System.out.println(e1);
		}
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(650,450);
		f.setVisible(true);
		
		
		ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\MnG.jpeg");
	    JLabel lable = new JLabel(ii);
	    JScrollPane jsp = new JScrollPane(lable);
		
		b1 = new JButton("Missiles");
		b1.setSize(new Dimension(110, 50));
		b1.setLocation(110, 270);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				new Missiles();
				//JOptionPane.showMessageDialog(null,"RUNNING PILOT CLASS");
			}	
		});
		
		b2 = new JButton("Nose Gun");
		b2.setSize(new Dimension(110, 50));
		b2.setLocation(410, 270);
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				new gun();
				//JOptionPane.showMessageDialog(null,"RUNNING PILOT CLASS");
			}	
		});
		
		b3 = new JButton("Flares");
		b3.setSize(new Dimension(110, 50));
		b3.setLocation(260, 170);
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				new flares();
				//JOptionPane.showMessageDialog(null,"RUNNING PILOT CLASS");
			}	
		});
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.add(jsp);
	}
}