package com.threading;

public class RunnableDemo implements Runnable{
	
	public void run() {
		System.out.println("Completed by JVM");
	}

	public static void main(String args[]) {
		RunnableDemo rd = new RunnableDemo();
		
		Thread t = new Thread(rd);
		t.start();
		
		Thread tt = Thread.currentThread();
		System.out.println(tt);
		
	}
	
}
