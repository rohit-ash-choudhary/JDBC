
/* connect the database
 https://www.geeksforgeeks.org/introduction-to-jdbc/
*/

import java.sql.*;
public class ConnectDB {
    static String connection = null;
    static String databasename="StudentDatabase";
    static String url="jdbc:mysql://localhost:3306/"+databasename;
    static String username="root";
    static String password="SH";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


            /*Step -1 to load the driver */
            Class.forName("com.mysql.cj.jdbc.Driver");

            /* Step 2 - to create a connection */
            Connection con=DriverManager.getConnection(url,username, password);

            /* step 3 - create query , statement , for dynamic query -preparestatement, and for call db function
            we need callablestatement
             */
            String q="CREATE TABLE Persons (PersonID int,LastName varchar(255),FirstName varchar(255), Address varchar(255))";


            Statement stmt=con.createStatement(); /* statement */
               stmt.executeUpdate(q);
           // ResultSet set=stmt.executeQuery(q);

            /* Step -4 process the data */
           /* while(set.next())
            {
                int i=set.getInt("StudentId");
                System.out.println(i);

            }
*/
            /*  Step -5 close the connection */
            con.close();





    }
}

/*
To call query :  stmt.executeUpdate()
To update Query / create table :stmt.executeUpdate(q);

 */