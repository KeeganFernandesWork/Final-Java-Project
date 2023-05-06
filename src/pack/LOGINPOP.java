package pack;
import java.time.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;
import org.jdesktop.swingx.JXDatePicker;
public class LOGINPOP {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	long passed;
	float cost = 0;
	LocalDate booking;
	LocalDate today;

 	boolean key = false;

	/**
	 * Launch the application.
	 */
	public static void lg(int i,String user,String access) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINPOP window = new LOGINPOP(i,user,access);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public LOGINPOP(int i,String user,String access)
	{
	 	//creating the mysql connector class
	 	mysqlconnect con = new mysqlconnect();
	 	String[] venue = con.getVenue(i);
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 597);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 602, 593);
		panel.setBackground(new Color(0, 128, 64));
		panel.setLayout(null);
		
		System.out.println(venue[2]);
		
		ImageIcon icon2 = new ImageIcon(Newframe.class.getResource(venue[2]));
		Image image2 = icon2.getImage();
		Image new2 = image2.getScaledInstance(602,245,java.awt.Image.SCALE_SMOOTH);
		ImageIcon ima = new ImageIcon(new2);
		
		JLabel lblNewLabel = new JLabel(ima);
		lblNewLabel.setIcon(ima);
		lblNewLabel.setBounds(0, 0, 602, 245);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("          Set date  : ");
		lblNewLabel_2.setBounds(25, 400, 229, 41);
		lblNewLabel_2.setFont(lblNewLabel_2.getFont().deriveFont(16.0f));
		panel.add(lblNewLabel_2);
		JXDatePicker datePicker = new JXDatePicker();
		datePicker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	booking = datePicker.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            }
        });
		
		today = LocalDate.now();
		datePicker.setLocation(282, 400);
		datePicker.setSize(262, 41);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("<html>"+venue[1]+"</html>");
		lblNewLabel_3.setBounds(0, 242, 602, 136);

		panel.add(datePicker);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Date d = Date.from(booking.atStartOfDay(ZoneId.systemDefault()).toInstant());
				 java.sql.Date p = new java.sql.Date(d.getTime());
				if(key) {if(passed > 0){
					if(con.bookingCheck(p)) {
					
					con.bookingLog(i, p,user, (int)cost);
					JOptionPane.showMessageDialog(frame,"Booked!");
				}
					else {
						JOptionPane.showMessageDialog(frame,"Not Available!! Try Another!");
					}
					}
				}
				else {
					JOptionPane.showMessageDialog(frame,"Check Availability!");
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(374, 500, 165, 30);
		panel.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Check Availability");
		
		btnNewButton_1.setBounds(25, 500, 165, 30);
		panel.add(btnNewButton_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(270, 424, 288, 30);
		textField_4.setColumns(10);
			
		
		frame.getContentPane().add(panel);

		JLabel lblNewLabel_3_1 = new JLabel("Disbursement:"+cost);
		lblNewLabel_3_1.setBounds(205, 451, 144, 30);
		panel.add(lblNewLabel_3_1);
		
		if(access.equals("admin")) {
		JButton btnNewButton_1_1 = new JButton("Remove");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Date d = Date.from(booking.atStartOfDay(ZoneId.systemDefault()).toInstant());
				 java.sql.Date p = new java.sql.Date(d.getTime());
				if(!con.bookingCheck(p)) {if(passed > 0){
					
					con.bookingRemove(p);
					JOptionPane.showMessageDialog(frame,"Removed!");
					}
				}
				else {
					JOptionPane.showMessageDialog(frame,"No Booking!");
				
				}
			}
		});
		
		btnNewButton_1_1.setBounds(233, 500, 98, 30);
		panel.add(btnNewButton_1_1);
		}
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 passed = ChronoUnit.DAYS.between(today, booking);
				 cost = Float.parseFloat(venue[3]);
				if(passed <= 0){
					JOptionPane.showMessageDialog(frame,"Invalid date");
				}
				else if(passed >= 30)
				{
					key = true;
					cost = 45000;
				}
				else {
					key = true;
					cost = cost - (1000*passed);
				}
				
				lblNewLabel_3_1.setText("Disbursement:"+cost);
			}
		});
			}
}
