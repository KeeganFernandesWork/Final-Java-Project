package pack;

import java.sql.*;

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
		      String query = " insert into users (username, pass, access)"
		    	        + " values (?, ?, ?)";
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString (1, name);
		      preparedStmt.setString (2, pass);
		      preparedStmt.setString   (3, "user");

		      // execute the preparedstatement
		      preparedStmt.execute();
		   
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
 
}