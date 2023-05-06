package pack;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.Color;

import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;  

public class Analytics {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void analyze() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Analytics window = new Analytics();
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
	public Analytics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		mysqlconnect con = new mysqlconnect();
		frame.setBounds(100, 100, 734, 791);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 720, 754);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 720, 754);
		layeredPane.add(panel);
		panel.setLayout(null);
		ImageIcon ima = new ImageIcon(Newframe.class.getResource("maradona.jpg"));
		Image image = ima.getImage();
		Image newi = image.getScaledInstance(720, 754,java.awt.Image.SCALE_SMOOTH);
		ima = new ImageIcon(newi);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 720, 754);
		panel.add(panel_1);
		panel_1.setOpaque(false);
		layeredPane.setLayer(panel_1, 1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("<html>"+"THIS IS THE ANALYTICS PAGE FOR PLAY PRO SPORTS VENUES, THIS PAGE RECORDS THE "
				+ "TOTAL REVENUE COLLECTED OF OUR COMPANY, AND THE NUMBER OF BOOKINGS IN EACH MONTH, THESE"
				+ "INPUTS ARE REPRESENTED BY THE RESPECTIVE BAR PLOT AND HISTOGRAM"+"</html>");
		lblNewLabel_4.setBounds(0, 521, 714, 233);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("ALGERIAN", Font.ITALIC, 15));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(283, 61, 292, 333);
		int[] month = con.bookingTotalMonth();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(month[0], "Series 2", "January");
		dataset.addValue(month[1], "Series 2", "February");
		dataset.addValue(month[2], "Series 2", "March");
		dataset.addValue(month[3], "Series 2", "April");
		dataset.addValue(month[4], "Series 2", "May");
		dataset.addValue(month[5], "Series 2", "June");
		dataset.addValue(month[6], "Series 2", "July");
		dataset.addValue(month[7], "Series 2", "August");
		dataset.addValue(month[8], "Series 2", "September");
		dataset.addValue(month[9], "Series 2", "October");
		dataset.addValue(month[10], "Series 2", "November");
		dataset.addValue(month[11], "Series 2", "December");

		
         
		JFreeChart chart = ChartFactory.createBarChart(
			    "Chart Title", "Category", "Value",
			    dataset, PlotOrientation.VERTICAL,
			    false, true, false);
         
         ChartPanel chartpanel = new ChartPanel(chart);
 		chartpanel.setDomainZoomable(true);
 		chartpanel.setDisplayToolTips(true);
 		chartpanel.setBounds(0, 335, 714, 274);
 		panel_1.add(chartpanel);
		chartpanel.setLayout(null);
		
		
		//histogram
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(283, 395, 292, 333);
		int[] month_freq = con.bookingTotalMonthFreq();
		DefaultCategoryDataset dataset_2 = new DefaultCategoryDataset();
		dataset_2.addValue(month_freq[0], "Series 1", "January");
		dataset_2.addValue(month_freq[1], "Series 1", "February");
		dataset_2.addValue(month_freq[2], "Series 1", "March");
		dataset_2.addValue(month_freq[3], "Series 1", "April");
		dataset_2.addValue(month_freq[4], "Series 1", "May");
		dataset_2.addValue(month_freq[5], "Series 1", "June");
		dataset_2.addValue(month_freq[6], "Series 1", "July");
		dataset_2.addValue(month_freq[7], "Series 1", "August");
		dataset_2.addValue(month_freq[8], "Series 1", "September");
		dataset_2.addValue(month_freq[9], "Series 1", "October");
		dataset_2.addValue(month_freq[10], "Series 1", "November");
		dataset_2.addValue(month_freq[11], "Series 1", "December");

		
         
		JFreeChart chart_2 = ChartFactory.createBarChart(
			    "Chart Title", "Category", "Value",
			    dataset_2, PlotOrientation.VERTICAL,
			    false, true, false);
         
         ChartPanel chartpanel_2 = new ChartPanel(chart_2);
         chartpanel_2.setDomainZoomable(true);
         chartpanel_2.setDisplayToolTips(true);
         chartpanel_2.setBounds(0, 58, 714, 274);
 		panel_1.add(chartpanel_2);
 		chartpanel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("TOTAL EARNINGS\n  :"+Integer.toString(con.bookingTotal()));
		lblNewLabel_3.setBounds(1, 10, 713, 56);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Arial",40, 30));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 714, 754);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(ima);
		
		
		
		
		//JLabel lblNewLabel_2 = new JLabel("New label");
		//lblNewLabel_2.setBounds(0, 353, 710, 180);
		//panel.add(lblNewLabel_2);
		
		
		
	}
}
