package com.basics;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double height,weight,bmi;
       int heightinch=72;
       int weightpoun=452;
       height=(heightinch/39.3);
       weight=(weightpoun/2.20);
        bmi=weight/(height*height);
        System.out.println("BodyMassIndex is "+bmi);
	}

}
