package com.emp;

import java.util.TreeSet;

public class Treeseteg {

	public static void main(String[] args) {
		TreeSet<Integer> set1=new TreeSet<Integer>();
        set1.add(100);
		set1.add(98);
        set1.add(89);
        set1.add(87);
        set1.add(100);
        System.out.println(set1);
        System.out.println(set1.first());
        System.out.println(set1.last());
        System.out.println(set1.descendingSet());
        TreeSet<String> set=new TreeSet<String>();
        set.add("abc");
        set.add("xyz");
        set.add("ABC");
        System.out.println(set);

	}

}
