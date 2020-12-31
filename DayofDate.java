package modifiers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DayofDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("Enter date");
     String yr=s.next();
     s.close();
     LocalDate dt=LocalDate.parse(yr);
     DayOfWeek day=dt.getDayOfWeek();
     LocalDate dy=dt.plusWeeks(2);
     int day1=dy.getDayOfMonth();
     System.out.println(day);
     System.out.println("Date after 2 weeks "+day1);
	}

}
