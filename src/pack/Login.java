package pack;

import java.awt.Color;
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;  
import java.util.*;  
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
	public static void newScreen1(String user, String access) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(user,access);
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
	public Login(String user,String access) {
		setTitle("new name");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1400,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Setting up the layered pane
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1400, 700);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		//Panel for image(Layer 0)  panel
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1400, 700);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		//Getting the image, resizing it to the size of the panel, and adding it to the label
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		ImageIcon ima = new ImageIcon(Newframe.class.getResource("/pack/basketball_court.jpg"));
		Image image = ima.getImage();
		Image newi = image.getScaledInstance(1397,685,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(newi);
		if(access.equals("admin")) {
		JButton btnNewButton_2_4 = new JButton("OVERVIEW");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Analytics ana = new Analytics();
				ana.analyze();
			}
		});
		btnNewButton_2_4.setForeground(new Color(255, 255, 255));
		btnNewButton_2_4.setBackground(new Color(128, 64, 0));
		btnNewButton_2_4.setBounds(70, 476, 235, 46);
		panel.add(btnNewButton_2_4);
		}
		
		lblNewLabel.setIcon(ima);
		lblNewLabel.setBounds(0, -12, 1400, 679);
		
		
		//setting the toolbar
		panel.add(lblNewLabel);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1387, 65);
		panel_2.setBackground(new Color(176,196,222,100));
		layeredPane.setLayer(panel_2, 1);
		panel_2.setOpaque(true);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		//Label for Menu Bar text
		String User = user;
		JLabel lblNewLabel_3 = new JLabel("Welcome "+User);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Monotype corsiva", Font.PLAIN, 36));
		lblNewLabel_3.setBounds(579, 0, 735, 75);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_2.add(lblNewLabel_3);
		
		//Label for home-logo on the menu bar
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			//added the login page home button
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
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
		panel_3.setBounds(23, 150, 1283, 261);
		layeredPane.setLayer(panel_3, 2);
		panel_3.setOpaque(false);
		layeredPane.add(panel_3);
		
		//Button for list of possible bookings
		
		ImageIcon icon1 = new ImageIcon(Newframe.class.getResource("ftimg.jpg"));
		Image image1 = icon1.getImage();
		Image new1 = image1.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new1);
		
		JButton btnNewButton_2 = new JButton(ima);
		btnNewButton_2.setBounds(651, 19, 273, 132);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGINPOP lp = new LOGINPOP(1,user,access);
				lp.lg(1,user,access);
		}
	});
		panel_3.setLayout(null);
		btnNewButton_2.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_2);
		
		ImageIcon icon3 = new ImageIcon(Newframe.class.getResource("bbimg.jpg"));
		Image image3 = icon3.getImage();
		Image new3 = image3.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new3);
		
		JButton btnNewButton_2_1 = new JButton(ima);
		btnNewButton_2_1.setBounds(960, 19, 273, 132);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGINPOP lp = new LOGINPOP(3,user,access);
				lp.lg(3,user,access);
				
			}
		});
		btnNewButton_2_1.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_2_1);
		
		ImageIcon icon4 = new ImageIcon(Newframe.class.getResource("ttimg.jpg"));
		Image image4 = icon4.getImage();
		Image new4 = image4.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new4);
		
		JButton btnNewButton_2_2 = new JButton(ima);
		btnNewButton_2_2.setBounds(31, 19, 273, 132);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGINPOP lp = new LOGINPOP(2,user,access);
				lp.lg(2,user,access);
				
			}
		});
		btnNewButton_2_2.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_2_2);
		
		ImageIcon icon5 = new ImageIcon(Newframe.class.getResource("ltimg.jpg"));
		Image image5 = icon5.getImage();
		Image new5 = image5.getScaledInstance(273,132,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(new5);
		
		JButton btnNewButton_2_3 = new JButton(ima);
		btnNewButton_2_3.setBounds(344, 19, 273, 132);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGINPOP lp = new LOGINPOP(4,user,access);
				lp.lg(4,user,access);
				
			}
		});
		btnNewButton_2_3.setToolTipText("A list of all the venues");
		panel_3.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_1 = new JLabel("      FootBall venues booking and availability");
		lblNewLabel_1.setForeground(new Color(255, 0, 128));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(255, 255, 255,30));
		lblNewLabel_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 164, 273, 39);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("      LawnTennis venues booking and availability");
		lblNewLabel_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(255, 255, 255,30));
		lblNewLabel_2.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(344, 164, 273, 39);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("      TableTennis venues booking and availability");
		lblNewLabel_6.setForeground(new Color(255, 0, 128));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(new Color(255, 255, 255,30));
		lblNewLabel_6.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(651, 164, 273, 39);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("      Basketball venues booking and availability");
		lblNewLabel_7.setForeground(new Color(255, 0, 128));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(new Color(255, 255, 255,30));
		lblNewLabel_7.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(960, 164, 273, 39);
		panel_3.add(lblNewLabel_7);
		


		
		
	}
}