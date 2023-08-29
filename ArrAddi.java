import java.util.*;

class ArrAddi
{
 public static void main(String [] Arg )
 {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the size of array ");
  int iSize = sobj.nextInt();
  int Crr [] = new int[iSize] ;
  Aarray aobj = new Aarray(iSize,Crr);
  aobj.Accept();
  aobj.Display();
 }
}

class Aarray
{
 private int [] Arr;
 private int Size;
 private int i;

 public Aarray(int X,int [] AR)
 { 
    Size = X;
    Arr = AR;
 }
 public void Accept()
 {
   System.out.println("Enter the Array ");
   Scanner sobbj = new Scanner (System.in);
   for(i =0; i < Size; i++)
    {
   Arr[i] = sobbj.nextInt();
    }
 }
 public void Display()
 {
   System.out.println("  Array is  ");
   for(i =0; i < Size; i++)
    {
   System.out.println( Arr[i]);
    }
 }
 }

 