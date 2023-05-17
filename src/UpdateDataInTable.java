import java.sql.*;
public class UpdateDataInTable {
    static String con=null;
    static String database="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+database;
    static String user="root";
    static String pass="Rooh@#2001";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=DriverManager.getConnection(url, user, pass);

        String q="update student set StudentName=(?) where StudentId=(?)" ;

       PreparedStatement stm=con.prepareStatement(q);

        stm.setString(1,"ashhh");
        stm.setInt(2,1);

        stm.executeUpdate();





    }
}
