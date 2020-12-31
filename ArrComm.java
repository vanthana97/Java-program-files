package com.basics1;

public class ArrComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {100,200,10,20,30};
      int arr1[]= {500,600,30,10,20};
      int no1=0,no2=0;
      for(int i=0;i<5;i++)
      { 
    	   no1=arr[i];
    	 for(int j=0;j<5;j++)
    	  {
    		  no2=arr1[j];
    		  if(no1==no2)
    			  System.out.print(" "+no1);
    	  }
      }
      
	}

}
