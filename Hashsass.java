package com.emp;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Hashsass {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("Meena");
		hset.add("anu");
		hset.add("lara");
		ArrayList<String> list=new ArrayList<String>(hset);
		System.out.println("Arraylist "+list);
		TreeSet<String> tset=new TreeSet<String>(hset);
		System.out.println("Treeset "+tset);
		TreeSet<String> tset1=new TreeSet<String>();
        tset1=(TreeSet<String>) tset.headSet("lara");
        System.out.println(tset1);
	}

}
