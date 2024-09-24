package com.learning;


abstract class Emp {
	abstract void display();
	void commute() {
		System.out.println("office transport");
	}
	
	
	

}


class Company extends Emp{
	
	void display() {
		System.out.println("Wellsfargo");
	}

}


 
 public class Abst {

		public static void main(String args[]) {


			  Company c = new Company();
			  c.display();
			  c.commute();
			  
			  
	}
		
 }