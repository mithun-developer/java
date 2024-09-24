package com.abstraction;

//A class implements multiple interfaces ("Company1","Industry1","Factory1")

public  class Company2 implements Company1,Industry1,Factory1 {
	
	
	// Abstract methods implemented from class - "Company1"
	
	public void carpenter() {
		System.out.println("work with wood and make furniture");
	}
	
	public void mechanic() {
		System.out.println("repairs all vehicles");
	}
	
	public void painter() {
		System.out.println("paints  houses");
	}
	
	public void mason() {
		System.out.println("builds houses");
	}
	
	public void watchman() {
		System.out.println("gaurd and watch houses");
	}
	
	// Abstract methods implemented from class - "Industry1"
	
	public void welder() {
		System.out.println("Does welding work");
		
	}
	
	public void fitter() {
		System.out.println("Does fitting work");
	}
	
	public void plumber() {
		System.out.println("Does plumbing work");
	}
	
	public void labour() {
		System.out.println("Does labour work");
	}
	
	public void electrician() {
		System.out.println("Does electrical work");
	}
	
	
	// Abstract methods implemented from class - "Factory1"
	
	public void biscuit() {
		System.out.println("Works in biscuit factory");
	}
	
	public void chacolate() {
		System.out.println("Works in chacolate factory");
	
	}
	
	public void oil() {
		System.out.println("Works in oil factory");
	}
	
	public void cement() {
		System.out.println("Works in cement factory");
	}
	
	public void rubber() {
		System.out.println("Works in rubber factory");
	}
	
	
	
	
	public static void main(String args) {
		
		Company2 comp = new Company2 ();
		
	}

}
