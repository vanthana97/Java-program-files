package com.basics;

public class SinVal {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5,x=30;
      
      for(int i=1;i==Math.pow(x, n);i++)
      {
    	  sin(i);
      }
	}
     public static double sin(int num)
     { 
    	 int x1=num;
    	 double sinval=0;
    	sinval=x1-Math.pow(x1, 3)/factorial(3)+Math.pow(x1, 5)/factorial(5)-Math.pow(x1, 7)/factorial(7)+Math.pow(x1, 9)/factorial(9);
    	return sinval;
     }
     public static int factorial(int num1)
     {
    	 int fact=1;
         int n1=num1;
         while(n1>0)
         {
        	 fact=fact*n1;
        	 n1--;
         }
         return fact;
     }
}
