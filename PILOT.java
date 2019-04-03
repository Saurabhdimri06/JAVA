import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


class PILOT extends Thread {
	private JFrame f = new JFrame("PILOT");
	JPanel p1;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	 PILOT() {
		 
		 start();
	 }
	 
	 public void start() 
	 {
	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,300);
		f.setVisible(true);
		
		
		//p1 = new JPanel();
		//p1.setBackground(Color.red);
		
		
		ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\MISSILES.jpg");
	    JLabel lable = new JLabel(ii);
	    JScrollPane jsp = new JScrollPane(lable);
		
		b1 = new JButton("Fight");
		b1.setSize(new Dimension(90, 30));
		b1.setLocation(50, 10);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				new Fight();
			}
			
		});
		

		b2 = new JButton("Flight");
		b2.setSize(new Dimension(90, 30));
		b2.setLocation(250, 10);
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{			
				f.dispose();
				new Flight();
				//JOptionPane.showMessageDialog(null,"Dialogue");
			}
			
		});
		
		b3 = new JButton("Go Back");
		b3.setSize(new Dimension(90, 30));
		b3.setLocation(50, 220);
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				new display();
				//JOptionPane.showMessageDialog(null,"RUNNING PILOT CLASS");
			}
			
		});
		
		b4 = new JButton("Land");
		b4.setSize(new Dimension(90, 30));
		b4.setLocation(250, 220);
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				new land();
				//JOptionPane.showMessageDialog(null,"RUNNING PILOT CLASS");
			}
			
		});
	
		//p1.add(b1);
		//p1.add(b2);
		//p1.add(b3);
		//p1.add(b4);
		//p.add(field,BorderLayout.AFTER_LAST_LINE);	
		//f.add(p1);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(jsp);
		
	}
}