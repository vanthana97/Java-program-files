package stringpkg;

import java.util.Scanner;

public class ReverseStr {

	public void revstring(String str)
	{
		
		char arr[]=str.toCharArray();
		str="";
		for(int i=arr.length-1;i>=0;i--)
		{ 
	       str=str+arr[i];
			
		}
		
		System.out.println(str);
	}
	public static void main(String[] args) {
		 ReverseStr r=new ReverseStr();
		 Scanner s=new Scanner(System.in);
	       System.out.println("Enter String");
	       String str=s.next();
	       r.revstring(str);
	      s.close();
	}

}
