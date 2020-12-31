package com.basics;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c=0,a,n=1;
       int dn=n;
       while(n>0)
       {
    	   a=n%10;
    	   n=n/10;
    	   c=c+(a*a*a);
       }
       if (dn==c)
       
    	   System.out.println("Armstrong number");
       
       else
    	   System.out.println("Not Armstrong");
    
	int no=7;
	boolean prime=false;
	for(int i=2;i<=no/2;++i)
	{
		if(no%i==0)
		{
			prime=false;
			break;
		}
		else
			prime=true;
		
	}
	
	if(prime)
		System.out.println(no+" Is Prime");
	else
		System.out.println(no+" Is Not a Prime");
		
	}

}
