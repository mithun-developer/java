package com.threading;

public class MultiThreadDemo extends Thread {
	
	String name;
	
	MultiThreadDemo(String name){
		this.name=name;
	}

	
	public void run() {
		for(int i=0;i<=5;i++) {
			
			try {
				Thread.sleep(8000);
			}catch (Exception e) {
				
			}
			System.out.println(name+" : "+i);
		}
		
		
	}
	
	
	
	public static void main(String args[]) throws InterruptedException {
		MultiThreadDemo mt1 = new MultiThreadDemo("Mithun");
		MultiThreadDemo mt2 = new MultiThreadDemo("Anand");
		MultiThreadDemo mt3 = new MultiThreadDemo("Goverdhan");
		MultiThreadDemo mt4 = new MultiThreadDemo("Maruthi");
		MultiThreadDemo mt5 = new MultiThreadDemo("Shiva");
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		Thread t3= new Thread(mt3);
		Thread t4 = new Thread(mt4);
		Thread t5 = new Thread(mt5);
		
		mt1.start();
		mt1.join();
		mt2.start();
		mt2.join();
		mt3.start();
		mt3.join();
		mt4.start();
		mt4.join();
		mt5.start();
		mt5.join();
		
		for(int i=0;i<=5;i++) {
			System.out.println("main:"+i);
		}
		
	}
}
