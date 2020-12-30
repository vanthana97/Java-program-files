package com.emp;

import java.util.HashSet;
import java.util.Iterator;

public class UserDefclass {

	public static void main(String[] args) {
		Employee e1=new Employee("anu",20000,12);
		Employee e2=new Employee("priya",34000,13);
		Employee e3=new Employee("dana",78000,14);
		HashSet<Employee> set=new HashSet<Employee>();
		set.add(e1);set.add(e2);set.add(e3);
		for(Employee e:set)
			System.out.println(e);
		Iterator<Employee> i=set.iterator();
		while(i.hasNext())
		{
			Employee em=(Employee) i.next();
			//System.out.println(em);
			System.out.println("EmpId " +em.empid+"Empname "+em.name+"Salary "+em.sal);
		}
	}

}
