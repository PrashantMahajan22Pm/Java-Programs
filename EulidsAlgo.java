 import java.util.*;

 
 class EulidsAlgo
 {
  public static void main( String [] Arg)
 {
  Scanner sobj = new Scanner(System.in);
 
  System.out.println("Enter the First Number");
  int iNo1 = sobj.nextInt();

 System.out.println("Enter the Scond number");
 int iNo2 = sobj.nextInt();
 
 useEulid uobj = new useEulid();
 
 System.out.println("gerstest  diviser of "+ iNo1 +" and "+ iNo2+ " is "+uobj.getBigDivider(iNo1, iNo2));
 
   }
  }

class useEulid
{ 
 public int iSmall;
  public int iBig;  
  public int iRem;

 public useEulid()
 {
  iSmall = 0;
  iBig = 0;
  iRem  = 0;
 }

 public int getBigDivider(int iNum1,int iNum2)
 {
  
  if( iNum1 == iNum2)
 {
   return iNum1;
}
   
  if (iNum1 > iNum2)
 {
   iBig = iNum1;
   iSmall = iNum2;
  }
 else
  {
   iBig = iNum2;
   iSmall = iNum1;
  }

  while( true)
{
   iRem = iBig % iSmall;

   if(iRem == 0)
   {
    break;
   }
   iBig = iSmall;
   iSmall = iRem;
    
 }
  return iSmall;

 }

 }