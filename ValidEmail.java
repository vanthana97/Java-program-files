package stringpkg;

import java.util.Scanner;

public class ValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Email Address");
       String mail=s.next();
       s.close();
       if(mail.contains("@") && mail.contains(".com"))
    	   System.out.println("Entered mail id is valid");
       else
    	   System.out.println("Entered mail is invalid");
	}

}
