import java.sql.*;
public class InsertImageInDb {
    static String con=null;

    static String database="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+database;
    static String user="root";
    static String password="Rooh@#2001";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,password);

        String q="create table ims(user_image varchar(45),user varchar(34))";

        Statement stmt=con.createStatement();
        stmt.executeUpdate(q);

        String w="insert into ims(user_image,user) values(?,?)";
        Statement st=con.prepareStatement(w);

        ((PreparedStatement) st).setString(1,"ashh");
        ((PreparedStatement) st).setString(2,"rohit");
        st.executeUpdate(w);
    }
}
