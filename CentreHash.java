import java.util.*;

class CentreHash
{
 public static void main(String [] Arg )
 {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the Row ");
  int Row = sobj.nextInt();
  System.out.println("Enter the Column ");
  int Column = sobj.nextInt();
  DPrint aobj =  new DPrint();
  aobj.Display(Row,Column);
 }
}

class DPrint
{
    public void Display(int iCol, int iRow)
    {
     int i =0,j=0;
    for(i = iCol; i > 0; i--)
    {
     for(j = 1; j <= iRow; j++)
     {
     if(i == j)
     {
     System.out.print("#\t");
     }
     else
     {
       System.out.print("*\t");

     }
     }
      System.out.println(" ");
    }
    
    }

 }

 