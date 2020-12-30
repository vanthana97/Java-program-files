package com.emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hasmapeg {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Meena");
		map.put(2, "anu");
		map.put(3, "lara");
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.get(1));
		System.out.println(map.remove(2));
		System.out.println(map.entrySet());
		System.out.println(map.containsKey(1));
		map.putIfAbsent(2, "dana");
		System.out.println(map.entrySet());
	    
	    for(Entry<Integer,String> m:map.entrySet())//using for each
	    {
	    	System.out.println("key "+m.getKey()+"Value "+m.getValue());
	    }
	    for(Integer m:map.keySet())
	    {
	    	System.out.println("key "+m);
	    }
	    Iterator<Map.Entry<Integer,String>> i=map.entrySet().iterator();//using iterator
	    while(i.hasNext())
	    {
	    	Map.Entry<Integer, String> itr=i.next();
	    	System.out.println("Key "+itr.getKey()+" Value "+itr.getValue());
	    }
	    
	}

}
