package pack;

import java.sql.*;

public class mysqlconnect {
Connection con;
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
boolean registerLog(String name, String pass) {
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