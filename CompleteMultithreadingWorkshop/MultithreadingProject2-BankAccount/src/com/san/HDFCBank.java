package com.san;

public class HDFCBank {
	
	double accountBalance;
	
	// Create a user account with some intial account balance
	
	public HDFCBank(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	
	// b. methods
	synchronized void withdraw(double withdrawAmount)
	{
		accountBalance = this.accountBalance - withdrawAmount;
	}
	
	synchronized public void deposite(double depositeAmount)
	{
		accountBalance = this.accountBalance + depositeAmount;
	}
	
	synchronized public void balanceCheck()
	{
		System.out.println("Balance : "+this.accountBalance);
	}
	
	public void updateProfile() {
		System.out.println("Profile updated");
	}

}
