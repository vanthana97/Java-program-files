package com.emp;

import java.util.HashSet;
import java.util.Scanner;

public class NameSrch {

	public static void main(String[] args) {
		HashSet<Object> name=new HashSet<>();
		name.add("XYZ");
		name.add("anu");
		name.add("dina");
		System.out.println(name);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");	
		    String name1=s.next();
		s.close();
		for(Object no:name)
		{
			if(no.toString().contains(name1))
			{
				System.out.println("Name is found");
				break;	
			}
			else 
				continue;
			
		}
		for(Object no1:name)
		{
			if(no1.equals(name1))
			{
				System.out.println("Name is found");	
			}
			else 	
				continue;
			
	}

	}

}
