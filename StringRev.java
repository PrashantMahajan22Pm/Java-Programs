import java.util.Scanner;

class StringRev
{
 public static void main(String [] arg)
 {
  System.out.println(" Enter the String ");
  Scanner sobj = new Scanner(System.in);
  String sStr = sobj.nextLine();
  RevStringCls robj = new RevStringCls(sStr);
  System.out.println (" Reverse string is : "+ robj.Reverse());
 }
}

class RevStringCls
{
 public String str;
 public char [] crr;

public RevStringCls(String xGet)
{
  str=xGet;
}
 public String Reverse()
 {
    int A = 0;
  crr = str.toCharArray();
  char [] cRev = new char[str.length()];

  for(int i = str.length()-1;i>=0; i--)
  {
    cRev[A] = crr[i];
    A++;
  }  return new String(cRev);
 }
}