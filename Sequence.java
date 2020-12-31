package com.basics;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int no1=123456;
           int n1=no1/100000;
           int rem1=no1%100000;
           int n2=rem1/10000;
           int rem2=rem1%10000;
           int n3=rem2/1000;
           int rem3=rem2%1000;
           int n4=rem3/100;
           int rem4=rem3%100;
           int n5=rem4/10;
           int rem5=rem4%10;
           int n6=rem5/1;
         
           System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
	}

}
