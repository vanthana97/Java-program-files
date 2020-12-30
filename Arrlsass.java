package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Arrlsass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 ArrayList<String> color = new ArrayList<String>();
         color.add("green");color.add("blue");color.add("orange");color.add("red");color.add("white");
       
         System.out.println(color);
         Scanner s=new Scanner(System.in);
         System.out.println("Enter name");
         String str=s.next();
         s.close();
         if (color.contains(str))
             System.out.println("color found");
         else 
        	 System.out.println("Not found");
         
         ArrayList<String> dup = new ArrayList<String>();//duplicate list
         dup=(ArrayList<String>) color.clone();
         //Collections.copy(dup,color);
         System.out.println("Duplicate list"+dup);
         Collections.shuffle(dup);
         System.out.println("Shuffled list"+dup);
         Collections.swap(dup, 1, 2);
         System.out.println("Swap list"+dup);
         List<String> sublt =  color.subList(0, 3);
         System.out.println("SubList "+sublt);
         
	}

}
