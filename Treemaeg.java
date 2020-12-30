package com.emp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Treemaeg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(4, "Meena");
		map.put(1, "anu");
		map.put(3, "lara");
		System.out.println(map);
		TreeMap<String,String> map1=new TreeMap<String,String>(Collections.reverseOrder());
		map1.put("abc", "Meena");
		map1.put("fff", "anu");
		map1.put("eee", "lara");
		System.out.println(map1);
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "Meena");
		hmap.put(2, "anu");
		hmap.put(3, "lara");
		System.out.println("Enter name");
		String name=s.next();
		s.close();
		if(hmap.containsValue(name))
			System.out.println("Already exist");
		else
			hmap.put(hmap.size()+1, name);
		System.out.println(hmap);

	}

}
