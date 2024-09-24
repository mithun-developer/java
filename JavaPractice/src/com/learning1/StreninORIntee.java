package com.learning1;

public class StreninORIntee {
	
	public static void main(String args[]) {
		String name="123";
	
		for(int i=0;i<name.length();i++) {

			if(name.charAt(i)>='0' && name.charAt(i)<='9' ||  name.charAt(i)<='-'){
				continue;
				
				
					}else {
						System.out.println("Not Integer");
						System.exit(0);
					}
			
		}
		
		System.out.println("Integer");
			
	}

}
