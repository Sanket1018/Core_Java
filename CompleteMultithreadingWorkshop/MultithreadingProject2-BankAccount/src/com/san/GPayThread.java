package com.san;

public class GPayThread extends Thread{
	
	private HDFCBank account;
	
	public GPayThread(HDFCBank account)
	{
		this.account = account;
	}
	
	public void run()
	{
		account.deposite(20000);
		System.out.println("Depositing");
	}
}
