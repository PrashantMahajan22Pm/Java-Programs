import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class CountDigitFrequecy {
    public static void main(String [] arg)throws Exception
    {
  System.out.println("Enter the Number ");
  BufferedReader bobj = new BufferedReader( new InputStreamReader(System.in));
  int iNo= Integer.parseInt(bobj.readLine());
   System.out.println("Enter the Search Digit ");
   int iSea = Integer.parseInt(bobj.readLine());
  CountDigit cdobj = new CountDigit(iNo,iSea);
  System.out.println("Search Found at "+ cdobj.CoutD()+" times");
   
 }
}

class CountDigit
{
  public int iNo;
  public int iSea;
  public CountDigit(int X , int y)
  {
  iNo = X;
  iSea = y;
  }
  public int CoutD()
  {
  int iCount = 0;
  int itemp = iNo;
  int iDigit = 0;
  
  while(itemp != 0)
  {
  iDigit = itemp % 10;
   if(iDigit == iSea)
   {
     iCount++;
   }
   itemp = itemp / 10;
   iDigit = 0;
  }
  return iCount;
  }
}
