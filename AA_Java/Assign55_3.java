import java.util.*;


class Assign55_3
{
   public static void main(String [] Arg)
  {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the String ");
  String str = sobj.nextLine();
  char [] srr =str.toCharArray();
  StringCheck stobj =  new StringCheck();
  int iRet = stobj.WhiteSpace(srr);
  System.out.println("Count of WhiteSpace is "+iRet);
  }
} 
class StringCheck
{
public  int iCount = 0;
  public int i=0;
 int WhiteSpace(char [] str)
{
 
 if( i ==  str.length)
 {
   return iCount;
 }
 else 
 {
  if(str[i] >=  'a'  && str[i] <= 'z')
  {
   iCount++;
  }
  i++;
  WhiteSpace(str);
 }
   return iCount;
 }
}


