package org.sandeep.mainapp;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.sandeep.Operations.Account_Manager;
import org.sandeep.Operations.Transaction_ops;
import org.sandeep.Operations.checking_account;
import org.sandeep.Operations.savings_account;
import org.sandeep.User.User;

public class Bank {

	public static boolean isvalid_Amount(String input){


		Pattern pat = Pattern.compile("\\d+(\\.\\d{1,2})?|\\.\\d{1,2}");
		Matcher m = pat.matcher(input);
		return m.matches();
	}

	/*
	 * checking if the amount entered is more than the aviable balance
	 */
	public static boolean isChecking_valid(User user, BigDecimal value){

		if(user.getChecking_Amount().compareTo(value)>0){

			return true;
		}

		return false;
	}

	public static boolean isSavings_valid(User user, BigDecimal value){

		if(user.getSavings_Amount().compareTo(value)>0){

			return true;
		}

		return false;
	}
	
	/*
	 * checking if checking account is zero
	 */
	private static boolean isBalance_Null(User us) {
		// TODO Auto-generated method stub
		
		if(us.getChecking_Amount().compareTo(BigDecimal.ZERO)>0){
			 return false;
		}
		return true;
	}

	public static void main(String args[]){
		boolean run  = true;
		User us = new User();
		Scanner sc = new Scanner (System.in);

		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("Welcome to the Account Applicaiton \n");
		System.out.println("Starting values");
		us.display_amount();
		System.out.println("\nEnter the transaction for the month");
		while(run){
			boolean ops_check = false;
			while(!ops_check){
				System.out.print("\nWithdrawal or Deposit? (w/d):");
				String ops_choice = sc.nextLine();
				if(ops_choice.equals("w")|| ops_choice.equals("d")){
					ops_check = true;
					boolean acc_check = false;

					while (!acc_check){

						System.out.print("Checking or Savings? (c/s):");
						String acc_choice = sc.nextLine();

						if(acc_choice.equals("c") || acc_choice.equals("s")){
							acc_check = true;
							boolean amount_check = false;
							while(!amount_check){
								System.out.print("Amount?:");
								String amount = sc.nextLine();
								if(isvalid_Amount(amount)){
									amount_check = true;
									String final_ops = ops_choice + acc_choice;
									BigDecimal input_Amount = new BigDecimal(amount);

									switch(final_ops){

									case "wc" : Transaction_ops wc = new checking_account(us);
												if(isChecking_valid(us, input_Amount)){

													wc.witdrawal(input_Amount);
													us.increment_cwithdrawal();
													
										
												}else{
													System.out.println("Checking:"+df.format(us.getChecking_Amount()));
													System.out.println("you have low balance, cannot withdraw");
												}
												break;
									case "ws" :	Transaction_ops ws = new savings_account(us);
												if(isSavings_valid(us, input_Amount)){

													ws.witdrawal(input_Amount);
													us.increment_swithdrawal();
										
												}else{
													System.out.println("Savaings: $"+df.format(us.getChecking_Amount()));
													System.out.println("you have low balance, cannot withdraw");

												}

												break;
									case "dc" :	Transaction_ops dc = new checking_account(us);
												dc.deposite(input_Amount);
												us.increment_cdeposite();

												break;
									
									case "ds" :	Transaction_ops ds = new savings_account(us);
												ds.deposite(input_Amount);
												us.increment_sdeposite();
												break;
									}

									System.out.print("\nContinue? (y/n):");
									String option = sc.nextLine();
									if(option.equals("n")){
										
										Account_Manager am = new Account_Manager();
										if(!isBalance_Null(us)){
											
											am.add_fee(us);
											am.add_interest(us);
											am.account_Stats(us);
											run =false;
											
										}
											
									}
								}else{
									System.out.println("Wrong Imput");
									System.out.println("suggesstion ");
									System.out.println("*please enter amount as $ or $\\.$$ for example \n 100, 100.00, 100.30, 100.3 are valid \n");
									acc_check = false;

								}

							}

						}else{
							System.out.println("\nWrong Imput");
							System.out.println("suggesstion ");
							System.out.println("*please enter either c->checking account or  s->savings account\n");


						}

					}
				}
				else{

					System.out.println("\nWrong Imput");
					System.out.println("suggesstion ");
					System.out.println("*please enter either w->withdrawal  or  d->Deposit\n");

				}
			}
		}


		sc.close();
	}


}






