package modifiers1;
import java.util.Scanner;
public class Stringmiddle {
	public void middle(String name)
	{
		int n=name.length();
		if(n%2==0)
		System.out.println(name.charAt((n/2)-1)+" "+name.charAt((Math.round(n/2))));
		else
			System.out.println(name.charAt(n/2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stringmiddle sm=new Stringmiddle();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter String");
    String name=s.next();
    s.close();
    sm.middle(name);
	}

}
