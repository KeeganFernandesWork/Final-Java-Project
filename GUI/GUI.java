import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI
{
	private static void createAndShowGUI()
	{
		//Creating and setting up the window

		JFrame frame = new JFrame("SPORTS VENUE MANAGEMENT");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Creating a menu bar

		JMenuBar blueMenuBar = new JMenuBar();
		blueMenuBar.setOpaque(true);
		blueMenuBar.setBackground(new Color(166,231,100));
		blueMenuBar.setPreferredSize(new Dimension(200,40));

		//Creating a purple Label to put in the content pane

		JLabel purpleLabel = new JLabel();
		purpleLabel.setOpaque(true);
		purpleLabel.setBackground(new Color(100,231,100));
		purpleLabel.setPreferredSize(new Dimension(200,180));

		//Setting the menu bar and adding the label to the content pane

		frame.setJMenuBar (blueMenuBar);
		frame.getContentPane().add(purpleLabel, BorderLayout.CENTER);

		//Displaying the window.

		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
				createAndShowGUI();
				}
				});
	}
}
