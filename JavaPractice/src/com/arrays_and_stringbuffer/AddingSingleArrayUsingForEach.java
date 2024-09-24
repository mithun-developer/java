package com.arrays_and_stringbuffer;

public class AddingSingleArrayUsingForEach {
	
	public static void main(String args[]) {
		
		int num[]= {10,20,30,40,50};
		
		int res=0;
		
		
		
		/*for(int i=0;i<num.length;i++) {
			res=res+num[i];
		}*/
		
		/*int i=0;
		while(i<num.length) {
			res=res+num[i];
			i++;
		}*/
		
		

		for(  int i    :num) {
			res=res+i;
		}
	
	System.out.println(res);
	
	}

}
