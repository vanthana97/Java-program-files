package modifiers1;

public class Power {
	public static int myPower(int no,int pow)
	{
		int ans = 1;
		for(int i=1;i<=pow;i++)
		{
			ans = ans *no;
			
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double result=myPower(3,3);
        System.out.println(result);
	}

}
