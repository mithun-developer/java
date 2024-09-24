package com.learning1;

public class MultiArraysSumm {

	static int sum;
	
	
	public static void main(String args[]) {
		int num[][]= {{100,200},{400,800}};
		
		/*for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		*/
		
		
		
		System.out.println("*************");
		
		
		for(int i[]:num) {
			for(int j:i) {
				sum=sum+j;
				
			}
			
		}
		//System.out.println(sum);
		
		MultiArraysSumm mas = new MultiArraysSumm();
		int total = mas.display();
		System.out.println(total);
		
	}
	
	
	public int display() {
		return sum;
	}
	
	
}
