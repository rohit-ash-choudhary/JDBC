import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class InsertDataInTable {
    static  String con=null;
    static String dbn="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+dbn;
    static String user="root";
    static String password="Rooh@#2001";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,password);

        String q="insert into mark(marks,subject) values(?,?)";


        PreparedStatement stmt= con.prepareStatement(q);
      /*  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the marks"); */


        stmt.setInt(1,34);
        stmt.setString(2,"Math");

        stmt.executeUpdate();
        con.close();



    }
}
