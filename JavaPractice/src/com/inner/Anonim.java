package com.inner;

public class Anonim {
	public static void main(String args[]) {
		/*Inter i = new Inter() {
			public void it() {
				System.out.println("Software Developer");
			}
		};
		i.it();
*/


//********************************************
//By using Lambda expression


		Inter i = ()->System.out.println("Java Developer");
		
	i.it();
	
	
	
	}
	
}