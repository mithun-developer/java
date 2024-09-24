package com.collect;
import java.util.*;

class Empl{
	int empid;
	String name, location;
	
	int abc[][]= {{1,5,10,15,20},{2,5,6,40,33},{34,53,6,88,6}};
	
	Empl(int empid,String name,String location){
		this.empid=empid;
		this.name=name;
		this.location=location;
	
	}
	
	
	
}


public class VectorDemo {

	public static void main(String args[]) {
		
		//Define the size of vector by passing value
		Vector<Empl> v = new Vector(6);
		
		
		v.add(new Empl(1,"Mithun","Hyderabad"));
		v.add(new Empl(2,"Anand","Hyderabad"));
	
		
		for(Empl e:v) {
			System.out.println(e.empid+" "+e.name+" "+e.location);
			
		}
		
		System.out.println("Vector capacity is:"+" "+v.capacity());
		System.out.println("Now vector is having"+" "+v.size()+" "+"elements");
		
		
	
		
	}
	
	
	
}
