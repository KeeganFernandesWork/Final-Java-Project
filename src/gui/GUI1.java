package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI1 extends JFrame implements ActionListener
{
	JTextField name = new JTextField("Venue Name:      ");
	JTextField avail = new JTextField("Enter Date:        ");
	JTextField username = new JTextField("Enter Name:        ");
	JTextField password = new JTextField("Enter Password:        ");
	JButton go = new JButton("SUBMIT");
	JButton date = new JButton("SUBMIT");
	//JButton un = new JButton("SUBMIT");
	JButton pw = new JButton("SUBMIT");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	//JPanel panel4 = new JPanel();
	ImageIcon image = new ImageIcon(this.getClass().getResource("image1.jpg"));
	JLayeredPane laypa = new JLayeredPane();
	JFrame frame = new JFrame();
	JLabel label = new JLabel(image);
	String TextField;
	

	public GUI1()
	{
		go.addActionListener(this);
		date.addActionListener(this);

		frame.getContentPane().add(laypa,BorderLayout.CENTER);
		panel1.setLayout(new FlowLayout());
		panel1.add(name);
		panel1.add(go);
		panel2.setLayout(new FlowLayout());
		panel2.add(avail);
		panel2.add(date);
		panel3.add(username);
		//panel3.add(un);
		panel3.add(password);
		panel3.add(pw);
		panel.add(label);
		panel.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
		panel1.setBounds(100,100,500,500);
		panel1.setOpaque(false);
		panel2.setBounds(100,250,500,500);
		panel2.setOpaque(false);
		panel3.setBounds(1000,100,500,500);
		panel3.setOpaque(false);
		//panel4.setBounds(300,250,500,500);
		//panel4.setOpaque(false);

		laypa.add(panel,0,0);
		laypa.add(panel1,1,0);
		laypa.add(panel2,1,0);
		laypa.add(panel3,2,0);
		//laypa.add(panel4,2,0);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(1200,600);
		frame.pack();
	}

	@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == go)
			{
				TextField = name.getText();
				JOptionPane.showMessageDialog(null,"Welcome to PLAY_PRO!" + TextField);
			}
			else if(e.getSource() == date)
			{
				TextField = avail.getText();
				JOptionPane.showMessageDialog(null,"It is available");
			}
			else if(e.getSource() == pw)
			{
				JOptionPane.showMessageDialog(null,"You are logged in ");
			}
		}
}

