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
		if(withdrawAmount > accountBalance)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void deposite(double depositeAmount)
	{
		accountBalance = this.accountBalance + depositeAmount;
		notifyAll();
	}
	
	synchronized public void balanceCheck()
	{
		System.out.println("Balance : "+this.accountBalance);
	}
	
	public void updateProfile() {
		System.out.println("Profile updated");
	}

}
