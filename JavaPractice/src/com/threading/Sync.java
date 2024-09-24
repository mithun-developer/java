package com.threading;

public class Sync extends Thread {
	
	int count;
	
	public synchronized void run() {
		
		for (int i=1;i<=10000;i++) {
			count++;
		}
		
		
	}

	
	public static void main(String args[]) throws InterruptedException {
		Sync s = new Sync();
		
		
		//Two threads are associated with same object - s
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		//t1.setName("My");
		t1.setPriority(1);
		System.out.println(t1.getName());
		
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(s.count);
		System.out.println("Priority"+"-"+t1.getPriority());
		t2.setDaemon(true);
		System.out.println(t2.isDaemon());
		
	}
}

