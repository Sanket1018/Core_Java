package com.san;

public class ATMThread extends Thread{
	
	private HDFCBank account;
	// Here we want to create a object to call the withdraw method
	// 2 ways :
	// by creating the HDFCBank account directly
	// or passing the instance of HDFCBank into the this class
	
	public ATMThread(HDFCBank account)
	{
		this.account = account;
		
	}
	
	public void run()
	{
		account.withdraw(4000);
	}
}
