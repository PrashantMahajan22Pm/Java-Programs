import java.util.*;

class Assign55_2 {
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
    public  int iDigit = 0;
    public  int iMax = 0;
  public int IMaX(int iNo)
  {
  
  if(iNo == 0)
  {
  return iMax;
  }
  else
  {
   if(iDigit > iMax)
   {
  iMax = iDigit;
   }
   iDigit = iNo % 10;
    IMaX( iNo /= 10);
  }
   
   return iMax;
  }
}
