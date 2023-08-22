
import java.util.Scanner;

class Assign52_5
{
 public  static void main(String [] arg)
  { 
 Scanner sobj = new Scanner(System.in);
 System.out.println("Enter the Number ");
 int iNo = sobj.nextInt();
 char cCh = 'a';
 Reverse robj = new Reverse();
 robj.Display(iNo,cCh);
  }
}

class Reverse
{
   
 public void Display(int iNum,char ch )
 {
 int iP =(int)ch;
  iP++;
  
  if(iNum == 0)
  {
  return;
  }
  else
  {
    
   System.out.print(ch+"\t");
  char kCh = (char)iP;
    Display(iNum-1,kCh); 
  }
 }
}