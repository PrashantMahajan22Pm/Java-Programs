
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CalenderDate {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter the Date following format (MM) (DD)(Year)");
        String month = in.next();
        String day = in.next();
        String year = in.next();
       
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(day));
String dayOfWeek = getDayOfWeek(c.get(Calendar.DAY_OF_WEEK));
System.out.println(" The day is "+dayOfWeek);
    }
   
    private static String getDayOfWeek(int value){
    String day = "";
    switch(value){
    case 1:
        day="Sunday";
        break;
    case 2:
        day="Monday";
        break;
    case 3:
        day="Tuesday";
        break;
    case 4:
        day="Wednesday";
        break;
    case 5:
        day="Thursday";
        break;
    case 6:
        day="Friday";
        break;
    case 7:
        day="Saturday";
        break;
    }
    return day;
    }    
}

