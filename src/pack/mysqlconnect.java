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
 
}