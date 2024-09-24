package com.learning1;

public class Rotationalstring {
	
	public static void main(String args[]) {
		
	/*String name="mithun";
	
	String keystr = "unmith";
	
	String newstr=name.concat(keystr);
	
	 if(newstr.contains(keystr)) {
		 System.out.println("Rotational");
	 }else {
		 System.out.println("NONRotational");
	 }*/
		
		
		//strings are immutable
		
	/*	String a="mithun";
		String b= "modali";
		
		a.concat(b);
		System.out.println(a);
		
		StringBuffer aa = new StringBuffer("mithun");
		StringBuffer bb = new StringBuffer("modali");
		
		aa.append(bb);
		System.out.println(aa);*/
		
		
		
		//swap two strings 
		
		String a="mithun";
		
		String b="modali";
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
				
	
	}

}
