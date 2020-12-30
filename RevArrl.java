package com.emp;

import java.util.ArrayList;
import java.util.Collections;


public class RevArrl {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<String>();
	     al.add("abc");     al.add("xyz");     al.add("lmn");     al.add("pqr");     al.add("tuv");
	    System.out.println(al);
	    for(int i=al.size()-1;i>=0;i--)
	    {	    	
	    	System.out.println( al.set(i, al.get(i)));  
	    	     
	    }
	 Collections.reverse(al);
	 System.out.println(al);
	}

}
