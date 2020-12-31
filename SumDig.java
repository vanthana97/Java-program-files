package modifiers1;

public class SumDig {
    public static int SumOfDigits(int num)
    {
    	int sum=0;
        while(num>0)
        {
        	sum=sum+num%10;
        	num=num/10;
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int result=SumOfDigits(455);
       System.out.println(result);
	}

}
