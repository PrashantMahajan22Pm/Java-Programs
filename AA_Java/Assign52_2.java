import java.util.Scanner;

class Assign52_2
{
 public  static void main(String [] arg)
  { 
 Scanner sobj = new Scanner(System.in);
 System.out.println("Enter the StarrtNumber ");
 int iNo = sobj.nextInt();
 Reverse robj = new Reverse();
 robj.Display(iNo);
  }
}

class Reverse
{
   
 public void Display(int iNum)
 {
  if(iNum == 0)
  {
  return;
  }
  else
  {
    Display(iNum-1); 
  }
     System.out.print(iNum+"\t");

 }
}