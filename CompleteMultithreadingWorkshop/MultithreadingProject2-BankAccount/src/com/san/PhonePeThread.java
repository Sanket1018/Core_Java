package com.san;

public class PhonePeThread  extends Thread{
	
	private HDFCBank account;
	
	public PhonePeThread(HDFCBank account)
	{
		this.account = account;
	}
	
	public void run()
	{
		account.balanceCheck();
	}

}
