package stringpkg;

import java.util.Scanner;

public class Palindr {
	public void revstring(String str)
	{
		
		char arr[]=str.toCharArray();
	    String str1="";
		for(int i=arr.length-1;i>=0;i--)
		{ 
	       str1=str1+arr[i];
			
		}
		
		 if(str.equals(str1))
			 System.out.println("Is palindrome");
		 else 
			 System.out.println("Not palindrome");
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Palindr p=new Palindr();
		 Scanner s=new Scanner(System.in);
	       System.out.println("Enter String");
	       String str=s.next();
	       p.revstring(str);
	       s.close();

	}

}
