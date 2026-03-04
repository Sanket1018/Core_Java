package com.san.classlock;

public class HDFCBank {
	
	static double accountBalance=7000;
	
	// Create a user account with some intial account balance
	
	// b. methods
	synchronized static void withdraw(double withdrawAmount)
	{
		accountBalance = accountBalance - withdrawAmount;
	}
	
	static synchronized public void deposite(double depositeAmount)
	{
		accountBalance = accountBalance + depositeAmount;
	}
	
	synchronized static public void balanceCheck()
	{
		System.out.println("Balance : "+accountBalance);
	}
	
	public void updateProfile() {
		System.out.println("Profile updated");
	}

}
