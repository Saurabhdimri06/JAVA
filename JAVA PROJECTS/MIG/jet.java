import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class jet
{
	
	JFrame f = new JFrame("START");
	JButton b1;
	
	jet()
	{
		gui();
	}

	void gui() 
	{
	

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(350,230);
		f.setVisible(true);
		
		
		ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\FLIGHT.jpg");
	    JLabel lable = new JLabel(ii);
	    JScrollPane jsp = new JScrollPane(lable);
		
		b1 = new JButton("START");
		b1.setSize(new Dimension(80, 30));
		b1.setLocation(120, 80);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				f.dispose();
				new takeoff();
			}
				
		});
		
		f.add(b1);
		
		f.add(jsp);	
		
	}
	
	public static void main(String args[]) {
		new jet();
	}
}

