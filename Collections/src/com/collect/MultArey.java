package com.collect;

public class MultArey {

	public static void main(String args[]) {
		int x[][] = new int[2][2];
		x[0][0]=250;
		x[0][1]=500;
		x[1][0]=750;
		x[1][1]=1000;
		
		for(int i[]:x) {
			for(int j:i) {
				System.out.print(j+" ");
		
			}
		System.out.println();
		}
		
		System.out.println("***********************");
		
		int y[][]= {{100,200,300},{500,600,700},{800,900,1000},{1200,1500,1800}};
		
		//using for each loop
		
		/*for(int a[]:y) {
			for(int b:a) {
				System.out.print(b+" ");
			}
		
		System.out.println();
		}*/
		
		
//	System.out.println(y[3][2]);
		
		// using for loop
	
	for(int i=0;i<y.length;i++) {
		for(int j=0;j<y[1].length;j++) {
			System.out.print(y[i][j]+" ");
		}
	System.out.println();
	}
		
		
	}
	
}
