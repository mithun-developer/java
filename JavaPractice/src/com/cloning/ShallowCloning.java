package com.cloning;


public class ShallowCloning {
	
	int num;
	String name;
	
	ShallowCloning(int num,String name){
		this.num=num;
		this.name=name;
	}
	
	
	
	   public static void main(String args[]) {
		   
		   ShallowCloning sc1 = new ShallowCloning(1,"Mithun");
		   ShallowCloning  sc2  =  sc1;
		   sc1.name="Modali";
		   
	     System.out.println(sc1.num+" "+sc1.name);
		   System.out.println(sc2.num+" "+sc2.name);
	   }
}
