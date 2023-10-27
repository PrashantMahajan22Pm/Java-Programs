import java.util.*;

class CheckPrime
{
 public static void main(String [] Arg)
 {
  Scanner sobj = new Scanner (System.in);
  System.out.println("Enter Number for Checking ");
  int iNum = sobj.nextInt();
  Prime pobj = new Prime(iNum);
 boolean bAns = false;
  bAns =  pobj.Check();
 if(bAns == true)
 {
   System.out.println("IT is Prime Number");
 }
 else
 {
    System.out.println("It is Not a Prime Number");
 }
}
}

class Prime
{
  public int iNo;
  public int i;
  public Prime(int X)
  {
  iNo = X;
  i = 0;
  }
  public boolean Check()
  {
   int iTemp = iNo;
   boolean bRet = true;
   int iFact = 0;
   for(i = 1;i< iTemp;i++)
   {
     if(iNo % 2 == 0)
     {
      iFact++;
     }
   }
   if(iFact >= 2)
   {
    bRet = false;
   }
   return bRet;
  }
}