import java.util.*;

class MultiEven
{
  public static void main(String Arg [])
  {
  Scanner sobj = new Scanner (System.in);
  System.out.println("Enter  the Number ");
  int iNo = sobj.nextInt();
  Multi mobj = new Multi(iNo);
  System.out.println(""+mobj.evenM());
  
  }
}

class Multi
{
  public int Num;
  public Multi(int X)
  {
  Num = X;
  }
  public int evenM()
  {
  int iRet=1;
  int i;

  for(i = 1; i<= Num/2; i++)
  {
    if((Num / i) / 2 == 0)
    {
     iRet*=Num / i;
    }
  }

  return iRet;
  }
}