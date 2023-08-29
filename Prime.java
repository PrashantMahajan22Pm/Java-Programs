import java.util.*;

class Prime{
    public static void main(String [] arg)
    {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Ente the Number ");
     int iNum = sobj.nextInt();
   PPrime pobj = new PPrime(iNum);
   boolean bAns = pobj.Chk();
   
   if(bAns == false)
   {
    System.out.println("it is a Prime Number ");
   }
   else
   {
    System.out.println("It is Not a Prime Number ");
   }
    }
}

class PPrime{
  private int iNo;
  public PPrime(int X)
  {
   iNo = X;
  }
  public boolean Chk()
  {
   boolean bRet = false;
   int iFact = 0;
   for(int iCnt = 1;iCnt< iNo/2; iCnt++)
   {
    if(iNo %  iCnt == 0)
    {
       System.out.println("iCnt is "+iCnt);

     iFact++;
     System.out.println(iFact);
    }
    if(iFact >= 2)
    {
     bRet = true;
    }
   }
   return bRet ;
  }
}

class 