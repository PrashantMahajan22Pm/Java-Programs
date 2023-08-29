
import java.util.*;

class BinarySearch
{
 public static void main(String [] Arg )
 {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the size of array ");
  int iSize = sobj.nextInt();
   System.out.println("Enter the Search ");
  int iSeach = sobj.nextInt();
  int Crr [] = new int[iSize] ;
  Aarray aobj = new Aarray(iSize,Crr);
  int iRet = 0;
  boolean bRet = false;
  aobj.Accept();
  aobj.Display();
  
  bRet = aobj.LinerS(iSeach);
  if(bRet == true)
  {
  System.out.println("Number Found ");
  }
  else
  {
    {
  System.out.println("Number Not  Found ");
  }
  }
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

  public boolean LinerS(int iSe)
 {
    boolean bAns = false;
   System.out.println("  Number Serching start  ");
   for(i =0; i < Size; i++)
    {
      if(Arr[i] == iSe)
      {
     bAns = true;
     break;
      }
    }
    return  bAns;
 }

 public boolean Bidirectional (int iSe)
 {
  boolean flag = false;
  int iStart = 0;
  int iEnd = Size-1;

    while(iStart <= iEnd)
    {
    if ((Arr[iStart] == iSe) || (Arr[iStart] == iSe) )
    {
      flag = true;
      break;
    }
  
      
  }
    return flag;
 }

 public boolean BinarySe (int iSe)
 {
  boolean flag = false;
  int iStart = 0;
  int iEnd = Size-1;
  int iMid = 0;

    while(iStart <= iEnd)
    {
    iMid = iStart + (iEnd - iStart) / 2;
    if(Arr[iMid] == iSe)
    {
      flag = true;
      break;
    }
   else if(Arr[iMid] < iSe)
        {
            iStart = iMid + 1;
        }
        else if(Arr[iMid] > iSe)
        {
            iEnd = iMid - 1;
        }
      
  }
    return flag;
 }
}

 