package com.threading1;

public class MultiThreads extends Thread{
	
	String name;
	
	MultiThreads(String name){
		this.name=name;
		
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+" "+i);
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		MultiThreads ml1 = new MultiThreads("Mithun");
		MultiThreads ml2 = new MultiThreads("Anand");
		MultiThreads ml3 = new MultiThreads("Goverdhan");
		MultiThreads ml4 = new MultiThreads("Maruthi");
		MultiThreads ml5 = new MultiThreads("Shiva");
		
		
		
		Thread t1 = new Thread(ml1);
		Thread t2 = new Thread(ml2);
		Thread t3 = new Thread(ml3);
		Thread t4 = new Thread(ml4);
		Thread t5 = new Thread(ml5);
		
		t1.start();
		t1.join();
		Thread.sleep(5000);
		t4.start();
		t3.start();
		
		System.out.println("main");
		
	}

}
