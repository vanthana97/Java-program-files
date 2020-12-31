package com.interfaces;

import java.util.Scanner;

public class OTPMain {
	public boolean CheckOTP(int otp,int genOTP) throws InvalidOTPException
	{
		
		if(otp==genOTP)
			return true;
			
		else
			throw new InvalidOTPException("Invalid otp");
				
	}

	public static void main(String[] args) {
		OTPMain o=new OTPMain();
		Scanner s=new Scanner(System.in);
		int genOTP=(int)(Math.random()*(9999-1000)+1000);
		System.out.println("OTP "+genOTP);
		for(int i=1;i<=3;i++)
        {
        	System.out.println("Enter OTP");
    		int otp=s.nextInt();	
        	try {
				if(o.CheckOTP(otp,genOTP))
				{
					System.out.println("OTP is Correct");
					break;
				}
				else 				
					continue;			
			} catch (InvalidOTPException e) {
				 System.out.println("Invalid OTP");
			}     
        	   
        
        }
        
        s.close();
        
	}

}
