package com.emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Hasmaemp {

	public static void main(String[] args) {
		Employee e1=new Employee("anu",20000,12);
		Employee e2=new Employee("priya",34000,13);
		Employee e3=new Employee("dana",78000,14);
		HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
        map.put(1, e1);map.put(2, e2);map.put(3, e3);
        for(Entry<Integer, Employee> m:map.entrySet())//using for each
	    {
	    	System.out.println("Key "+m.getKey()+"Value "+m.getValue());
	    }
        
        Iterator<Map.Entry<Integer,Employee>> i=map.entrySet().iterator();//using iterator
	    while(i.hasNext())
	    {
	    	
	    	Map.Entry<Integer, Employee> itr=i.next();
	    	System.out.println("Key "+itr.getKey()+" Value "+itr.getValue());
	    
	    }
	   for(Employee e:map.values())
	   {
		   System.out.println(e.empid+" "+e.name+" "+e.sal);
	   }
	  
	}

}
