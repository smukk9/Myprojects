package org.sandeep.User;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class User {
	
	 private BigDecimal checking_Amount;
	 private BigDecimal savings_Amount;
	 private BigDecimal interest_Amount;
	 private BigDecimal checking_Fee;
	 private int ccount_withdrawal;
	 private int scount_withdrawal;
	 private int ccount_deposite;
	 private int scount_deposite;

	 public User(){
		 
		checking_Amount = new BigDecimal("1000.00");
		 savings_Amount = new BigDecimal("1000.00");
		 interest_Amount = new BigDecimal("0.00");
		 checking_Fee = new BigDecimal("1.00");	
		 ccount_withdrawal =0;
		 scount_withdrawal=0;
		 ccount_deposite=0;
		 scount_deposite=0;
		 
		 
	 }

	public int getCcount_deposite() {
		return ccount_deposite;
	}

	public int getScount_deposite() {
		return scount_deposite;
	}

	public int getscount_withdrawal() {
		return scount_withdrawal;
	}

	public int getccount_withdrawal() {
		return ccount_withdrawal;
	}

	public void increment_cwithdrawal() {
		this.ccount_withdrawal++;
	}
	public void increment_swithdrawal() {
		this.scount_withdrawal++;
	}
	
	public void increment_sdeposite(){
		
		this.scount_deposite++;
	}
	
	public void increment_cdeposite(){
		
		this.ccount_deposite++;
	}

	public BigDecimal getInterest_Amount() {
		return interest_Amount;
	}

	public void setInterest_Amount(BigDecimal interest_Amount) {
		this.interest_Amount = interest_Amount;
	}

	public BigDecimal getChecking_Fee() {
		return checking_Fee;
	}

	public void setChecking_Fee(BigDecimal checking_Fee) {
		this.checking_Fee = checking_Fee;
	}

	public BigDecimal getChecking_Amount() {
		return checking_Amount;
	}

	public void setChecking_Amount(BigDecimal checking_Amount) {
		this.checking_Amount = checking_Amount;
	}

	public BigDecimal getSavings_Amount() {
		return savings_Amount;
	}

	public void setSavings_Amount(BigDecimal savings_Amount) {
		this.savings_Amount = savings_Amount;
	}
	
	public void display_amount(){
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("Checking: $"+df.format(this.getChecking_Amount()));
		System.out.println("Savings: $"+df.format(this.getSavings_Amount()));
		
	}


}
