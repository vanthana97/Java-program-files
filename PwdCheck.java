package stringpkg;
import java.util.Scanner;
public class PwdCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
     Scanner s=new Scanner(System.in);
    while(i<=3)
    {
    	
     System.out.println("Enter password ");
     String s1=s.next();
     if(s1.equals("Student@123"))
     {
    	 System.out.println("Password is correct");
    	 break;
     }
     else
    	 System.out.println("Password is incorrect");
     if(i==3)
    	 System.out.println("Account is locked");
     i++;
    }
    s.close();
	}

}
