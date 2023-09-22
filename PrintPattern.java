import java.util.*;


class PrintPattern {
    public static void main(String [] Arg)
    {
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the Coloum ");
   int iNo1 = sobj.nextInt();
   int iNo2 = sobj.nextInt();
   Print pobj = new Print(iNo1 , iNo2);
   pobj. Display();
    }
}

class Print
{
  private int iRow;
  private int iCol;

 public  Print(int X, int Y)
 {
   iRow = X;
   iCol = Y;
 }

 public void Display()
 {
  int i = 0, j =0;

  for(i =1;i <=iRow ; i++)
  {
    for(j = 1; j<= iCol; j++)
    {
      if(i == j)
      {
     System.out.print("*\t");
      }
      else if (i > j)
      {
        System.out.print("$\t");
      }
      else if (i < j)
      {
        System.out.print("@\t");
      }
    }
    System.out.println("");
  }
 }
}
