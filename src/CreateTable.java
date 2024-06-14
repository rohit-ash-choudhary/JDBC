import java.sql.*;

public class CreateTable {
    static String con=null;
    static String databasena="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+databasena;
    static String dbname="root";
    static String pass="Rooh@#2001";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String filename="rest.tefrf.text";
        int number_of_extensions=filename.split("\\.").length;
        if(number_of_extensions>=3)
        {
            System.out.println("file have multi extension");
        }
        else {
            System.out.println("file uploaded successfully");
        }


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=DriverManager.getConnection(url, dbname,pass);

        String q="create table rohit(id_number int, name varchar(45))";

        Statement st=con.createStatement();
        st.executeUpdate(q);



    }
}
