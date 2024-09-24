package com.learning;

public class StringReverse {
	
	public static void main(String args[]) {
		
		
		// Method 1
		String str = "Mithun";
		
		char a [] =str.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			
		//	System.out.print(a[i]);
			
			
			//Method 2
			
			/*char c = str.charAt(i);
			System.out.print(c);*/
			
		}
		
		//Method 3 
		
		/*StringBuilder sb = new StringBuilder("Mithun");
		System.out.println(sb.reverse());
		*/
		
	
	}

}
