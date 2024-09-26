package com.practice;


public class Triangle extends Shape {

	public Triangle(int Base, int height) {
		super(Base, height);
	}

//	public int getArea() {
//		return (this.width * this.height)/2;
//	}

	public int getArea() {
		
		double a = 2.3424234234234;
		int b = 3;
		
		System.out.println((double)b);
		System.out.println((int)a);
		
		
		
		System.out.println("1/2 	:"+1/2);
		System.out.println("width 	:"+this.width);
		System.out.println("height 	:"+this.height);
		System.out.println("with float	:"+ (float)1/2 * (float)this.width * (float)this.height);
		System.out.println("without float	:"+ 1/2 * this.width * this.height);
		
		return 1/2 * this.width * this.height;
		
		
		
	}
	
	

}

//public class Triangle {
//	int x = 0;
//
//	public static void main(String args[]) {
//
//		for (int i = 0; i <20; i++) {
//			if (i%2==0) {
//				for (int j = 0; j <= i; j++) {
//					if (j == 0 || j == i ) {
//						System.out.print("*");
//					} else {
//						System.out.print("*");
//					}
//
//				}System.out.println("");
//			}else {
//				for (int j = 0; j <= i; j++) {
//					if (j == 0 || j == i ) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//
//				}System.out.println("");
//			}
//			
//			
//
//		}
//		for (int k = 0; k < 20; k++) {
//			System.out.print("*");
//		}
//
//		/*
//		 * String name= "mithun learning java";
//		 * 
//		 * String words [] = name.split(" ");
//		 * 
//		 * String reverseString=" ";
//		 * 
//		 * for(String w:words) {
//		 * 
//		 * String reverseword=" ";
//		 * 
//		 * for(int i=w.length()-1;i>=0;i--) {
//		 * 
//		 * reverseword= reverseword+w.charAt(i); }
//		 * 
//		 * reverseString=reverseString+reverseword;
//		 * 
//		 * }
//		 * 
//		 * 
//		 * System.out.println(reverseString);
//		 */
//
//		/*
//		 * String name= "mithun learning java";
//		 * 
//		 * char a[] = name.toCharArray(); int size= name.length();
//		 * 
//		 * char b[] = new char[size];
//		 * 
//		 * for(int i=0;i<name.length();i++) { if(a[i]==' ') { b[i]=' '; }
//		 * 
//		 * 
//		 * } int j = name.length()-1; for(int i=0;i<name.length();i++) {
//		 * 
//		 * if(a[i]!=' ') { if(b[j]==' ') { j--; }
//		 * 
//		 * b[j]=a[i]; j--; }
//		 * 
//		 * } System.out.println(b);
//		 */
//
//	}
//
//}
