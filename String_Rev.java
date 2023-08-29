import java.util.*;

  class String_Rev
  {
  public static void main(String [] Argu ) 
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the String ");
    String s1 = sobj.nextLine();

    System.out.println(s1);
    Str sj = new Str(s1);
    sj.Print();

  }

  }

  class Str
  {
   private char [] ch ;
  public Str(String  X)
  {
   ch  =X.toCharArray();
  }
     public void Print()
        {
    for(int i = ch.length-1;  i >= 0;i--)
    {
        System.out.println(ch[i]);
    }
        }
     
  }