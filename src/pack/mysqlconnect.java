package pack;

import java.sql.*;
import java.sql.Date;

public class mysqlconnect {
	//adds the connection to the table
Connection con;// this is the connection that will be used for the java file
mysqlconnect() {
   try {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "fernandes", "hello");//Establishing connection
System.out.println("Connected With the database successfully");
this.con = con;
} catch (SQLException e) {
System.out.println("Error while connecting to the database "+e.getMessage());
}
}
boolean loginCheck(String name, String pass) {
	//checks the username and password
	   try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   ResultSet rs=stmt.executeQuery("select * from users"); 
		   while(rs.next()) {
		   	   if(rs.getString(2).equals(name)) {
		   		   if(rs.getString(3).equals(pass)) {
		   			   return true;
		   		   }
		   	   }
		   }
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return false;
}
String[] loginGet(String name, String pass) {
	//checks the username and password
	String[] ls = new String[2];
	   try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   ResultSet rs=stmt.executeQuery("select * from users"); 
		   while(rs.next()) {
		   	   if(rs.getString(2).equals(name)) {
		   		   if(rs.getString(3).equals(pass)) {
		   			   ls[0] = rs.getString(2);
		   			   ls[1] = rs.getString(4);
		   			   return ls;
		   		   }
		   	   }
		   }
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return ls;
}
boolean registerLog(String name, String pass) {
	// adds the username and password to the table
	   try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		      String query = " insert into users (name, pass, access)"+" values (?, ?, ?)";
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString(1, name);
		      preparedStmt.setString(2, pass);
		      preparedStmt.setString(3,"user");

		      // execute the preparedstatement
		      preparedStmt.execute();

			  System.out.println("value added succesfully");
		      return true;
		   
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return false;
}
boolean registerCheck(String name) {
	// checks weather the username is available
	   try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   ResultSet rs=stmt.executeQuery("select * from users"); 
		   while(rs.next()) {
		   	   
		   		   if(rs.getString(2).equals(name)) {
		   			   return false;
		   		   
		   	   }
		   }
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return true;
}
String[] getVenue(int i) {
	String[] venue = new String[4];
	try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   ResultSet rs=stmt.executeQuery("select * from venue"); 
		   while(rs.next()) {
		   	   
		   		   if(i == rs.getInt(1)) {
		   			   venue[0] = rs.getString(2);
		   			   venue[1] = rs.getString(3);
		   			   venue[2] = rs.getString(4);
		   			   venue[3] = rs.getString(5);
		   			   return venue;
		   		   
		   	   }
		   }
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return venue;
}
boolean bookingLog(int venue_id, Date d, String user_name, int money) {
	// adds the username and password to the table
	   try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();
		      String query = " insert into booking (venue_id, dates ,user_name, money)"+" values (?, ?, ?,?)";
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setInt(1, venue_id);
		      preparedStmt.setDate(2, d);
		      preparedStmt.setString(3,user_name);
		      preparedStmt.setInt(4,money);

		      // execute the preparedstatement
		      preparedStmt.execute();

			  System.out.println("value added succesfully");
		      return true;
		   
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return false;
}
boolean bookingCheck(Date d) {
	// checks weather the username is available
	   try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   ResultSet rs=stmt.executeQuery("select dates from booking"); 
		   while(rs.next()) {
		   	   
		   		   if(rs.getDate(1).equals(d)) {
		   			   return false;
		   		   
		   	   }
		   }
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return true;
}
boolean bookingRemove(Date d) {
	// adds the username and password to the table
	   try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();
		   
		      String query = " delete from booking where dates = "+"?";
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setDate(1, d);
		      // execute the preparedstatement
		      preparedStmt.execute();

			  System.out.println("value removed succesfully");
		      return true;
		   
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return false;
}
int bookingTotal() {
	// adds the username and password to the table
	 try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   ResultSet rs=stmt.executeQuery("select SUM(money) from booking"); 
		   while(rs.next()) {
		   	   
		   		   
		   			   return rs.getInt(1);
		   		   
		   	   }
		   
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return 0;
}
int[] bookingTotalMonth() {
	int[] month_total = new int[12];
	// adds the username and password to the table
	 try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   for(int i =0;i<12;i++) {
			   ResultSet rs=stmt.executeQuery("select SUM(money),EXTRACT(MONTH FROM dates) AS month from booking GROUP BY month HAVING month = "+Integer.toString(i+1));
			   rs.next();
			   month_total[i] = rs.getInt(1);
			   System.out.println(month_total[i]);
		   		   
		   	   }
		   
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return month_total;
}
int[] bookingTotalMonthFreq() {
	int[] month_total = new int[12];
	// adds the username and password to the table
	 try {
		   Connection con = this.con;
		   Statement stmt=con.createStatement();  
		   for(int i =0;i<12;i++) {
			   ResultSet rs=stmt.executeQuery("select count(money),EXTRACT(MONTH FROM dates) AS month from booking GROUP BY month HAVING month = "+Integer.toString(i+1));
			   rs.next();
			   month_total[i] = rs.getInt(1);
			   System.out.println(month_total[i]);
		   		   
		   	   }
		   
		   } catch (SQLException e) {
		   System.out.println("Error while connecting to the database "+e.getMessage());
		   }
	   return month_total;
}
}
 
