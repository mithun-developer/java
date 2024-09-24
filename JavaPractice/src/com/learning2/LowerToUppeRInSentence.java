package com.learning2;

public class LowerToUppeRInSentence {
	
	public static void main(String args[]) {
		String name="mithun is learning java";
		
		
	 char[]a = name.toCharArray();
	 
	 int size=a.length;
	
	 
	 int i=0;
	 while(i !=size) {
		 if(a[i] !=' ') {
			 a[i]=(char) (a[i]-32);
			 
		 }
	 
	 i++;
	 }
	 System.out.println(a);
	 
	}

}
