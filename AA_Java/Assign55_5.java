
import java.util.*;

class Assign55_5 
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
   public  int iDigit ;
   public int iNumber = 0;
  public int IMaX(int iNo)
  {
   
  if(iNo == 0)
  {
  return iNumber;
  }
  else
  { 
    System.out.println(iNumber);
  iDigit = iNo % 10;
 
  iNumber =iNumber * 10 + iDigit;  
    IMaX( iNo /= 10);
  }
  
   return iNumber;
  }
}
