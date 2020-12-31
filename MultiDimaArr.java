package com.basics1;

public class MultiDimaArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int no[][]=new int[6][5];
     for(int row=0;row<6;row++)
     {
    	 for(int col=0;col<4;col++)
    	 {
    		 no[row][col]=col+row;
    	 }
     }
     for(int row=0;row<6;row++)
     {
    	 for(int col=0;col<4;col++)
    	 {
    		 System.out.print(no[row][col]+" ");
    	 }
    	 System.out.println();
     }
	}

}
