
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


class Co_Pilot extends Thread {
	//CREATING THE NEW FRAME
	JFrame f = new JFrame("CO - PILOT");
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	//PANEL DEFINING
	//JPanel p1;
	
	//CONSTRUCTOR CALLING
	 Co_Pilot() 
	 {
		 start();
	 }
	 
	 
	 public void run() 
	 {
		
		try 
		{
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			 sleep(2000);
			 System.out.println("***********************SWITCHING CONTROLS TO CO-PILOT*********************");
			 sleep(1000);
			 System.out.println("SYSTEM WORKING SMOOTHLY!!");
			 sleep(1000);
			 System.out.println("OVERRIDING ACCEPTED!!");
			 sleep(1000);
			 System.out.println("CO-PILOT UP AND RUNNING!!");
			 sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		show();
	}

	 public void show() 
	 {
		 try {
			 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			 System.out.println("***********************Loading Co-Pilot Command Screen*********************");
			 sleep(2000);
			
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(400,250);
			f.setVisible(true);
			
			//p1 = new JPanel();
			//p1.setBackground(Color.yellow);
			
			
			//TO ADD IMAGE
		    ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\COPILOT1.jpg");
		    JLabel lable = new JLabel(ii);
		    JScrollPane jsp = new JScrollPane(lable);
			
			b3 = new JButton("GO BACK");
			b3.setSize(new Dimension(90, 30));
			b3.setLocation(250, 70);
			b3.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					f.dispose();
					new display();
					//JOptionPane.showMessageDialog(null,"RUNNING PILOT CLASS");
				}
				
			});
			
			
			
			b4 = new JButton("IN FLIGHT");
			b4.setSize(new Dimension(90, 30));
		    b4.setLocation(50, 70);
			b4.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					f.dispose();
					new checked();
					//JOptionPane.showMessageDialog(null,"RUNNING PILOT CLASS");
				}
				
			});
			
			/*
		    //TO ADD CREATE CHECK BOXES
			p1.add(cb);
			p1.add(cb1);
			p1.add(cb2);
			p1.add(cb3);
			p1.add(cb4);
			p1.add(cb5);
			p1.add(cb6);
			p1.add(cb7);
			p1.add(cb8);
			p1.add(cb9);
			p1.add(cb11);
			p1.add(cb12);
			p1.add(cb13);
			p1.add(cb14);
			
			//ADDING BUTTONS
			p1.add(b4);
			p1.add(b3);
			*/
			
			//ADDING FRAME
			//f.add(p1);
			
			f.add(b3);
			f.add(b4);
			f.add(jsp);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
}