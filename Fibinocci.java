package com.basics;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=10;
     int i,n1=1,n2=1,n3;
     System.out.print(n1+" "+n2);
     for( i=2;i<n;i++)
     {
    	 n3=n1+n2;
    	 System.out.print(" "+n3);
    	 n1=n2;
    	 n2=n3;
     }
	}

}
