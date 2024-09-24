package com.threading1;

public class MultiInterface implements Runnable {
	
	public void run() {
		System.out.println("This is by using JVM with Interface");
	}

	public static void main(String args[]) {
		MultiInterface mi = new MultiInterface();
		Thread t = new Thread(mi);
		t.start();
	}
	
}
