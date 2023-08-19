import java.util.Scanner;

 class June_20
 {
    public static void main(String [] Arg)
    {
    Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the Number \n");
  int iNo = sobj.nextInt();
  Get gobj = new Get(iNo);
  int iRet = gobj.Get_Sametion();
  System.out.println("Summetion of Fatoers is "+iRet+"\n");
  


    }
}
 class Get
 {
   private int iVal;

   public Get(int X)
   {
    iVal = X;
   }

  public int Get_Sametion()
  {int iSum =0;
    int iCnt = 0;
    for(iCnt = 1;iCnt<=iVal/2;iCnt++)
    {
     if(iVal % iCnt==0)
    {   
      System.out.println("Factor is "+iCnt);
         iSum += iCnt;
    }
}
    return iSum;
  }
   
 }