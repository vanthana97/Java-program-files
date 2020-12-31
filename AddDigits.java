package com.basics;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int number=565;
            int sum=0;
            while(number>0)
            {
            
            	sum=sum+number%10;
            	number=number/10;
            }
            System.out.println("Sum of digits is "+sum);
	}

}
