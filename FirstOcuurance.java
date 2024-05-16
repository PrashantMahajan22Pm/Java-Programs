   public class FirstOcuurance 
  {
  public static void main (String [] arg) 
   {
     String  shy = "sadbutsad";
     String  needl = "sad";
 
     Checker cobj = new Checker(shy , needl);
      System.out.println (" First Checker "+cobj.strStr());

       String shy1 = "leetcode";
       String needl1 = "leeto";
       Checker cobj1 = new Checker(shy1 , needl1);
      System.out.println (" First Checker "+cobj1.strStr());
   }   
}

 class Checker 
     {
        public String haystack;
        public String needle;

   public Checker (String X , String Y)
    {
     haystack = X;
     needle = Y;
      }

      public int strStr() {
        if (needle.length() == 0) return 0;
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        } 
        return -1;
    }
     }