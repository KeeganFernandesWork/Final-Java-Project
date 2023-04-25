import java.sql.*;
public class App{

private String url = "jdbc:mysql://localhost:3306/test";
private String driver = "com.mysql.jdbc.Driver";
private String userName = "root";
private String password = "";
private Connection con = null;

private void getConnection() {

     try {
         Class.forName(driver);
         if(con == null){
             con = DriverManager.getConnection(url,userName,password);
         }
         System.out.print("Connection estd");
     }catch (Exception e) {
         System.out.print("Error : " +e.getMessage());
    }
}


/**for desktop application */
public static void main(String[] arg){

    App con = new App();
    con.getConnection();
  }
}

