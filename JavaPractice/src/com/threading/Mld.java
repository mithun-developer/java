package com.threading;

public class Mld extends Thread{
	
	String name;
	
	Mld(String name){
		this.name=name;
		
	}
	
	public void run() {
  for(int i=0;i<5;i++) {
			System.out.println(name+""+i);
		}
	}
	public static void main(String args[]) {
		Mld m1 = new Mld("Mithun");
		Mld m2 = new Mld("Anand");
		Mld m3 = new Mld("Goverdhan");
		Mld m4 = new Mld("Maruthi");
		Mld m5 = new Mld("Shiva");
		
		Thread t1 =new Thread(m1);
		Thread t2 =new Thread(m2);
		Thread t3 =new Thread(m3);
		Thread t4 =new Thread(m4);
		Thread t5 =new Thread(m5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main :"+i);
		}
		
		
	}
	
}
