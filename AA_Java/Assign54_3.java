import java.util.Scanner;

class Assign54_3 {
 public static void main(String [] Arg)
 {
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the Number ");
   String str = sobj.nextLine();
   DPrint dpobj = new DPrint();
   int iRet = dpobj.StringCount(str);
   System.out.println("Summetion is "+iRet);
 }    
}

class DPrint
{
int iSum=0; 
    public int StringCount(String crr)
 {
  
 char [] srr= crr.toCharArray();
  int i=0;
 while(srr[i] != '\0')
 {
  iSum++;
  i++;
 }
  return iSum;
 }
}