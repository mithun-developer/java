package com.practice;

public interface ConcreteMethod {
	
	
	public static void main(String args[]) {
		
		ConcreteMethod cd = new Animal();
		cd.addition();
		cd.subtraction();
		
		
		}
	
   abstract    void addition() ;
   
   abstract void subtraction() ;
   
   public static void multiplication() {
	   
   }
	
   
   public static void division() {
	   
   }


}
