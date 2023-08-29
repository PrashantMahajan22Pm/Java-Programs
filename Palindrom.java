import java.util.*;

public class Palindrom {
  public static void main(String [] Arg) throws Exception
 {
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter the String ");
  String s = sobj.nextLine();
char [] myArray = s.toCharArray();
int Size = myArray.length;
char []Original = Arrays.copyOf(myArray,myArray.length);

for(int i = 0; i< Size /2; i++)
{
 char temp = myArray[i];
 myArray[i]=myArray[Size-i-1];
 myArray[Size-i-1] = temp;

 }

 System.out.println("Original Array is "+Arrays.toString(Original));
 System.out.println("Reverse Array is "+Arrays.toString(myArray));

 if(Arrays.equals(myArray , Original))
 { 
    System.out.println("Enmtered String is a plindrom");
 }
 else
 {
       System.out.println("Enmtered String  is   Not a plindrom");
 
 }

 }}