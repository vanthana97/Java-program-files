package com.interfaces;

import java.util.Scanner;

public class ThroEg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		int age=s.nextInt();
		s.close();
		try
		{
		if(age<0)
			throw new ArithmeticException();
		else if(age==0)
			 throw new NullPointerException();
		else
			System.out.println("valid age");
		}
		catch(ArithmeticException e)
		{
			System.err.println("Age should be positive");
		}
		catch(NullPointerException e1)
		{
			System.err.println("Should have a value");
		}
	}

}
