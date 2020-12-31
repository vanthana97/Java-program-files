package com.basics;
import java.util.*;
public class LeapYer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the year");
       int n=in.nextInt();
       
       if(n%4==0)
    	   System.out.println("Leap year");
       else 
    	   System.out.println("Not leap year");
       in.close();
	}

}
