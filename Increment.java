package com.basics;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int no=9,no2=8;
         char ch='/';
         switch(ch)
         {
         case '+':
        	 System.out.println("Addition value "+(no+no2));
        	 break;
        	 
         case '-':
        	 System.out.println("Subtraction value "+(no-no2));
        	 break;
         case '*':
        	 System.out.println("Multiplication value "+(no*no2));
        	 break;
         case '/':
        	 System.out.println("Division value "+(no/no2));
        	 break;
         default:
        	 System.out.println("Enter correct operator");
         }
	}

}
