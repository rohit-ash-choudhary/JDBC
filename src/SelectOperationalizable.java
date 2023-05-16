import jdk.dynalink.beans.StaticClass;

import java.sql.*;

public class SelectOperationalizable {
    static String connection=null;
    static String databasen="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+databasen;
    static String user="root";
    static String pass="Rooh@#2001";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

      Class.forName("com.mysql.cj.jdbc.Driver");

      Connection con=DriverManager.getConnection(url,user,pass);

      String q="create table mark (marks int,subject varchar(30))";
      //String q="CREATE TABLE Persons (PersonID int,LastName varchar(255),FirstName varchar(255), Address varchar(255))";

      Statement stmt=con.createStatement();
      stmt.executeUpdate(q);

      con.close();


    }
}
/*
To call query :  stmt.executeUpdate()
To update Query / create table :stmt.executeUpdate(q);

 */