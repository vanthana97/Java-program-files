package com.basics;
import java.util.*;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner stu = new Scanner(System.in);
           System.out.println("Enter mark1");
           int m1=stu.nextInt();
           System.out.println("Enter mark2");
           int m2=stu.nextInt();
           System.out.println("Enter mark3");
           int m3=stu.nextInt();
           int tot=m1+m2+m3;
           int avg=tot/3;
           char grade=0;
           System.out.println("Total is "+tot+" Average is"+avg);
           if(avg<25)
        	   grade='F';
           
           else if((avg>=25)&&(avg<45))
        	   grade='E';
           else if((avg>=45)&&(avg<50))
        	   grade='D';
           else if((avg>=50)&&(avg<60))
        	   grade='C';
           else if((avg>=60)&&(avg<80))
        	   grade='B';
           else 
               grade='A';
           
           System.out.println("GRADE "+grade);
           stu.close();
	}

}
