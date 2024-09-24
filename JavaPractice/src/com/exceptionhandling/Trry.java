package com.exceptionhandling;

public class Trry {

	public static void main(String args[]) {
            
		try {
			int a[]= {10,5};
			try {
				a[2]=8; // Trying to insert new value '8' in an array of which capacity is 2. IT WILL THROW AN ERROR

				// Handling Array Index Out Of Bounds Exception
			}catch(Exception ai) {
				ai.printStackTrace();
			}
			a[3]=7/0; // Trying to get Arithmetic Exception dividing by 0.IT WILL THROW AN ERROR

			//handling Arithmetic Exception
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		
	}
}











