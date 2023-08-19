import java.util.*;

 class LetterOcc
 {
  public static void main(String [] Arg)
  {
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the String ");
   String Str =sobj.readLine();
  Sytem.out.println("Enter the Charachter");
  char Car = sobj.readLine();
   boolean bAns = false;
   StringX stobj = new StringX(str);
   bAns = Occrance(Car);
   
   if(bAns == true)
   {
    System.out.println("Character found in String");
   }
    else
    {
         System.out.println("Character Not  found in String");

    }
  }
 }

 class StringX
 {
  private String atr;
  public StringX(String Y)
  {
    atr = Y;
  }
   public  boolean Occrance(char aplha)
   {
    boolean bRet = false;
   char[] Crr =ToCharArray(atr);
   for(int i = 0;i<atr.length();i++)
   {
      if(Crr[i]==alpha)
      {
     bRet = true;
      break;
      }
   } 

    return bRet;
   }
 }