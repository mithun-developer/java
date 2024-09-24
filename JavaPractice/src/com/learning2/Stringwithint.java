package com.learning2;

public class Stringwithint {
	
	public static void main(String args[]) {
		String name="435ffff";
		
    // char[]a = name.toCharArray();
    
     int i=0;
     
     while(i !=name.length()) {
    	 if(name.charAt(i)>'0'&& name.charAt(i)<'9' || name.charAt(i)=='-' ) {
    		i++;
    	 }else {
    		 System.out.println("String");
    		 System.exit(0);
    	 }
    
     i++;
     }
     System.out.println("Integer");
	}

}
