package com.learning;

public class ArreeyAddingToMethodw {
	
 static	int arr[]= {5,6,7,8};
	int sum;
	
public int display(int num[]) {
	for(int x:num) {
		sum=sum+x;
	}
	return sum;
}

	
	public static void main(String args[]) {
		
		ArreeyAddingToMethodw ad = new ArreeyAddingToMethodw();
		
		System.out.println(ad.display(arr));
		
		
	}
	
	
}
