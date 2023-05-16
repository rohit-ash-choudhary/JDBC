import java.sql.*;

public class JdbcCreateTableInDataBase {

    static String connection=null;
    static String database="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+database;
    static String database_user="root";
    static String database_password="Rooh@#2001";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /* to upload the browser */
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,database_user,database_password);

        String q="select * from student";

        Statement stmt= con.createStatement();

        ResultSet set=stmt.executeQuery(q);

        while (set.next())
        {
            int id=set.getInt("StudentId");
            System.out.println(id);

        }

        con.close();


    }
}
