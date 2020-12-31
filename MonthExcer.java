package modifiers;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
public class MonthExcer {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter date");
	      String d=s.next();
	      s.close();	    
		LocalDate dt=LocalDate.parse(d);
		System.out.println("Total number of days in Month is "+dt.lengthOfMonth());
         ZonedDateTime neyork=ZonedDateTime.now(ZoneId.of("America/New_York"));
         System.out.println("Time in newyork "+neyork);
	}

}
