import java.util.*;
import java.lang.Math;

 class GetRandom
 {
   public static void main(String [] Arg)
   {  
      
    Scanner sobj1 = new Scanner(System.in);
    Search sObjS = new Search();

    sObjS.UserASk();
    int iNum = sobj1.nextInt();

    while(true)
   {
    if(iNum > 1 || iNum < 0)
    {
      System.out.println(" OPPS , Wrong Entry \n => please enter you choice again");
    }
    else if( iNum == 0)
    {
      System.out.println(" Thank you for playing *'Imagine_Gessing_game'* ");
       break;
     }
    else if(iNum == 1)
    {
    sObjS.Match();
      }

      System.out.println(" \n ");
    sObjS.UserASk();
    iNum = sobj1.nextInt();
      }
    }
  }

  class Search
   {
   private int iNo;

   public void Match()
   {
     Scanner sobj2 = new Scanner(System.in);
     
     int iRand = (int) ((Math.random() + Math.random()+ Math.random()) * 50) ;

     int iClick = 0;
     int iGessCount = 0;
     System.out.println(" Gess the number ");
     while(true)
     {
       iClick = sobj2.nextInt();
       iGessCount++;
       if(iRand == iClick)
       {
       System.out.println(" \n*** Congratulation your choice is great ***");
       System.out.println("\n you take "+iGessCount+ " times for gessing write number");
       break;
       }
       else if(iRand > iClick)
       {
      System.out.println(" you have to Enter the Big number");
       }
       else if(iRand < iClick)
       {
      System.out.println(" you have to Enter the Small number");
       }
     }
    
   }

   public void UserASk()
   {
     System.out.println(" press '0' for Exit ");
     System.out.println(" press '1' for start New Game ");
   }

 }

