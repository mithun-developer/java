package com.learning;


import com.abstraction.Industry1;

public class Anoni {
	
public static void main(String args[]) {
	
		Industry1 ind = new Industry1(){
			public void welder() {
				System.out.println("welding");
			}
			public void fitter() {
				System.out.println("fitting");
			}
			public void plumber() {
				System.out.println("plumbing");
			}
			public void labour() {
				System.out.println("labour");
			}
			public void electrician() {
				System.out.println("electrical");
			}
		};
		
		ind.welder();
		ind.fitter();
		ind.plumber();
		ind.labour();
		ind.electrician();
		
	}
		
	

}
