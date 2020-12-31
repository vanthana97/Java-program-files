package com.basics1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[]=new int[5];
       arr1[0]=100;
       arr1[1]=200;
       int arr[]= {100,200,300,400,500};
       //System.out.println(arr1[0]);
       //System.out.println(arr1[2]);
       int sum=0;
       for(int i=0;i<5;i++)
       {
    	   sum=sum+arr[i];
       }
      System.out.print(sum/5);
	}

}
