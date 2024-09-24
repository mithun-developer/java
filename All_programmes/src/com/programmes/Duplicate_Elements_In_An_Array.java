package com.programmes;

import java.util.HashSet;

public class Duplicate_Elements_In_An_Array {

	public static void main(String[] args) {
		
		
		String[] abc = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		
		HashSet set = new HashSet();
		
		
		for(String st:abc) {
			
			if(!set.add(st)) {
				System.out.println(st);
			}
		
			
		}

	}

}
