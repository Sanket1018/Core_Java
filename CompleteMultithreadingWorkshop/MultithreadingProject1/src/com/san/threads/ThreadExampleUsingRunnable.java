package com.san.threads;

public class ThreadExampleUsingRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		ThreadExampleUsingRunnable tr = new ThreadExampleUsingRunnable();
		
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(new ThreadExampleUsingRunnable());
		
		t1.start();
		t2.start();
	}

}
