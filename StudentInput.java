package modifiers1;
import java.util.Scanner;
public class StudentInput {
	String name;
	float perc;
	boolean res;
	public void print_details()
    {
    	System.out.println(name);
    	System.out.println(perc);
    	System.out.println(res);
    	
    }
    	public static void main(String[] args) {
    		
	  StudentInput si=new StudentInput();
      Scanner s=new Scanner(System.in);
      System.out.println("Enter name");
       si.name=s.next();
      System.out.println("Enter Percentage");
       si.perc=s.nextFloat();
      System.out.println("Enter result");
         si.res=s.nextBoolean();
      si.print_details();
      s.close();
      
	}

}
