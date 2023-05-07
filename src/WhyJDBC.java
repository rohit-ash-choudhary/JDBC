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
