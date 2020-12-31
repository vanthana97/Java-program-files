package modifiers1;
import java.util.Scanner;
public class Pwdchk {
	public boolean passCheck(String pwd)
	{
		boolean res=false;
		int n=pwd.length();
		int c=0;
		if(n>=10)
		{
		   for(int i=0;i<n;i++)
		   {
			char ch=pwd.charAt(i);
			if(Character.isDigit(ch)==true)
				c=c+1;
		    }
			if(c>=2)
			{
				if(isletter(pwd))
					res=true;
				else
					System.out.println("should contain letters");
			}
			else
				System.out.println("should contain atleast 2 digits");
			
		}
		else
			System.out.println("length should be atleast 10");
			return res;
	}
	public boolean isletter(String pwd)
	{
		boolean result=false;
		for(int i=0;i<pwd.length();i++)
		{
			char ch=pwd.charAt(i);
			if(Character.isLetter(ch)==true)
				result=true;
			
		}
		return result;
	}

	public static void main(String[] args) {
		Pwdchk p=new Pwdchk();
		Scanner s=new Scanner(System.in);
		System.out.println("Password should atleast 8 characters");
		System.out.println("Password should contain  letters and digits");
		System.out.println("Password should contain atleast 2 digits");
		System.out.println("Enter password");
		String pwd=s.next();
		s.close();
		boolean res=p.passCheck(pwd);
		if(res==true)
			System.out.print("Entered password is valid");
		
		
			

	}

}
