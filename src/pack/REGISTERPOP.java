package pack;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class REGISTERPOP {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void register() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTERPOP window = new REGISTERPOP();
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
	public REGISTERPOP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mysqlconnect con = new mysqlconnect();
		frame = new JFrame();
		frame.setBounds(100, 100, 588, 436);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221,121,100));
		panel.setBounds(0, 0, 578, 402);
		panel.setOpaque(true);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(72, 71, 157, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(72, 161, 157, 39);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(240, 71, 190, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 159, 190, 39);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					boolean text = true;
					if(!textField_1.getText().equals(textField_2.getText())) {
			            JDialog d = new JDialog(frame,"Confirmation does not match the password");
			            
			            // create a label
			            JLabel l = new JLabel("Confirmation does not match the password");
			            l.setBounds(72, 161, 157, 39);
			            l.setSize(100,180);
			            d.add(l);
			 
			            // setsize of dialog
			            d.setSize(150, 200);
			            d.setBounds(240, 71, 190, 39);
			 
			            // set visibility of dialog
			            d.setVisible(true);
			            text = false;
					}
					boolean check = con.registerCheck(textField.getText());
					if(check && text) {
						con.registerLog(textField.getText(),textField_1.getText());
						System.out.println("value added succesfully");
						frame.dispose();
					}
			}
		});
		btnNewButton.setBounds(109, 346, 120, 32);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(343, 346, 128, 32);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_2.setBounds(72, 247, 128, 32);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 242, 190, 39);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}