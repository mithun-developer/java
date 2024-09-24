package com.learning2;

public class LowerToUppeRRFirstLetterInSentences {
	
	public static void main(String args[]) {
		String name="mithun is learning java";
		
		
	 char[]a = name.toCharArray();
	 
	 int size=a.length;
	 
	 a[0]=(char) (a[0]-32);
	 int i=1;
	 
	 while(i!=size) {
		 if(a[i]==' ') {
			 a[i+1]=(char) (a[i+1]-32);
		 }
	 
	 i++;
	 }
	 System.out.println(a);
	 
	}

}
