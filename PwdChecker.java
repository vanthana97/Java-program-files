package stringpkg;
import java.util.Scanner;
public class PwdChecker {
   public boolean isValid(String pwd)
   {
	   boolean res=false;
	   int n=pwd.length();
	   int c=0,c1=0,c2=0;
	   String result="";
	   char arr[]=pwd.toCharArray();
	   if(n>=8)
	   {
		   for(int i=0;i<n;i++)
		   {
			   char ch=pwd.charAt(i);
			   if(Character.isUpperCase(ch))
				   c=c+1;
			   else if(Character.isDigit(ch))
				   c1=c1+1;
			   else if((int)arr[i]>=32 && (int)arr[i]<=47 || (int)arr[i]>=58 && (int)arr[i]<=64 || (int)arr[i]>=91 && (int)arr[i]<=96 || (int)arr[i]>=123 && (int)arr[i]<=126)
				   c2=c2+1;
			   else
				   continue;
		     }
		   if(c>0 && c1>0 && c2>0)
			   res=true;	
		   else if(c==0 && c1==0 && c2==0)
		   {
			   result=result.concat("Should contain 1 uppercase letter,1 digit and 1 special");
			   res=false;
		   }
		   else if(c1==0)
		   {
			   result=result.concat("Should contain 1 digit");
			   res=false;
		   }
		   else if(c2==0)
		   {
			   result=result.concat("Should contain 1 special character ");
			   res=false;
		   }
	   }
	   else
	   {
		   result=result.concat("Entered password should be greater than 8");
		   res=false;
	   }
	   System.out.println(result);
	return res;
   }
	
	public static void main(String[] args) {
     PwdChecker p=new PwdChecker();
     Scanner s=new Scanner(System.in);
     System.out.println("Entered password should be atleast 8 character\nShould contain atleast 1 number\n should contain atleast 1 special character");
     System.out.println("Enter password");
     String pwd=s.next();
     s.close();
     boolean result=p.isValid(pwd);
     if(result)
    	 System.out.println("Is valid");
     else 
    	 System.out.println("Not valid");
     
	}

}
