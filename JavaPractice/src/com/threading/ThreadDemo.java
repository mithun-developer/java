package com.threading;

public class ThreadDemo extends Thread{
	
	public void run() {
		System.out.println("From JVM");
	}
	
	public static void main(String args[]) {
		ThreadDemo td = new ThreadDemo();
		
		Thread t = new Thread(td);
		
		t.run();
	}
	
}
