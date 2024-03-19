
public class searchString 
{
   public static void main(String [] str)
   {
  String s = "abc", t = "ahbgdc";
  TwoStringSearch tobj = new TwoStringSearch();
  boolean bAns = tobj.Searcher(s, t);
  tobj.Printer(bAns);

  System.out.println("Second string is ");
  String ss = "axc", tt ="ahbgdc";
  TwoStringSearch tobj1 = new TwoStringSearch();
  boolean bAns1 = tobj1.Searcher(ss, tt);
  tobj1.Printer(bAns1);
  
   }    
 }


 class TwoStringSearch 
 {
    public boolean Searcher(String str1 , String str2)
    {
        int i = 0;
        char [] crr1 = new char [str1.length()];
        char [] crr2 = new char [str2.length()];
        int secj = 0;
        boolean bret = false;

        if (str1.isEmpty()) // Check if s is empty
            return true; // Empty string is always a subsequence

       for(; i < crr2.length; i++)
       {
         if(crr2[i] == crr1[secj]) 
         {
           if(secj >= crr1.length-1)
           {
            bret = true;
           }
           else {
            secj++;
           }
         }
       }
       return bret;
    }

    public void Printer(boolean bAns)
    {
        if(bAns == true)
        {
          System.out.println("Search is  found ");
      
        }
        else
        {
          System.out.println("Search is not found ");
        }
    }
 }