import java.util.Scanner;


class Assign54_5 {
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
   int iDigit = 0;
  if(iNo == 0)
  {
    return iSum;
  }
  else
  {
    iDigit = iNo % 10;
    iSum *= iDigit;
    Addition(iNo/10);
    
  }
  
  return iSum;
 }
}