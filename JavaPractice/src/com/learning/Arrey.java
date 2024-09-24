package com.learning;

public class Arrey {
	
	public static void main(String args[]) {
		
		
		
	/*	int x[]= new int[5];
		
		x[0]=1;
		x[1]=10;
		x[2]=20;
		x[3]=30;
		x[4]=40;
		
		*/
		
		/*
		for(int i=0;i<x.length;i++ ) {
			System.out.println(x[i]);
		}
		*/
		
		
		
		/*int x[]= {1,10,20,30,40};
		for (int a : x) {
			System.out.println(a);
		}
		
		*/
		
		//Multi dimensional array
		
	int marks[][] = {{55,65,75},
			{100,100,100},
			{50,50,50}
			};
	
	for(int i[]:marks) {
		for(int j:i) {
			System.out.print(j+" ");
		}
	System.out.println();
	}
	
	
	String str = new String("Mithun");
	
		String st = "Mithun";
		
		
		StringBuffer sb = new StringBuffer(str); //This is synchronised
	System.out.println(sb.append(" Modali"));
	
	System.out.println(sb.delete(7, 13));
	
	System.out.println(sb.substring(1,	5));
	
	System.out.println(sb.insert(0,"M."));
	
	System.out.println(sb.replace(0, 8, "Modali"));
	
	System.out.println(sb.reverse());
	
	StringBuilder sbb = new StringBuilder(); // This is not synchronised
	
	
		
}
	
}