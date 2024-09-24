package com.learning2;

public class LowerToUpperr {
	
	public static void main(String args[]) {
		String name="mithun";
		name=name.replace(" ", "");
		name=name.toLowerCase();
	 char[]a = name.toCharArray();
	 
	 int size=a.length;
	 
	 int i=0;
	 while(i !=size) {
		 a[i]=(char) (a[i]-32);
	 i++;
	 }
	 
	 System.out.println(a);
	}
	
	boolean test() {
		boolean status=true;
		try {
			
		}catch(Exception e) {
			
		}
		return status;
	}

}
