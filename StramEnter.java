 
 class StramEnter
 {
 public static void main(String[] args) throws java.io.IOException
 
   
    {
char character;
System.out.print(" Enter a Charachter ");
System.out.flush();
character = (char) System.in.read();
System.out.println();
System.out.println( " You Types : "+character);
    }
}