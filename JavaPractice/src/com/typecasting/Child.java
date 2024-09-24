package com.typecasting;

public class Child extends Parent{
	
	public static void main(String args[]) {
		
  //******************Up casting
		//Parent p = new Child();
		
		
		
		

  //*****************Down casting
		Parent p = new Child();
		Child c = (Child) p;
		
		c.display();
		c.show();
		c.print();
		
		
	}
	
	
	 void show() {
			System.out.println("showing from child class"); 
		 }
		  
		  
		  
		  void print() {
				System.out.println("printing from child class"); 
			 }

 
}
