package com.interfaces;

import java.util.Scanner;

public class PwdMain {
    public boolean isValid(String s1) throws InvalidPasswordException
    {
    	 if(s1.equals("Student@123"))
	     {
    		 return true; 
	     }
    	 else
    		 throw new InvalidPasswordException("Password is incorrect");
    }
	public static void main(String[] args) {
		PwdMain p=new PwdMain();
		 int i=1;
	     Scanner s=new Scanner(System.in);
	    while(i<=3)
	    {
	    	
	     System.out.println("Enter password ");
	     String s1=s.next();
	     try {
			if(p.isValid(s1))
			 {
				 System.out.println("Password is correct");
				 break;
			 }
			else 
				continue;
		} catch (InvalidPasswordException e) {
			
			System.out.println("Password is incorrect");
		}
	     if(i==3)
	    	 System.out.println("Account is locked");
	     i++;
	    }
	    s.close();
		}


	

}
