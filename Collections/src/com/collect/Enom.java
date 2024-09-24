package com.collect;

// We can create enum inside the class or outside the class. 
//Also we can create instance variables, instance methods.
//Enum is used to store group of constants

public class Enom {
	
	
	
	enum Level{
		
	
				LOW(20),
				MEDIUM(30),
				HIGH(40);	
		

					int price;
					
					Level(int p){
						
						price=p;
								
							}		
					
					
					
					
			public int getNumber() {
				return price;
			}
	
	}
	
	public static void main(String args[]) {
		
		//Level lev = Level.LOW;
		// System.out.println(lev);
		
		for (Level l : Level.values()) {
			System.out.println(l.price);
		}
		
		
		
	}

}
