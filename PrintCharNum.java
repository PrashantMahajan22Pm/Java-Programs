import java.util.*;

public class PrintCharNum {
   public static void main(String [] Arg)
   {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the Number");
  int iNo= sobj.nextInt();
  DPint dobj = new DPint(iNo);
  dobj.Print();
   } 
}
class DPint
{
   private int iNo;

  public DPint(int X)
  {
 iNo = X;
  }
   public void Print()
   {
  int i=0,j=0;
  char ch = 'a';
  
  for(i = 1; i<=iNo; i++) 
  {   j = (int)ch;
   System.out.print(ch+"\t"+i+"\t");
   j++;
    ch= (char)j;
  }
   }
}
