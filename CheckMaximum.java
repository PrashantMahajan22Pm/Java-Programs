
import java.util.*;

public class CheckMaximum {
   public static void main(String [] Arg)
   {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the First  Number");
  int iNo1= sobj.nextInt();
  System.out.println("Enter the Second  Number");
  int iNo2= sobj.nextInt();
  DPint dobj = new DPint(iNo1,iNo2);
  System.out.println("Big Number is "+dobj.Print());
   } 
}
class DPint
{
   private int iNum1;
      private int iNum2;


  public DPint(int X,int Y)
  {
 iNum1 = X;
 iNum2 = Y;
  }
   public int  Print()
   {
   if(iNum1 > iNum2)
   {
 return iNum1;
   }
   else
   {
   return iNum2;
   }
   }
}
