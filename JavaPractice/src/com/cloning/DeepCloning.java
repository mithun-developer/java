package com.cloning;


public class DeepCloning implements Cloneable {
	
	int num;
	String name;
	 
	DeepCloning(int num,String name){
		this.num=num;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	   public static void main(String args[]) {
		   
		  try {
			  DeepCloning dc1 = new DeepCloning(1,"Mithun") ;
			  DeepCloning dc2 = (DeepCloning) dc1.clone();
			  dc1.name="Modali";
			  
			  System.out.println(dc1.num+" "+dc1.name);
			  System.out.println(dc2.num+" "+dc2.name);
			  
			  
			  
		  }catch(Exception e) {
			  
		  }
	   }
}



