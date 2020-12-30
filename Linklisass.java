package com.emp;

import java.util.Iterator;
import java.util.LinkedList;



public class Linklisass {

	public static void main(String[] args) {
		 LinkedList<Integer> ll = new LinkedList<Integer>();
	     ll.add(10);     ll.add(20);     ll.add(20);     ll.add(220);    
	     
	     System.out.println(ll);
	     ll.addFirst(12);
	     ll.addLast(56);
	     System.out.println(ll);

	     Iterator<Integer> i = ll.listIterator(1);
	     while(i.hasNext())
	    	 System.out.println(i.next());   
	    ll.pollFirst();
	    System.out.println(ll);
	    LinkedList<Integer> ll1 = new LinkedList<Integer>();
	     ll1.add(100);     ll1.add(200);     ll1.add(300);     ll1.add(400);
	     LinkedList<Integer> jl=new LinkedList<Integer>();
	     jl.addAll(ll1);
	     jl.addAll(ll);
	     System.out.println(jl);
	     
	    
	}

}
