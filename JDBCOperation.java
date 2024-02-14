
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCOperation {
     public static void main(String [] Arg)
     {
       Scanner sobj = new Scanner(System.in);
       System.out.prinln(" Enter the DataName");
       String strData =sobj.nextLine();
       JDBCActivity jobj = new JDBCActivity();
       jobj.DataBaseCreate(strData);

     }
}

class JDBCActivity
{
  public void DataBaseCreate(String Datastr)
  {
   String URL = "jdbc:mysql://localhost::3307";
   String Username = "root";
   String Password = "Prashant22";
  
   Connection cobj = DriverManager.getConnection(URL,Username,Password);

   Statement stm = cobj.createStatement();

   String query = "create database "+Datastr;

   boolean bans = stm.execute(query);

   System.out.println(" Database crated successfully !");

   close();

   ch(Exception e)
   {
    e.printStackTrace();
   }

  }
}
