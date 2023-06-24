import java.util.Date;
import java.text.*;
public class CurrentDateTime {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date using toString()
      System.out.println(date.toString());


      // Date Formatting Using SimpleDateFormat


      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
