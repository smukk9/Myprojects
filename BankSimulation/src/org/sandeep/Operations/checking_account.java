package org.sandeep.Operations;

import java.math.BigDecimal;

import org.sandeep.User.User;

public class checking_account implements Transaction_ops{
	private User user;
	public checking_account(User us) {
		// TODO Auto-generated constructor stub
		this.user =us;
	}
	@Override
	public void witdrawal(BigDecimal amount) {
		// TODO Auto-generated method stub
		user.setChecking_Amount(user.getChecking_Amount().subtract(amount));
		
	}
	@Override
	public void deposite(BigDecimal amount) {
		// TODO Auto-generated method stub
		user.setChecking_Amount(user.getChecking_Amount().add(amount));
		
	}
	


	



}
