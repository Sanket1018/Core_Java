package com.san.classlock;

public class MainClass {
	public static void main(String[] args) {
		
		ATMThread ATM = new ATMThread();
		ATM.setName("ATM Thread");
		
		GPayThread GpayThread = new GPayThread();
		GpayThread.setName("Gpay Thread");
		
		NetBankingThread NBank = new NetBankingThread();
		NBank.setName("Net Thread");
		
		ATM.start();
		GpayThread.start();
		NBank.start();		
	}

}
