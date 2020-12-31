package modifiers1;
import java.util.Scanner;
public class NoofVowels {
	public int isvowel(String name)
	{
		int n=name.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
				count=count+1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoofVowels nv=new NoofVowels();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the name ");
     String name=s.next();
     s.close();
     System.out.println("Number of vowels "+nv.isvowel(name));
	}

}
