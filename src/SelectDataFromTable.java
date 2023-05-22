import java.sql.*;
public class SelectDataFromTable {
    static  String con=null;
    static String database="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+database;
    static String user="root";
    static String pass="Rooh@#2001";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=DriverManager.getConnection(url,user,pass);

        String q="select * from student";

        Statement stm=con.createStatement();
        ResultSet set=stm.executeQuery(q);

        while (set.next())
        {

            int student_id= set.getInt(1);
            String student_name=set.getString(2);
            String address=set.getString(3);
            long phone=set.getLong(4);


            System.out.println(student_id);

            System.out.println(student_name);

            System.out.println(address);
            System.out.println(phone);

        }

    }
}
