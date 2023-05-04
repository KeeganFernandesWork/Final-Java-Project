package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class passpop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ps() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passpop window = new passpop();
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
	public passpop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
