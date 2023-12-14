import java.io.File;    //  Import the File class 
import java.io.IOException;    // Import the IOExcepion
import java.util.Scanner;



class CreateFile
{
 public static void main(String  [] arg)
 {
  try{
    System.out.println("Enter the File Name ");
 Scanner sobj = new Scanner(System.in);
 File fobj = new File(sobj.nextLine());
 
if(fobj .createNewFile())
{
 System.out.println("File Created : "+fobj.getName());
}
else
{
System.out.println("File already exists ");
}
  }
  catch(IOException e)
  {
  System.out.println("An Error Occurred ");
  e.printStackTrace();
  }
 }
}