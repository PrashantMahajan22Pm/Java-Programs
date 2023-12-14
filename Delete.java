import java.io.File;

class Delete {
    public static void main(String [] Arg)
    {
     File fobj = new File("First.c");
     if(fobj.delete())
     {
      System.out.println("Deleted the file "+fobj.getName());
     }
     else
     {
      System.out.println("Faild to delete this file ");
     }
    }
}
