package com.basics1;

public class AddTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[][]= {{1,2,3},{4,5,6}};
	    int no1[][]= {{1,1,1},{4,5,6}};
	    int add[][]=new int[2][3];
		for(int row=0;row<2;row++)
	     {
	    	 for(int col=0;col<3;col++)
	    	 {
	    		 add[row][col]=no[row][col]+no1[row][col];
	    	 }
	    	
	     }
		for(int row=0;row<2;row++)
	     {
	    	 for(int col=0;col<3;col++)
	    	 {
	    		 System.out.print(add[row][col]+" ");
	    	 }
	    	 System.out.println();
	     }
		
	    
	}

}
