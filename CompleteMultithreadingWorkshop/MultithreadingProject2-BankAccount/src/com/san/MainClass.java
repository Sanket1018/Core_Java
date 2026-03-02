package com.san;

public class MainClass {
	public static void main(String[] args) {
		
		//creating the real user
		HDFCBank sanAccount = new HDFCBank(7000);
		
		ATMThread ATM = new ATMThread(sanAccount);
		ATM.setName("ATM Thread");
		
		GPayThread GooglePay = new GPayThread(sanAccount);
		GooglePay.setName("GooglePay Thread");
		
		PhonePeThread PhonePay = new PhonePeThread(sanAccount);
		PhonePay.setName("PhonePe Thread");
		
		NetBankingThread netBanking = new NetBankingThread(sanAccount);
		netBanking.setName("Netbanking thread");
		
		ATM.start();
		GooglePay.start();
		PhonePay.start();
		netBanking.start();
		
		System.out.println();
	}

}
