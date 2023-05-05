package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;

public class LOGINPOP {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void lg(int i) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINPOP window = new LOGINPOP(i);
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

	/**
	 * Initialize the contents of the frame.
	 */
	     LOGINPOP(int i) {
	 	//creating the mysql connector class
	 	mysqlconnect con = new mysqlconnect();
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 597);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 602, 593);
		panel.setLayout(null);
		
		ImageIcon icon2 = new ImageIcon(Newframe.class.getResource("home.png"));
		Image image2 = icon2.getImage();
		Image new2 = image2.getScaledInstance(65,65,java.awt.Image.SCALE_SMOOTH);
		ImageIcon ima = new ImageIcon(new2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(ima);
		lblNewLabel.setBounds(0, 0, 602, 149);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Set date");
		lblNewLabel_2.setBounds(25, 400, 165, 41);
		panel.add(lblNewLabel_2);
		UtilDateModel model = new UtilDateModel();
		//model.setDate(20,04,2014);
		// Need this...
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		// Don't know about the formatter, but there it is...
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
		datePicker.setLocation(282, 400);
		datePicker.setSize(262, 41);
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 159, 602, 149);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(374, 500, 165, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(25, 500, 165, 30);
		panel.add(btnNewButton_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(270, 424, 288, 30);
		panel.add(datePicker);
		textField_4.setColumns(10);
		
		frame.getContentPane().add(panel);
		
		
		
		
		
		
		
			}
}
