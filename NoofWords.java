package modifiers1;
import java.util.Scanner;
public class NoofWords {
    public int checkwords(String name)
    {
    	int count=0;
    	int n=name.length();
    	for(int i=0;i<n;i++)
    	{
    		 char ch=name.charAt(i);
    	     if((ch==' ') || (name.charAt(0)!=' '&& i==0))
    			count=count+1;
    	     else 
    	       continue;
    	}
    	return count;
    }
	public static void main(String[] args) {
   NoofWords n=new NoofWords();
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Strings");
   String name=s.next();
   s.close();
  int res= n.checkwords(name);
  System.out.println(res);
	}

}
