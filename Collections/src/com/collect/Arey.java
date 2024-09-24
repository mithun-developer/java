package com.collect;

public class Arey  {
	
	
	public static void main(String args[]) {
		
		// one way of creating an array and assigning values based on index
		int x[] = new int[5];
		x[0]=125;
		x[1]=150;
		x[2]=175;
		x[3]=200;
		x[4]=225;
	
		
		for(int i:x) {
			System.out.println(i);
		}
		
		
	System.out.println("**********************************");	
		//second way of of creating an array
		
		int y[]= {100,200,300,400,500};
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}
	}

}
