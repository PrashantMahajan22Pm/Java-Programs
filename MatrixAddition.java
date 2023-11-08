import java.util.Scanner;
   
class MatrixAddition {
    public static void main(String [] Arg)
    {
        Scanner sobj = new Scanner(System.in);
       System.out.println("Enter the Row");
       int iNo1 = sobj.nextInt();
        
       System.out.println("Enter the Col");
       int iNo2 = sobj.nextInt();
      
       Matrix mobj = new Matrix(iNo1,iNo2);
      System.out.println("Enter the Matrix elements");
      mobj.Accept();
      mobj.Display();

      System.out.println("Smmetion is "+mobj.Summation());
    }
}
 
  class Matrix
  {
    private int iCol;
    private int iRow;
    private int Arr[][];
    public Matrix(int X, int Y)
    {
      iCol = X;
      iRow = Y;
      Arr = new int[iCol][iRow];
    }

    public void Accept()
    {
     Scanner sobj = new Scanner(System.in);
     for(int i=0; i< iCol; i++)
     {
      for(int j = 0; j < iRow; j++)
      {
      Arr[i][j] = sobj.nextInt();
      }
     }
    }

    public void Display()
    {
      for(int i=0; i< iCol; i++)
     {
      for(int j = 0; j < iRow; j++)
      {
         System.out.println(Arr[i][j]+"\t");
      }
     }
    }

    public int Summation()
    {
      int iSum =0;
        for(int i=0; i< iCol; i++)
     {
      for(int j = 0; j < iRow; j++)
      {
        iSum = iSum + Arr[i][j];
      }

     }
      return iSum;
    }
  }
