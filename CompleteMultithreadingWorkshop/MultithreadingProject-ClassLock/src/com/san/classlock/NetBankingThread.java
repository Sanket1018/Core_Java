package com.san.classlock;

public class NetBankingThread extends Thread {
	
	public void run()
	{
		HDFCBank.balanceCheck();
	}
}
