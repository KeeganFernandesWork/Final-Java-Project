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

public class Newframe extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 914, 419);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 904, 409);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon ima = new ImageIcon(Newframe.class.getResource("/pack/image1(1).jpg"));
		Image image = ima.getImage();
		Image newi = image.getScaledInstance(894,399,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(newi);
		lblNewLabel.setIcon(ima);
		lblNewLabel.setBounds(10, 10, 894, 399);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(new Color(240, 240, 240));
		layeredPane.setLayer(panel_1, 1);
		panel_1.setBounds(50, 50, 200, 100);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
	}
}
