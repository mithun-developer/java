package com.learning;
import java.util.*;

public class Printing7_Types {
	 int empid;
	String name,location;
	
	Printing7_Types(int empid,String name,String location){
		this.empid=empid;
		this.name=name;
		this.location=location;
		
		
	}
	
	
	public static void main(String args[]) {
		
		ArrayList<Printing7_Types> al = new ArrayList();
		
		Printing7_Types al1 = new Printing7_Types(1,"Mithun","Hyd");
		Printing7_Types al2 = new Printing7_Types(1,"AA","Hyd");
		Printing7_Types al3 = new Printing7_Types(1,"BB","Hyd");
		Printing7_Types al4 = new Printing7_Types(1,"CC","Hyd");
		
		al.add(al1);
		al.add(al2);
		al.add(al3);
		al.add(al4);
		
		// 1st type
		
	/*	System.out.println(al1.empid+" "+al1.name+" "+al1.location);
		System.out.println(al2.empid+" "+al2.name+" "+al2.location);
		System.out.println(al3.empid+" "+al3.name+" "+al3.location);
		System.out.println(al4.empid+" "+al4.name+" "+al4.location);*/
		
		
		//2nd type
		/*
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).empid+" "+al.get(i).name+" "+al.get(i).location);
		}
		
		*/
	
		//3rd type
		
		/*for(Printing7_Types p : al ) {
			System.out.println(p.empid+" "+p.name+" "+p.location);
		}
		*/
		
		//4th type
		
		/*System.out.println("In forward direction");
		
		ListIterator<Printing7_Types> li = al.listIterator();
		while(li.hasNext()) {
			Printing7_Types pp =li.next();
			System.out.println(pp.empid+" "+pp.name+" "+pp.location);
			
		}
		
		System.out.println("**************************");
		System.out.println("In Reverse direction");
		
		while(li.hasPrevious()) {
			Printing7_Types p =	li.previous();
			System.out.println(p.empid+" "+p.name+" "+p.location);
		}
		*/
		
		//5th type
		
		/*Iterator<Printing7_Types> itr = al.iterator();
		
		while(itr.hasNext()) {
			Printing7_Types p=	itr.next();
			System.out.println(p.empid+" "+p.name+" "+p.location);
		}*/
		
		
		//6th type
		
		/*Iterator<Printing7_Types> itr = al.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a.empid+" "+a.name+" "+a.location);
		});
		*/
		
		
	 //  7th type
		
		al.forEach(a->{
			System.out.println(a.empid+" "+a.name+" "+a.location);
		});
	
	
	}
}
