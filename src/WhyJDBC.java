/*
we need stored data in database because the variable data was memory till program run on loaded in memory
after upload program thi variable deleted so we need to process data and need to stored in data base
like below a, name and weight deleted once program unloaded from memory.

We can use JDBC API to handle database using Java program and can perform the following activities:
 Connect to the database. Execute queries and update statements to the database.
 Retrieve the result received from the database.


-----Architecture of JDBC
           1.Application: It is a java applet or a servlet that communicates with a data source.
           2.The JDBC API: The JDBC API allows Java programs to execute SQL statements and retrieve results.
                            Some of the important classes and interfaces defined in JDBC API are as follows:
           3.DriverManager: It plays an important role in the JDBC architecture.
                             It uses some database-specific drivers to effectively connect enterprise applications to databases.
            4.JDBC drivers: To communicate with a data source through JDBC,
                             you need a JDBC driver that intelligently communicates with the respective data source.
JDBC Drivers
JDBC drivers are client-side adapters (installed on the client machine, not on the server) that convert requests from Java programs to a protocol that the DBMS can understand. There are 4 types of JDBC drivers:

Type-1 driver or JDBC-ODBC bridge driver
Type-2 driver or Native-API driver
Type-3 driver or Network Protocol driver
Type-4 driver or Thin driver

Types of JDBC Architecture(2-tier and 3-tier)
The JDBC architecture consists of two-tier and three-tier processing models to access a database. They are as described below:

Two-tier model: A java application communicates directly to the data source. The JDBC driver enables the communication between the application and the data source. When a user sends a query to the data source, the answers for those queries are sent back to the user in the form of results.
The data source can be located on a different machine on a network to which a user is connected. This is known as a client/server configuration, where the user’s machine acts as a client, and the machine has the data source running acts as the server.

Three-tier model: In this, the user’s queries are sent to middle-tier services, from which the commands are again sent to the data source. The results are sent back to the middle tier, and from there to the user.
This type of model is found very useful by management information system directors.
Interfaces of JDBC API

A list of popular interfaces of JDBC API is given below:

Driver interface
Connection interface
Statement interface
PreparedStatement interface
CallableStatement interface
ResultSet interface
ResultSetMetaData interface
DatabaseMetaData interface
RowSet interface
Classes of JDBC API
A list of popular classes of JDBC API is given below:

DriverManager class
Blob class
Clob class
Types class

*/

public class WhyJDBC {
    public static void main(String[] args) {
        int a=34;
        String name="rohitash";
        float weight= (float) 34.3565;
        System.out.println(a);
        System.out.println(weight);
        System.out.println(name);
    }
}
