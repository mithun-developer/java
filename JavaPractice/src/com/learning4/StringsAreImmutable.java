package com.learning4;

public class StringsAreImmutable {
	
	public static void main(String args[]) {
		
		
		// Strings Are Immutable
		String a="mithun";
		String b="modali";
		a.concat(b);
		
		System.out.println(a);
		
		
		
		
		// Strings are mutable when we use StringBuffer or StringBuilder
		
		StringBuffer sb= new StringBuffer(a);
		sb.append(b);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
