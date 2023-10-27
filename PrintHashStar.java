
 import java.io.BufferedReader;
 import java.io.InputStreamReader;

 class PrintHashStar {
     public static void main(String arg [])throws Exception
 {
    BufferedReader bobj = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Enter the Rows");
    int iNum1 = Integer.parseInt(bobj.readLine());
    System.out.println("Enter the Colums");
    int iNum2 = Integer.parseInt(bobj.readLine());
    Display dobj = new Display();
     dobj.Print(iNum1, iNum2);

 }
}

  class Display
{
 public void Print(int iCol , int iRow)
 { 
   for(int i= 1; i < iCol; i++)
   {
    for(int j = 1; j< iRow ; j++)
    {
       if(i % 2 == 0)
      {
     System.out.print("*\t");
     }
     else
     {
     System.out.print("#\t"); 
     }
    }
    System.out.println("");
   }
 }
}