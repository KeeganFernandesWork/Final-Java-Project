package pack;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.Icon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newScreen1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("new name");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1397,685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Setting up the layered pane
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1397, 685);
		contentPane.add(layeredPane);
		
		//Panel for image(Layer 0)  panel
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1407, 685);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		//Getting the image, resizing it to the size of the panel, and adding it to the label
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon ima = new ImageIcon(Newframe.class.getResource("/pack/basketball_court.jpg"));
		Image image = ima.getImage();
		Image newi = image.getScaledInstance(1397,685,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(newi);
		lblNewLabel.setIcon(ima);
		lblNewLabel.setBounds(0, 10, 1394, 644);
		
		
		//setting the toolbar
		panel.add(lblNewLabel);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176,196,222,100));
		layeredPane.setLayer(panel_2, 2);
		panel_2.setOpaque(true);
		panel_2.setBounds(0, 0, 1387, 65);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		//Label for Menu Bar text
		//String User = "Keegan";
		JLabel lblNewLabel_3 = new JLabel("Welcome to Play Pro !");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Monotype corsiva", Font.PLAIN, 36));
		lblNewLabel_3.setBounds(579, 0, 735, 75);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_2.add(lblNewLabel_3);
		
		//Label for home-logo on the menu bar
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		ImageIcon icon2 = new ImageIcon(Newframe.class.getResource("home.png"));
		Image image2 = icon2.getImage();
		Image new2 = image2.getScaledInstance(65,65,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new2);
		lblNewLabel_4.setIcon(ima);
		lblNewLabel_4.setBounds(21, 0, 105, 65);
		panel_2.add(lblNewLabel_4);
		//ending panel2
		
		//Making the panel3
		JPanel panel_3 = new JPanel();
		layeredPane.setLayer(panel_3, 3);
		panel_3.setBounds(23, 150, 1283, 366);
		panel_3.setOpaque(false);
		layeredPane.add(panel_3);
		
		//Button for list of possible bookings
		
		ImageIcon icon1 = new ImageIcon(Newframe.class.getResource("bbct.jpg"));
		Image image1 = icon1.getImage();
		Image new1 = image1.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new1);
		panel_3.setLayout(null);
		JButton btnNewButton_1 = new JButton(ima);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LOGINPOP loginn = new LOGINPOP();
				loginn.lg();
			}
		});
		btnNewButton_1.setBounds(32, 32, 282, 141);
		btnNewButton_1.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_1);
		
		ImageIcon icon3 = new ImageIcon(Newframe.class.getResource("ltct.jpg"));
		Image image3 = icon3.getImage();
		Image new3 = image3.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new3);
		panel_3.setLayout(null);
		JButton btnNewButton_2 = new JButton(ima);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LOGINPOP loginn1 = new LOGINPOP();
				loginn1.lg();
			}
		});
		btnNewButton_2.setBounds(343, 189, 282, 141);
		btnNewButton_2.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_2);
		
		ImageIcon icon4 = new ImageIcon(Newframe.class.getResource("ttct.jpg"));
		Image image4 = icon4.getImage();
		Image new4 = image4.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new4);
		panel_3.setLayout(null);
		JButton btnNewButton_3 = new JButton(ima);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LOGINPOP loginn2 = new LOGINPOP();
				loginn2.lg();
			}
		});
		btnNewButton_3.setBounds(637, 32, 282, 141);
		btnNewButton_3.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_3);
		
		ImageIcon icon5 = new ImageIcon(Newframe.class.getResource("ftct.jpg"));
		Image image5 = icon5.getImage();
		Image new5 = image5.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new5);
		panel_3.setLayout(null);
		JButton btnNewButton_4 = new JButton(ima);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LOGINPOP loginn3 = new LOGINPOP();
				loginn3.lg();
			}
		});
		btnNewButton_4.setBounds(936, 189, 282, 141);
		btnNewButton_4.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_4);
		
		
		
	}
}
