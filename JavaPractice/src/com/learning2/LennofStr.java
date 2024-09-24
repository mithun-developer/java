package com.learning2;

public class LennofStr {
	
	public static void main(String args[]) {
		String name="mithun";
		name=name.concat("0");
		char a[]=name.toCharArray();
		
		
		int count=0;
		int i=0;
		while(a[i]!='0') {
			
				i++;
				count++;
			
			
		}
		System.out.print(count);
		
	}

}
