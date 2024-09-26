package com.practice;

public class Shape {
	int width, height;

	 Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
 
	public static void main(String args[]) {
		
		Triangle t = new Triangle(2,2);
		Rectangle r = new Rectangle(2,2);
		
		System.out.println(t.getArea());
		System.out.println(r.getArea());
		
		
		
		
	}
	
	
}
