public class subString
 {
    public static void main(String [] arg)
    {
    String sc = "abcabcbb";
    subCheker aobj = new subCheker();
    aobj.Cheker(sc);
    }
}


class subCheker
{
  public void Cheker(String str)
  {
    char [] srr = str.toCharArray();
    System.out.println("String is : "+srr.length);
    char [] check = new char[srr.length];
    int A = 0;
    boolean  bchk= true;
    String afterSet = "";


    for(int i= 0; i<srr.length;i++)
    {
       bchk= true;
     for(int j=0; j<=A;j++)
      {
         if(srr[i] == check[j])
        {
          bchk = false;
          break;
        }
       
      }
         if(bchk == true) 
        {
        check[A] = srr[i];
        afterSet += srr[i];
        A++;
        }
    }   
    System.out.println("SubString is : "+afterSet);
  }
}
