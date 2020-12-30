package com.emp;

import java.util.ArrayList;

public class CompArrl {

	public static void main(String[] args) {
		 ArrayList<String> color = new ArrayList<String>();
         color.add("green");color.add("blue");color.add("orange");color.add("red");color.add("white");
         ArrayList<String> color1 = new ArrayList<String>();
         color1.add("green");color1.add("blue");color1.add("yellow");color1.add("pink");color1.add("white");
         
         String res=color.equals(color1)?"Equal":"Not equal";
         System.out.println(res);
         color1.removeAll(color);
         System.out.println("Uncommmon elements that are in second list"+color1);
        // color.retainAll(color1);
         //System.out.println("Elements that are in second list"+color);
	}

}
