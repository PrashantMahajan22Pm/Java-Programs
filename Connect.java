import java.sql.*;          // 1

class Connect
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3307/fruit";
        String Username = "root";
        String Password = "Prashant22";
        String Query = "select * from Mango";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        
        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery(Query);      // 4

        while(robj.next())          // 5
        {
            System.out.println("weight : "+robj.getInt("weight"));
            System.out.println("name : "+robj.getString("name"));
            System.out.println("price : "+robj.getString("price"));
        }
    }
}

// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert