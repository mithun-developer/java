package com.programmes;

public class Remove_Whitespaces {

	public static void main(String[] args) {
		
		String name = "mithun learning      java";
		 name= name.replaceAll("\\s", "");
		System.out.println(name);

	}

}
