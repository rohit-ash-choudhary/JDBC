import java.sql.*;

public class CreateTable {
    static String con=null;
    static String databasena="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+databasena;
    static String dbname="root";
    static String pass="Rooh@#2001";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=DriverManager.getConnection(url, dbname,pass);

        String q="create table rohit(id_number int, name varchar(45))";

        Statement st=con.createStatement();
        st.executeUpdate(q);

    }
}
