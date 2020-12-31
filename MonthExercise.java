package modifiers;

import java.time.LocalDate;

import java.util.Scanner;

public class MonthExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year to check leap or not");
		String yr=s.next();
		s.close();
		LocalDate yr1=LocalDate.parse(yr);
		String res=yr1.isLeapYear()?"Is Leap Year":"Not a Leap year";
		System.out.println(res);
		
		int days=yr1.lengthOfYear();
		System.out.println("Length of the year "+days);
		
		int dt=LocalDate.now().lengthOfMonth();
		System.out.println("Last Date in current month "+dt);
		
	
	}

}
