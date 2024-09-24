package com.arrays_and_stringbuffer;

public class Buffer {
	
	public static void main(String args[]) {
		
		
		//StringBuffer is synchronised
		
		StringBuffer sb =new StringBuffer("Mithun*****");
		
		System.out.println(sb.append("->java developer"));
		
		System.out.println(sb.deleteCharAt(13));
		
		System.out.println(sb.delete(6, 11));
		
		System.out.println(sb.substring(0, 6));
		
		
	}

}
