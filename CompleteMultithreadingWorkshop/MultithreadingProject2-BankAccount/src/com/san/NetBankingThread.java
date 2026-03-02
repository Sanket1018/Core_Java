package com.san;

public class NetBankingThread extends Thread {
	
	private HDFCBank account;
	
	
	public NetBankingThread(HDFCBank account)
	{
		this.account = account;
	}
	
	public void run()
	{
		account.updateProfile();
	}
}
