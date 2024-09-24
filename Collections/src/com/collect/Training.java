package com.collect;



class Circle{
	int r;
	double pi=3.14;
	
	
	Circle(int radius){
		r=2;
		r=radius;
	}

 public double calculateArea() {
	double area =pi*r*r;
	 
	return area;
	
}

} 

public class Training {
	public static void main(String args[]) {
		
		Circle circle = new Circle(8);
		double area = circle.calculateArea();
		System.out.println(area);
		
	}

	
}
