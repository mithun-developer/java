package com.learning;

interface Empploy  {
	
	public abstract void details();

	
}

interface students{
	void total();
	
}


interface worker {
	void names();
	
}

interface labour {
	default void natureOfWork() {
		System.out.println("not required");
	}
	
	 static void area() {
		System.out.println("1000 yards"); // static method - it should be called by interface name
	}
	
}


class Another implements Empploy,students,worker,labour{
	public	 void details(){
		
		System.out.println("Mithun Java Developer");
	}
	
	public void total(){
		System.out.println(100);
	}
	
	public void names() {
		System.out.println("all names");
	}
	
	public void natureOfWork() {
		System.out.println("all types");
	}
	
}


	
	public class Interpace{
 public static void main(String args[]) {
			
	Another an = new Another();
			an.details();
			an.total();
			an.names();
			an.natureOfWork();
			labour.area();
			
			
		
	}
	
		
			
			
		}
	 


