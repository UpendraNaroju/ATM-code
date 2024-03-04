package com.atm_code;

import java.util.Scanner;

public class ATM{
	

	public static void main(String[] args) {
          
		 String holderName="Katamoni Mani";
		long mobileNumber=6281254210L;
		String panCard="CONPC64941N";
		 int mpinNum=9640;

	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your pin number");
		int pinNum=scanner.nextInt();
		 if(mpinNum==pinNum){
			 System.out.println("enter your mobile number");
			 long mobileNum=scanner.nextLong();
			 
			 String otpNum=new String(OTPClass.otp());
			 
			 System.out.println(otpNum);
			 System.out.println("enter the OTP");
			 String conformOTP=scanner.next();
			 
			 //otp validation
			 
			 if(otpNum.equals(conformOTP)){
				 
				 System.err.println("**********************************");
				 System.out.println(holderName+ " welcome to *Union_Bank*");
				 System.err.println("********************************");
				 System.out.println("1.SavingAccount");
				 System.out.println("2.LoanAccount");
				 System.out.println("select your account type");
				 
				 int accountType=scanner.nextInt();
				 
 switch (accountType){
 
		case 1:{
					System.err.println("********************");
					
					System.out.println("1.Withdraw");
					System.out.println("2.Deposite");
					System.out.println("3.BalanceEnquiry");
					
					System.out.println("----------------------------");
					
					System.out.println("enter your choice");
					int choice=scanner.nextInt();
					
					SavingAccount savingAccount=new SavingAccount();
				    switch(choice){
					case 1:
					{
						System.out.println("enter the ammount");
						double amount=scanner.nextDouble();
						savingAccount.withdarw(amount);
					}
						break;
						
					case 2:
					{
						System.out.println("enter the ammount");
						double amount=scanner.nextDouble();
						savingAccount.deposite(amount);
					}
  					  break;
  					  
					case 3:
					  {
						savingAccount.balanceEnquiry();
					   } 
					break;
					   
					   default:System.err.println("your choosen wrong choice");
					}
		}break;	
		//loan Account
		case 2:{

			System.out.println("********************");
			
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.BalanceEnquiry");
			
			System.out.println("----------------------------");
			
			System.out.println("enter your choice");
			int choice=scanner.nextInt();
			
			LoanAccount loanAccount=new LoanAccount();
		    switch(choice){
			case 1:
			{
				System.out.println("enter the ammount");
				double amount=scanner.nextDouble();
				loanAccount.withdarw(amount);
			}
				break;
				
			case 2:
			{
				System.out.println("enter the ammount");
				double amount=scanner.nextDouble();
				loanAccount.deposite(amount);
			}
				  break;
				  
			case 3:
			  {
				loanAccount.balanceEnquiry();
			   } 
			break;
			   
			   default:System.err.println("your choosen wrong AccountType");
			}
			
			
		}
		 default:System.err.println("your choosen wrong AccountType");
			
	}
		
		
			}else {
				System.err.println("You enter wrong OTP Number");
			}
					
				
				 
			 
			 
		 }else {
			 System.err.println("Invalid pinNumber");
		 }

	}

}
