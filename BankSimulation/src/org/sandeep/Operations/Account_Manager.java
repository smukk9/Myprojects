package org.sandeep.Operations;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.sandeep.User.User;

public class Account_Manager implements Surcharge{

	private BigDecimal INTEREST_CHARGE = new BigDecimal("0.01");
	private BigDecimal Time_InMonths = new BigDecimal("1");
	private BigDecimal Interest;
	
	@Override
	public void add_fee(User user) {
		// TODO Auto-generated method stub
		
		if(user.getccount_withdrawal()>0 ){
			
			user.setChecking_Amount(user.getChecking_Amount().subtract(user.getChecking_Fee()));
		}
		
		if(user.getscount_withdrawal()>0){
			
			 user.setSavings_Amount(user.getSavings_Amount().subtract(user.getChecking_Fee()));
		}
		
	}

	@Override
	public void add_interest(User user) {
		// TODO Auto-generated method stub
		/*
		 * calculating interest using I = PTR
		 */
		
		if(user.getScount_deposite()>0){
			Interest = user.getSavings_Amount().multiply(INTEREST_CHARGE).multiply(Time_InMonths);
			System.out.println(Interest);
			user.setInterest_Amount(Interest);
			user.setSavings_Amount(user.getSavings_Amount().add(user.getInterest_Amount()));
			
		}
		
		
	}
	
	public void account_Stats(User user){
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking Fee: $"+df.format(user.getChecking_Fee()));
		System.out.println("Savings interest payment: $"+df.format(user.getInterest_Amount()));
		System.out.println("\n\nFinal Balances");
		System.out.println("Checking: $"+df.format(user.getChecking_Amount()));
		System.out.println("Savings: $"+df.format(user.getSavings_Amount()));
		
		
	}

}
