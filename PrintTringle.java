  /*
    Input : 

    Row : 4
    Col : 4

    Output : 
    *
    *   *
    *   *   *
    *   *   *   *
    *   *   *   
    *   *
    *

*/  




import java.util.Scanner;

class PrintTringle
{
 public static void main(String [] Arg)
 {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the Row ");
 int iNo1 = sobj.nextInt();
   System.out.println("Enter the Coloum ");
 int iNo2 = sobj.nextInt();
 DemoDisplay ddobj = new DemoDisplay();
 ddobj.Display(iNo1, iNo2);
 }
}

class DemoDisplay
{
  public void Display(int iCol, int iRow)
  {
  int i= 0;
  int j = 0;

  for(i = 1; i<= iCol; i++)
  {
  for(j = 1; j<=iRow; j++)
  {
    if(i >= j)
    {
  System.out.print("*\t");
    }
    else
    {
      System.out.print(" \t");
    }
  }
   System.out.print(" \n");
  }
  for(i = iCol; i>= 1 ;i--)
  {
  for(j = 1; j<iRow; j++)
  {
    if(i >= j)
    {
  System.out.print("*\t");
    }
    else
    {
      System.out.print(" \t");
    }
  }
   System.out.print(" \n");
  }
  }
}