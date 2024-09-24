package com.threading1;

public class Multi extends Thread{
	
	public void run() {
		System.out.println("Using JVM");
	}

	public static void main(String args[]) {
		Multi m = new Multi();
		Thread t = new Thread(m);
		
		t.start();
		
		
		
	}
	
}
