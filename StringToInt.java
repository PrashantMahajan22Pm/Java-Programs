class StringToInt {
    public static void main (String [] Arg)
    {
        String s = "42",s1 = "   -42" , s2 = "4193 with words";

        Converter cobj = new Converter(s);
        System.out.println("Number is "+cobj.ToInt());
        

        Converter cobj1 = new Converter(s1);
        System.out.println("Number is "+cobj1.ToInt());

        Converter cobj2 = new Converter(s2);
        System.out.println("Number is "+cobj2.ToInt());

        

    }
}


class Converter
 {
    public String str;
    public char [] crr;
    public char [] iTemp;

    public Converter(String X)
    {
        str = X;
        crr = str.toCharArray();
        iTemp = new char[crr.length];
    }

    public int ToInt()
    {
    
    int iRet = 0 , i=0 , A= 0 , iCount = 0; 
    for(i=0; i<crr.length  ; i++)
    {
        if( crr[i] == '-' && A == 0) 
         {
            iTemp[A] = crr[i];
             A++;
           }
      else  if( crr[i] >= '0' && crr[i] <= '9')
        {
            iTemp[A] = crr[i];
            A++;
        }
    }

    if (A == 0) {
        // Handle case where no valid digits were found
        throw new NumberFormatException("No valid digits found in the input string");
    }
    String newNum = new String(iTemp , 0 ,A);
    iRet = Integer.parseInt(newNum);

  return iRet;
    }

    public int myAtoi (String s) 
    {
         char [] crr =s.toCharArray();;
         char [] iTemp=new char[crr.length];


         int iRet = 0 , i=0 , A= 0 , iCount = 0; 
    for(i=0; i<crr.length  ; i++)
    {
        if( crr[i] == '-' && A == 0) 
         {
            iTemp[A] = crr[i];
             A++;
           }
      else  if( crr[i] >= '0' && crr[i] <= '9')
        {
            iTemp[A] = crr[i];
            A++;
        }
    }

    if (A == 0) {
        // Handle case where no valid digits were found
        throw new NumberFormatException("No valid digits found in the input string");
    }
    String newNum = new String(iTemp , 0 ,A);
    iRet = Integer.parseInt(newNum);

  return iRet;
        
    }
 }