package modifiers;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class ExpiryDate {

	public static void main(String[] args) {
		DateTimeFormatter myfrmt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter manufactured date");
      String md=s.next();
      s.close();
      LocalDate md1=LocalDate.parse(md,myfrmt);
      LocalDate ed=md1.plusMonths(6);
      
      System.out.println("Expiry date is "+ed.format(myfrmt));
	}

}
