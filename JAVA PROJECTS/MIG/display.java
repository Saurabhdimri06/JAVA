import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class display 
{
	JFrame f;
	JButton b1;
	JButton b2;
	
	display()
	{
		gui();
	}
	
	public void gui() 
	{
		f = new JFrame("JET");
		f.setVisible(true);
		f.setSize(650,450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*JMenuBar mb = new JMenuBar();
		f.setJMenuBar(mb);
		
		f2 = new JFrame("PILOT");
		f2.setSize(500,400);
		
		JMenu open = new JMenu("Pilot");
		mb.add(open);
		JMenuItem frame = new JMenuItem("Pilot");
		open.add(frame);
		frame.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				f2.setVisible(true);
				f.dispose();
			}
		});
		
		JMenu show = new JMenu("Pilot");
		mb.add(show);
		*/
		
		ImageIcon ii = new ImageIcon("D:\\java\\MIG\\bin\\PnC.jpeg");
		JLabel lable = new JLabel(ii);
		JScrollPane jsp = new JScrollPane(lable);
		
		//p = new JPanel();
		//p.setBackground(Color.red);
		
		b1 = new JButton("Pilot");
		b1.setSize(new Dimension(110, 50));
		b1.setLocation(110, 150);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose();
				new PILOT();
				//JOptionPane.showMessageDialog(null,"RUNNING PILOT");
			}
			
		});
		

		b2 = new JButton("Co-Pilot");
		b2.setSize(new Dimension(110, 50));
	    b2.setLocation(400, 150);
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{			
				f.dispose();
				new Co_Pilot();
				//JOptionPane.showMessageDialog(null,"RUNNING CO PILOT");
			}
			
		});
		
		//p.add(b1);
		//p.add(b2);
		//p.add(field,BorderLayout.AFTER_LAST_LINE);
		
		//f.add(p);
		
		f.add(b1);
		f.add(b2);
		
		f.add(jsp);
	
		
	}
}
