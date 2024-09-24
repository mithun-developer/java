package com.learning2;

public class StriiengRev {
	public static void main(String args[]) {
		String name="mithun is good";
		
	char[]a = name.toCharArray();
	int size=a.length;
	
	/*char[]b=new char[size];
	
	int i=0;
	
	while(i !=size) {
		b[size-1-i]=a[i];
		i++;
	}
	
	System.out.println(b);
	*/
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		
	
	
}

}
