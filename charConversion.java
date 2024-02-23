
//  caharater conversion small to big 

  import java.util.Scanner;


 class charConversion
  {
    public static void main(String [] arg)
    {
        Scanner sobj = new Scanner (System.in);
        System.out.println("Enter the String : ");
         String sstr = sobj.nextLine();
         Changer cobj = new Changer(sstr);
       System.out.println(" newString is : "+cobj.Conversion());

    }
}

class Changer
{
    public String str;
    public char ctemp [] ;

    public Changer(String xstr)
    {
       str = xstr;
    }

    public String Conversion()
    {
        ctemp = str.toCharArray();
       

        for (int i=0; i < ctemp.length; i++)
        {
            if ( ctemp[i] >= 'a' &&  ctemp[i] <= 'z')
            {
               ctemp[i] = (char) (ctemp[i] - 32);
            }
        }
        
        
       return new String (ctemp);
    }

}
