package com.arrays_and_stringbuffer;

public class AddingSingleArrayInDifferloopss {
	static double res;
	public static void main(String args[]) {
		
		double num[]= {10.3,20.4,30.5,40.6,50};
		
		// Addition using for loop
		
		/*for(int i=0;i<num.length;i++) {
			res=res+num[i];
			
		}
		System.out.println(res);
		
		*/
		
		// Addition using while loop
		
		/*int i=0;
		while(i<num.length) {
			res=res+num[i];
			i++;
		}
		
		System.out.println(res);
		*/
		
		
		// Addition using do-while loop
		
		/*int i=0;
		do{
			res=res+num[i];
			i++;
		}while(i<num.length);
		
		
			System.out.println(res);
		*/
		
		// Addition using for-each loop
		
		for(double i:num) {
			res=res+i;
		}
		System.out.println(res);
	}

}
