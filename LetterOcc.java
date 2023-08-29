import java.util.*;

 class LetterOcc
 {
  public static void main(String [] Arg)
  {
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter the String ");
   String Str =sobj.nextLine();
  System.out.println("Enter the Charachter");
  char Car = sobj.next().charAt(0);
   boolean bAns = false;
   StringX stobj = new StringX(Str,Car);
   bAns =stobj.Occrance();
   int iRet = stobj.First();
   
   if(bAns == true)
   {
    System.out.println("Character found in String");
   }
    else
    {
         System.out.println("Character Not  found in String");

    }

    if(iRet == 0)
   {
    System.out.println("Character found in String");
   }
    else
    {
         System.out.println("Character found at "+iRet+" th Index");

    }
  }
 }

 class StringX
 {
  private String atr;
  private char CA;
  public StringX(String Y,char Z)
  {
    atr = Y;
    CA = Z; 
  }
   public  boolean Occrance( )
   {
    boolean bRet = false;
   char[] Crr =atr.toCharArray();
   for(int i = 0;i<atr.length();i++)
   {
      if(Crr[i]==CA)
      {
     bRet = true;
      break;
      }
   } 

    return bRet;
   }

   public int First()
   { int bRet = 0;
   char[] Crr =atr.toCharArray();
   for(int i = 0;i<atr.length();i++)
   {
      if(Crr[i]==CA)
      {
     bRet = i;
      break;
      }
   } 
    return bRet;
  
   }
 }