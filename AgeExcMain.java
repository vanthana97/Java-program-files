package com.interfaces;

public class AgeExcMain {

	public static void main(String[] args) {
		int age=-12;
		
	    try
		{ 
		 if(age<0)
			 throw new AgeException("Age cannot be negative");
		 else 
			 System.out.println("correct age");
		}
        catch(AgeException e)
	    {
        	System.out.println(e);
        	System.out.println(e.getMessage());
        	e.printStackTrace();
	    }
	}

}
