package com.atm_code;

import java.time.LocalDate;
import java.time.LocalTime;


public class SavingAccount implements Account {

	 final long account_Number = 565657865676L;
	double totalBalance = 4500;

	@Override
	public void withdarw(double amount) {
		String action = "DEBITED";

		if (totalBalance >= amount) {
			totalBalance = totalBalance - amount;
			displayMassege(action, amount);

		} else {

			System.err.println("insufficient Fund");

		}

	}

	@Override
	public void deposite(double ammount) {
		String action = "CREDITED";
		if (ammount <= 100000) {
			totalBalance = totalBalance + ammount;
			
			displayMassege(action, ammount);

		}else{
			System.err.println(" Your Exceeeding the Limit");
		}

	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Total_Balance is :" + totalBalance);

	}

	@Override
	public void displayMassege(String action, double ammount){
		
		LocalDate localDate = LocalDate.now(); // Current Date
		LocalTime localTime = LocalTime.now();// current time

		System.out.println("A/C *5676 " + action + " for RS: " + ammount + " on " + localDate + " at " + localTime);
		System.out.println("IST Avl Balance: Rs." + totalBalance + ". if not you,call 18002222243 -Union Bank of India ");
	}

}
