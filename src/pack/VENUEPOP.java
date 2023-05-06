package pack;

import java.awt.*;
import java.awt.Window.Type;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class VENUEPOP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENUEPOP window = new VENUEPOP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VENUEPOP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(450, 200, 743, 538);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 729, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon foot = new ImageIcon(Newframe.class.getResource("ftct.jpg"));
		Image image = foot.getImage();
		Image newi = image.getScaledInstance(358,236,java.awt.Image.SCALE_SMOOTH);
		foot = new ImageIcon(newi);
		lblNewLabel.setIcon(foot);
		lblNewLabel.setBounds(361, 10, 358, 236);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		ImageIcon tt = new ImageIcon(Newframe.class.getResource("ttct.jpg"));
		Image image1 = tt.getImage();
		Image newi1 = image1.getScaledInstance(358,236,java.awt.Image.SCALE_SMOOTH);
		tt = new ImageIcon(newi1);
		lblNewLabel_1.setIcon(tt);
		lblNewLabel_1.setBounds(10, 10, 341, 236);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		ImageIcon bb = new ImageIcon(Newframe.class.getResource("bbct.jpg"));
		Image image2 = bb.getImage();
		Image newi2 = image2.getScaledInstance(358,236,java.awt.Image.SCALE_SMOOTH);
		bb = new ImageIcon(newi2);
		lblNewLabel_2.setIcon(bb);
		lblNewLabel_2.setBounds(361, 255, 358, 236);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		ImageIcon lt = new ImageIcon(Newframe.class.getResource("ltct.jpg"));
		Image image3 = lt.getImage();
		Image newi3 = image3.getScaledInstance(358,236,java.awt.Image.SCALE_SMOOTH);
		lt = new ImageIcon(newi3);
		lblNewLabel_3.setIcon(lt);
		lblNewLabel_3.setBounds(10, 255, 341, 236);
		panel.add(lblNewLabel_3);
	}
}