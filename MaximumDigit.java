import java.util.*;


class MaximumDigit
{
 public static void main(String [] arg)
 {
    Scanner sobj = new Scanner(System.in);
   System.out.println(" Enter the Number");
   int iValu = sobj.nextInt();   
   DemoChecker dobj = new DemoChecker(iValu); 
   System.out.println(" Big number is "+dobj.BigGetter());
  }
 }

class DemoChecker
{
  public int iNum;
  public DemoChecker(int xNo)
   {
    iNum = xNo;
   }
 public int BigGetter()
   {
   int iBig = 0;
   int iDigi = 0;

   while(iNum != 0)
   {
     iDigi = iNum % 10;
     if(iBig < iDigi)
     {
       iBig = iDigi;
     }
     iNum /= 10;
   }
   return iBig;
   }
}