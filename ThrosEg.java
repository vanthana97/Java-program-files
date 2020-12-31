package com.interfaces;

public class ThrosEg {
    public void doDivision() throws ArithmeticException
    {
    	int a=12,b=2;
    	if (b==0)
    			throw new ArithmeticException();
    	else 
    		System.out.println(a/b);
    }
	public static void main(String[] args) {
		ThrosEg t=new ThrosEg();
		try
		{
		t.doDivision();
		}		
         catch(ArithmeticException e)
         {
         e.printStackTrace();
         }

	}

}
