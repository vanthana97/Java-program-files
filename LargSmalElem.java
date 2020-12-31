package com.basics1;

public class LargSmalElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,9,8,3,2};
      
      for(int i=0;i<5;i++)
      {
    	  for(int j=i+1;j<5;j++)
    	  {
    		  if(arr[i]>arr[j])
    		  {
    			  int t=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=t;
    		  }
    	  }
      }
      for(int i=0;i<5;i++)
    	  System.out.print(arr[i]+" ");
      System.out.println("\nLargest element "+arr[4]);
      System.out.println("Smallest element "+arr[0]);
	}

}
