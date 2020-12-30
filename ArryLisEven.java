package com.emp;

import java.util.ArrayList;

public class ArryLisEven {
	public ArrayList<Integer> al;
    public ArrayList<Integer> SaveEvenNumber(int n)
    {
    	al=new ArrayList<Integer>();
    	 for(int i=0;i<n;i=i+2)
    	 {
    		 al.add(i+2);
    	 }
    	 		return al;
    }
    public ArrayList<Integer> PrintEvenNumber()
    {
    	 ArrayList<Integer> res=new ArrayList<Integer>();
    	for(int item:al)
    	{
    	 	 System.out.println(item);res.add(item*2);
    	}
	    return res;
    }
    public int PrintEvenNumbers(int no)
    {
    	if(al.contains(no))
    		return no;
    	else 
    		return 0;
    }
    
	public static void main(String[] args) {
	    ArryLisEven a=new ArryLisEven();
        a.SaveEvenNumber(6);
        a.PrintEvenNumber();
       System.out.println( a.PrintEvenNumbers(6));
	}

}
