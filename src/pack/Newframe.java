package pack;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;

public class Newframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newframe frame = new Newframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Newframe() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1397,685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1397, 685);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1407, 685);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon ima = new ImageIcon(Newframe.class.getResource("/pack/image1(1).jpg"));
		Image image = ima.getImage();
		Image newi = image.getScaledInstance(1397,685,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(newi);
		lblNewLabel.setIcon(ima);
		lblNewLabel.setBounds(0, 0, 1384, 685);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setOpaque(true);
		panel_1.setBackground( new Color(255,255,255, 79) );
		layeredPane.setLayer(panel_1, 1);
		panel_1.setBounds(1000, 100, 261, 320);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN :");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(32,33,26));
		lblNewLabel_1.setBounds(10, 74, 69, 33);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(129, 81, 96, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :");
		lblNewLabel_2.setForeground(new Color(32,33,26));
		lblNewLabel_2.setBounds(10, 132, 85, 25);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 135, 96, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(128, 128, 64));
		btnNewButton.setBounds(12, 208, 83, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setBackground(new Color(128, 128, 64));
		btnNewButton_1.setBounds(116, 208, 109, 21);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(128, 128, 50));
		panel_2.setBackground(new Color(173,178,171));
		layeredPane.setLayer(panel_2, 2);
		panel_2.setOpaque(true);
		panel_2.setBounds(0, 10, 1387, 65);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("                PLAY PRO SPORTS VENUES");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Monotype corsiva", Font.PLAIN, 36));
		lblNewLabel_3.setBounds(324, 0, 735, 75);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		ImageIcon icon2 = new ImageIcon(Newframe.class.getResource("home-logo-png-1.png"));
		Image image2 = icon2.getImage();
		Image new2 = image2.getScaledInstance(105,65,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new2);
		lblNewLabel_4.setIcon(ima);
		lblNewLabel_4.setBounds(0, 0, 105, 65);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		layeredPane.setLayer(panel_3, 3);
		panel_3.setBounds(117, 150, 582, 320);
		panel_3.setOpaque(false);
		layeredPane.add(panel_3);
		panel_3.setLayout(null);
		
		//ImageIcon icon = new ImageIcon("pexels-tom-fisk-3448250.jpg");
		ImageIcon icon1 = new ImageIcon(Newframe.class.getResource("pexels-tom-fisk-3448250.jpg"));
		Image image1 = icon1.getImage();
		Image new1 = image1.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new1);
		JButton btnNewButton_2 = new JButton(ima);
		btnNewButton_2.setToolTipText("A set of all the venues");
		btnNewButton_2.setBounds(10, 10, 273, 132);
		panel_3.add(btnNewButton_2);
	}
}
