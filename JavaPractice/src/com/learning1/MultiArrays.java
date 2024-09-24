package com.learning1;

public class MultiArrays {
	
	public static void main(String args[]) {
		int num[][]= {{100,200,300},{400,500,600}};
		
		int rowcount = num.length;
		int columncount=num[0].length;
		
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println("************");
		for(int x[]:num) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}

}
