package pack1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI1 extends JFrame implements ActionListener
{
	JTextField name = new JTextField("ENTER THE GAME: ");
	JButton go = new JButton("SUBMIT");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	ImageIcon image = new ImageIcon(this.getClass().getResource("image1.jpg"));
	JLayeredPane laypa = new JLayeredPane();
	JFrame frame = new JFrame();
	JLabel label = new JLabel(image);
	String TextField;


	public GUI1()
	{
		go.addActionListener(this);

		frame.getContentPane().add(laypa,BorderLayout.CENTER);
		panel1.setLayout(new FlowLayout());
		panel1.add(name);
		panel1.add(go);
		panel.add(label);
		panel.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
		panel1.setBounds(200,200,500,500);
		panel1.setOpaque(false);

		laypa.add(panel,0,0);
		laypa.add(panel1,1,0);
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
		}
}
