import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile {
  public static void main(String [] arg)
  {
 try{
  File fobj =new File("mar.txt");
  Scanner sobj = new Scanner(fobj);
  while(sobj.hasNextLine())
  {
 String data = sobj.nextLine();
 System.out.println(data);
  }
  sobj.close();
   }
   catch (FileNotFoundException e)
   {
  System.out.println("An Error Occured ");
  e.printStackTrace();
   }
  }
}
