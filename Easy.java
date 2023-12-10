import java.util.Calendar;
 
class Easy 
 
{
 
 public static void main(String[] args)
 
 {
     Calendar cal=Calendar.getInstance();
     System.out.println(cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.YEAR));

 }
 
}
 
 
 