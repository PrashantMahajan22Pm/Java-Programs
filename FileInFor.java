import java.io.File ;  // Inport the File

 public class FileInFor
 {
  public static void main(String [] Arg)
  {
  File fobj = new File("mar.txt");
  if(fobj.exists())
  {
   System.out.println("File name : "+fobj.getName());
   System.out.println("Absolute path "+ fobj.getAbsolutePath());
   System.out.println("Writetable : "+fobj.canWrite());
   System.out.println("Readable "+fobj.canRead());
   System.out.println("File size in Byte "+fobj.length());
  }
  else
  {
    System.out.println("The file does not exits ");
  }
  }
 }