
import java.util.Scanner;


class Assign54_4 {
 public static void main(String [] Arg)
 {
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the Number ");
   int iNum = sobj.nextInt();
   DPrint dpobj = new DPrint();
   int iRet = dpobj.Addition(iNum);
   System.out.println("Summetion is "+iRet);
 }    
}

class DPrint
{
    private int iSum = 1;  
 public int Addition(int iNo)
 {
 
  if(iNo == 0)
  {
    return iSum;
  }
  else
  {
    
    iSum *= iNo;
    Addition(iNo-1);
    
  }
  
  return iSum;
 }
}