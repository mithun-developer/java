package com.learning1;

public class Whitespacerem {
	
	public static void main(String args[]) {
		String name="mithun is 		learing java";
		/*char[]a=name.toCharArray();
		for(int i=0;i<a.length;i++) {
			if((a[i]!=' ')&& (a[i]!='\t'))  {
				System.out.print(a[i]);
				
			}
		}*/
		
		name=name.replaceAll("\\s", "");
		System.out.println(name);
		
	}

}
