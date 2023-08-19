import java.util.*;

class ChkPalindrom
{
     public static void main(String [] Arg)
    {

    
 Scanner sobj = new Scanner(System.in);
 System.out.println("Entre the string ");
 String str = sobj.nextLine();
 Palin pboj = new Palin(str);
 String sAns = Chk();

 if(sAns == true)
 {
  System.out.println("String is PalinDrom ");
 }
 else
 {
    System.out.println("String is PalinDrom ");

 }
    }
}
class Palin{
  private String str;

  public Palin(String X)
  {
   str = X;
  }

  public boolean Chk()
  {
   boolean bRet = true;
   char [] Crr = str.toCharArray();
   char [] Brr = Crr.length;
   int A = 0;
   for(int  i= Crr.length - 1;i >=0; i--)
   {
   Brr[A] = Crr[i];
   if(Brr[A] == Crr[i])
   {
   bRet = false;
   break;
   }
   A++;
   }
   return bRet;
  }

}