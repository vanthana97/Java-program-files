package stringpkg;

public class StringEgs {
public static void main(String args[])
{
	StringBuffer sb=new StringBuffer("Chennai");
	sb.append("India");
	String s1="CENNAI";
	s1.concat("India");
	System.out.println("String buffer "+sb);
	System.out.println("String "+s1);
	s1=s1.toLowerCase();
	System.out.println(s1);
     int n=s1.length();
     
     char arr[]=s1.toCharArray();
     s1="";
     for(int i=0;i<n;i++)
     {
    	if((int)arr[i]>=97 && (int)arr[i]<=122)
    		arr[i]=(char)((int)arr[i]-32);
    	    s1=s1+arr[i];
     }
     System.out.println(s1);
}
}
