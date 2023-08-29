import java.util.*;

class PrintReverse
{
 public static void main(String [] Arg)
 {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the NUmber ");
  int iNo = sobj.nextInt();
  DisRev drobj = new DisRev(iNo);
  drobj.Display();

 }
}

class DisRev
{
 private int iNo;
 public DisRev(int iN)
 {
  iNo = iN;
 }
 public void Display()
 {
  int temp = iNo;
   iNo *= -1;
   int i=0;
   for(i=temp;i>=iNo;i-- )
   {
  System.out.print(i+"\t");
   }
 
 }
}