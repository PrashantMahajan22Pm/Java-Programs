
/*
 *  A sign of the times is that people are concerned about ther amount of fat 
 *  they consume. Many health experts recommend that people get no more that 20 %
 *  of their colories from fat . Write a program that recommends the number of 
 *  calories and maximum grams of fat a person should eat each day . base your
 *  Recommendation on the  person's weight and weather the person is active or 
 *  sedentary during the day . if the person is  sedentary , that  person's
 *  activity factor is 13 . if the person is active , that persons activity factor is 
 *  13 . if the person is active , that person's weight to get the recommended number of 
 *  calories . the maximum fat is 20% of the recommended calories.
 * 
 * 
 */


import java.util.Scanner;

class caloriesRecommendation {
   public static void main(String [] Arg)
   {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the weight ");
  int iWeight = sobj.nextInt();
  System.out.println("Enter the Choice (1 for active Person and 2 for Sedentary  person) ");
  int iChoice = sobj.nextInt();
  fatRecommendation frobj = new fatRecommendation();
 int iRet = frobj.Calories(iWeight,iChoice);
  System.out.println(" Recommended Calaries are "+iRet +" grams");
  System.out.println(" Fat is "+frobj.Fat(iRet));
   } 
}

class fatRecommendation
{
  public int Calories(int iWeight , int iCho )
  { 
    int iCal = 0;
     if(iCho == 1)  // Active person
     {
      iCal = iWeight * 15 ;
     }
     else
     {
       iCal = iWeight * 13 ; 
     }
   return iCal;
  }

  public double Fat(int iCal)
  { 
    double ifat = 0.0;
    ifat = 0.2 * iCal;
    return ifat;
  }
}
