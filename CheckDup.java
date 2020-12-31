package com.basics1;

public class CheckDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,3,4,4};
       boolean res=false;
       for(int i=0;i<5;i++)
       {
    	   for(int j=i+1;j<5;j++)
    	   {
    	   if(a[i]==a[j])
    		   res=true;
    	   else
    		   continue;
    	   }
       }
      if(res)
    	  System.out.println("It has duplicates");
      else
    	  System.out.println("No duplicates");
	}

}
