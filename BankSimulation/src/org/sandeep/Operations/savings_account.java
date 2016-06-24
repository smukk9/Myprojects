package org.sandeep.Operations;

import java.math.BigDecimal;

import org.sandeep.User.User;


public class savings_account implements Transaction_ops {
	
	private User user ;
	
	public savings_account(User user){
		
	 this.user = user;
	}

	@Override
	public void witdrawal(BigDecimal amount) {
		// TODO Auto-generated method stub
		user.setSavings_Amount(user.getSavings_Amount().subtract(amount)); 
		
	}

	@Override
	public void deposite(BigDecimal amount) {
		// TODO Auto-generated method stub
		user.setSavings_Amount(user.getSavings_Amount().add(amount));
	}

	

	
	

	

}
