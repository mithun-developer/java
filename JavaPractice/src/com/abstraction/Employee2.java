package com.abstraction;


// Child class extends to Abstract class ("Employee1") and override the methods used in Abstract class

public class Employee2 extends Employee1 {
	
	void doctor() {
		System.out.println("Treats the patients");
	}
	
	void lawyer() {
		System.out.println("practices law and speak for his clients in court");
	}
	
	void engineer() {
		System.out.println("constructs houses");
	}
	
	void cricketer() {
		System.out.println("plays cricket");
	}
	
	void actor() {
		System.out.println("acts on stage and entertain people");
	}
	
	
	public static void main(String args[]) {
		
		Employee2 emp = new Employee2();
		
		
		emp.doctor();
		emp.lawyer();
		emp.engineer();
		emp.cricketer();
		emp.actor();
		
		
		
	}

}
