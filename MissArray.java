package com.basics1;

public class MissArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= new int[100];
      for(int i=0;i<=99;i++)
      {
    	  if(i!=55)
    		  arr[i]=i+1;
    	 System.out.print(arr[i]+" ");
      }
      int sum=0,sum1=0;
      for(int i=0;i<100;i++)
      {
    	   sum=sum+(i+1);
    	   sum1=sum1+arr[i];
    	  
      }
         System.out.println("\n"+(sum-sum1));
	}

}
