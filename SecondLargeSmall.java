
import java.util.Scanner;

class SecondLargeSmall
 {

  public static void main( String [] Arg)
    {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter the Size");
     int iSize = sobj.nextInt();
     int [] iNrr = new int[iSize];
      
     System.out.println(" Enter the Element");
      for(int i=0; i<iSize; i++)
      {
      iNrr[i] =sobj.nextInt();
      }
     
     Demo1 dobj = new Demo1(iNrr);
      System.out.println(" Second big is : "+ dobj.GetSecondBig());
      System.out.println(" Second Small is : "+ dobj.GetSecondSmall());

    }
}

class Demo1
{
    public int[]iNumr;
    public Demo1(int [] Xrr)
    {
    iNumr =Xrr;
    }
    public int GetSecondBig()
    {
        int iBig = iNumr[0];
        int iSecondBig = iNumr[1];
   
        for(int i=0; i<iNumr.length; i++)
        {
            
            if(iSecondBig < iBig && iBig < iNumr[i])
            {
             iSecondBig = iBig;
            }
            if(iBig < iNumr[i])
            {
             iBig = iNumr[i];
            }
        }
        return iSecondBig;
    }

     public int GetSecondSmall()
     {
        int iSmall = iNumr[0];
        int iSecondSmall = iNumr[1];
            
        for(int i=0; i<iNumr.length; i++)
        {
            
            if(iSecondSmall > iSmall && iSmall > iNumr[i])
            {
             iSecondSmall = iSmall;
            }
            if(iSmall > iNumr[i])
            {
             iSmall = iNumr[i];
            }
        }
        return iSecondSmall;
   }
}