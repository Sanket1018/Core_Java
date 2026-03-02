package com.san.threads;

public class ThreadThirdExample extends Thread{
	
	public static void main(String[] args) {
		
		ThreadThirdExample t1 = new ThreadThirdExample();
		ThreadThirdExample t2 = new ThreadThirdExample();
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		
		t1.start();
		t2.start();
	}
	
	public void run()
	{
		System.out.println("Inside the run method");
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}

}
