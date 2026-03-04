package com.san.classlock;

public class GPayThread extends Thread{

	
	public void run()
	{
		HDFCBank.deposite(5000);
	}
}
