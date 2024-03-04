package com.atm_code;

import java.util.Random;

public class OTPClass {

	public static char[] otp() {
		
		int length = 6;
		
		String numbers = "ABCD0123456efgh";
		
		Random random=new Random();
		char otp[] =new char[length];
		
		for(int i=0;i<otp.length;i++){
			
		otp[i]=numbers.charAt(random.nextInt(numbers.length()));
			
		}
		return otp;

	}
	public static void main(String[] args) {
		System.out.println(otp());
			}
	
}
