import java.util.*;

class StringRev
{
 public static void main(String [] Arg)
 {
   Scanner sobj = new Scanner (System.in);
   System.out.println("Enter the String ");
   String stt = sobj.nextLine();
   Revv robj = new Revv(stt);
   System.out.println("New String is "+robj.Rev());
 }
}

class Revv
{
  private String str;

  public Revv(String X)
  {
 str =X;
  }
  public String Rev()
  {
    char ch [] = str.toCharArray();
    int Start = 0;
    int End = str.length()-1;
    char temp ;
  
    while (Start < End)
    {
      temp = ch[Start];
      ch[Start] = ch [End];
      ch[End] = temp;      
        Start ++;
        End--;
    }
     return new String (ch);
  }
}