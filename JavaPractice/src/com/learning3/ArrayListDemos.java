package com.learning3;

import java.util.*;

public class ArrayListDemos {
	
	String name,loc;
	
	
	
	public ArrayListDemos(String name, String loc) {
		this.name = name;
		this.loc = loc;
	}

	public static void main(String[] args) {
		
		
		
		ArrayList<ArrayListDemos> al = new ArrayList();
		
		// One way of adding values in an array and print them
		
		ArrayListDemos ald1 = new ArrayListDemos("Mithun","hyd");
		ArrayListDemos ald2 = new ArrayListDemos("Keerthana","hyd");
		ArrayListDemos ald3 = new ArrayListDemos("Sirisha","hyd");
		
	   
	    al.add(ald1);
		al.add(ald2);
		al.add(ald3);
		
		
		System.out.println(ald1.name+" "+ald1.loc);
		System.out.println(ald2.name+" "+ald2.loc);
		System.out.println(ald3.name+" "+ald3.loc);
		
	System.out.println("**************************************");
		
		// Second way of adding values in an array and print them
		
		al.add(new ArrayListDemos("Mithun","Hyd"));
		al.add(new ArrayListDemos("Keerthana","Hyd"));
		al.add(new ArrayListDemos("Sirisha","Hyd"));
		
		System.out.println(al.get(0).name+" "+al.get(0).loc);
		System.out.println(al.get(1).name+" "+al.get(1).loc);
		System.out.println(al.get(2).name+" "+al.get(2).loc);
		
		
	}

}
