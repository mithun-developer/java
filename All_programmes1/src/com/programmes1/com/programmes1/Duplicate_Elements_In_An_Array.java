package com.programmes1;

import java.util.HashSet;

public class Duplicate_Elements_In_An_Array {

	public static void main(String[] args) {
		
		String[] abc = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		
		
		HashSet set = new HashSet();
		
		for(String s:abc) {
			if(! set.add(s)) {
				System.out.println(s);
				
			}
			
		}
	
		
		

	}

}
