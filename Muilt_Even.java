import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Muilt_Even {
  public static void main(String []  Arg)throws Exception
  {
   BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the Number ");
   int iNum = Integer.parseInt(buff.readLine());
   getFact gobj = new getFact(iNum);
   System.out.println("Multiplication of Even fat is "+gobj.MultFactEven());
  }    
}

class getFact
{
  private int iNo;

  public getFact(int iX)
  { 
  iNo = iX;
  }

  public int MultFactEven()
  {
  int iMult = 1;
  int i= 0;

  
  for(i = 1; i< iNo/2; i++)
  {
 if(iNo % i == 0)
 {
  if(i % 2 == 0)
  {
    System.out.println("Even Fact is "+i);
     iMult *= i;
  }
 }
  }
  return iMult;
  }
}
