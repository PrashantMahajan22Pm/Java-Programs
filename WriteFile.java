import java.io.FileWriter;    // Import the FileWriter class
import java.io.IOException;   // Import the IOEception class to handle erros

class WriteFile {
    public static void main(String [] Arg)
    {
        try {
 FileWriter fbobj = new FileWriter("mar.txt");
 fbobj.write("Files might be Tricky, but it is fun enough !");
 fbobj.close();
  System.out.println("Successfully wrote the file ");
    }
    catch(IOException e)
    {
    System.out.println("An error occurred ");
    e.printStackTrace();

  }
 }
}
