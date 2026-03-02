package com.san.threads;


public class ThreadExample extends Thread {
	
	ThreadExample(String str)
	{
		super(str);
	}
	
	
	public static void main(String[] args)
	{
	    
		
		// Creating a thread
		ThreadExample t1 = new ThreadExample("First Thread");
		ThreadExample t2 = new ThreadExample("Second Thread");
		
		t1.setName("ABC");
		t2.setName("DEF");
		
		// start the thread
		t1.start(); // It creates the independent path of the execution
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
