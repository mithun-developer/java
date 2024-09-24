package com.learning1;

public class Triangle {
	
	public static void main(String args[]) {
		
		
		int num=10;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k<i;k++) {
				if(k>1 && i<10) {
					System.out.print("* ");
					break;
				}else if(i<4) {
					System.out.print("* ");
					
				}
			}
			
			
			
			System.out.println();
		}
		
	
		
	
		
	

}
}





