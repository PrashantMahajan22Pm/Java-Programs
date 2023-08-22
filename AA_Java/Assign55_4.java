
import java.util.*;

class Assign55_4 
{
    public static void main(String []  Arg)
    {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter the Number ");
     int iNum = sobj.nextInt();
      

   Get_Maxi gobj = new Get_Maxi();
   System.out.println("Maximun Digit is "+gobj.IMaX(iNum));
    }
}

class Get_Maxi
{
   private int iNNo;
  
    public  int iDigit ;
    int iMax = 100;
  public int IMaX(int iNo)
  {
   
  if(iNo == 0)
  {
  return iMax;
  }
  else
  { 
    System.out.println(iMax);
        System.out.println(iDigit);

    iDigit = iNo % 10;
 if(iDigit < iMax)
   {
  iMax = iDigit;
   }
    IMaX( iNo /= 10);
  }
  
   return iMax;
  }
}
