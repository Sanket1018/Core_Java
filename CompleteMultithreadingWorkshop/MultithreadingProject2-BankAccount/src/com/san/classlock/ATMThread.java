package com.san.classlock;

public class ATMThread extends Thread{
	
	public void run()
	{
		HDFCBank.withdraw(10000);
	}
}
