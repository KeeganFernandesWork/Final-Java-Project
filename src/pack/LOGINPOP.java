package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class LOGINPOP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void lg() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINPOP window = new LOGINPOP();
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
	public LOGINPOP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 729, 601);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 715, 564);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel topRightLabel = new JLabel("New label");
		topRightLabel.setBounds(335, 0, 380, 291);
		panel.add(topRightLabel);
		
		
		
			}
}
