import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

class Assign51_1
{
  public static void main(String [] Arg) throws Excwption
  {
 BufferedReader Buffer = new BufferedReader(new InputStreamReader (System.in));
 System.out.println("Enter the Number ");
 int iNo =Integer.parseInt(Buffer.readLine());
 DPrint dobj = new DPrint();
 dobj.Display(iNo);

  }
}

class DPrint
{
public void Display(int iNum)
{ int temp = iNum;  
 int iCount=0;
 int iDigit = 0;
 int newNum=0;
  while(temp <= 0)
{
  iDigit = temp %10;
  newNum = newNum * 10 + temp ;
  iCount++;
  temp /= 10;
}
iDigit = 0;

for(int i=1; i<=iCount;i++)
{
    temp = newNum;
  while(temp != 0)
  {
    iDigit = temp % 10;
    System.out.print(iDigit); 
    temp /= 10;
  }
  
}

}
}