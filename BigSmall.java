import java.util.*;



class BigSmall{
  public static void main(String [] Arg)  
  {
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the Size Of Array ");
   int iSize = sobj.nextInt();
 

 int [] Arr = new int[iSize];
 int iCnt = 0;
 
for( iCnt = 0; iCnt < iSize; iCnt++)
{
 Arr[iCnt]=sobj.nextInt(); 
}
  
  NumberY yobj = new NumberY(Arr);
  iCnt = 0;
  iCnt = yobj.Addition();
  System.out.println("Addition of Array is "+iCnt);

}

}


abstract class  NumberX
{

  
  public abstract int Addition();
}

class NumberY extends NumberX
{  private int [] Crr;
  public NumberY(int [] X)
  {
   Crr = X;
}
  public int Addition()
  {

    int iSum = 0;
    for(int iCnt = 0; iCnt< Crr.length ; iCnt++)
    {
      iSum += Crr[iCnt];
    }

    return iSum ;
  }
}