package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLayeredPane;

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
		frame.setBounds(100, 100, 533, 465);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 520, 427);
		layeredPane.setLayer(panel,0);
		layeredPane.add(panel);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
