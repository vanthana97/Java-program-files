package com.basics1;

public class CommTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,3,4,5};
      int b[]= {3,5,7,8,9};
      int c[]= {2,3,4,9,10};
      int temp=0,temp1=0,temp2=0;
      for(int i=0;i<5;i++)
      {
    	   temp=a[i];
    	  for(int j=0;j<5;j++)
    	  {
    		  temp1=b[j];
    		 for(int k=0;k<5;k++)
    		 {
    			 temp2=c[k];
    			 if(temp==temp1 && temp==temp2)
    				 System.out.print(temp);
    		 }
    	  }
    	  
      }
      
	}

}
