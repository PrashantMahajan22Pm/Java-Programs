import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    public static void main(String arg[]) {
        try {
            String URL = "jdbc:mysql://localhost:3307/";
            String databaseName = "Nov24";
            String Username = "root";
            String Password = "Prashant22";

            Connection cobj = DriverManager.getConnection(URL, Username, Password);

            String sql = "droop DATABASE " + databaseName;
            Statement sobj = cobj.createStatement();
            sobj.executeUpdate(sql);
            sobj.close();

            System.out.println("Database created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}