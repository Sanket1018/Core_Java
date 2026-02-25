package com.san.threads;


public class ThreadExample extends Thread {
	
	public static void main(String[] args)
	{
		// Creating a thread
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		
		// start the thread
		t1.start();
		t2.start();	
	}
	
	// Create a run method
	@Override
	public void run()
	{
		System.out.println("Hi");
		System.out.println("Hi");
	}
}
