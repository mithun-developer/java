package com.encapsulation;

public class Ed2 {
	
	public static void main(String args[]) {
		Ed1 ed1 = new Ed1();
		
		
		System.out.println(ed1.account);
		
		System.out.println("Opening balance is"+" "+ed1.getAmount());
		ed1.setAmount(ed1.getAmount()-400);
		
		System.out.println("Your Account balance is :"+ed1.getAmount());
		
		
	}

}
