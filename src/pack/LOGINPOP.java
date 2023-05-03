package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;

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
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
