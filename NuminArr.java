package com.basics1;

public class NuminArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gn=4;
		boolean res=false;
      int arr[]= {1,2,3,4};
      for(int i=0;i<4;i++)
      {
    	  if(arr[i]==gn)
    	  {
    		  res=true;
    		  break;
    	  }   
          else
          {
        	  res=false;
        	  continue;
          }
    	     
      }
    	  
    	  if(res)
    		  System.out.print(gn+" is in Array  ");
          else
        	  System.out.print(gn+" is not in array");
      
      
	}

}
