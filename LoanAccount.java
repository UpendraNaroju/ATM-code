package com.atm_code;

import java.time.LocalDate;
import java.time.LocalTime;

public class LoanAccount implements Account {
	final static long account_Number = 784656789201L;

	double totalBalance = 100000;
	double target_ammount = 500000;

	@Override
	public void withdarw(double amount) {
		String action = "CREDITED";
		if (totalBalance+ amount <= target_ammount) {
			totalBalance= totalBalance + amount;
			displayMassege(action, amount);

		} else {

			System.out.println("Your Exceeding your Target...check your target amount");
		}

	}

	@Override
	public void deposite(double amount) {
		String action = "DEBITED";
		if (totalBalance + amount >= target_ammount) {
			totalBalance= totalBalance + amount;
			displayMassege(action, amount);

		} else {
			System.out.println("Your Exceeding your.....Limit");
		}

	}

	@Override
	public void balanceEnquiry() {

	 System.out.println("Total_Balance is :"+totalBalance);

	}

	@Override
	public void displayMassege(String action, double ammount) {

		LocalDate localDate = LocalDate.now(); // Current Date
		LocalTime localTime = LocalTime.now(); // current time

		System.out.println(" Your Loan A/C *9201" + action + " for RS: " + ammount + " on " + localDate + " at " + localTime);
		System.out
				.println("IST Avl Balance: Rs." + totalBalance + ". if not you,call 18002222243 -Union Bank of India ");
	}

}
