package com.collect;

import java.util.*;

public class Comparat implements Comparable<Comparat>{
	
	int id;
	String name;
	
	Comparat(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	
	public static void main(String args[]) {
		TreeSet<Comparat> ts = new TreeSet();
		
		Comparat c1 = new Comparat(1,"Mithun");
		Comparat c2 = new Comparat(2,"Anand");
		Comparat c3 = new Comparat(3,"Goverdhan");
		Comparat c4 = new Comparat(4,"Maruthi");
		Comparat c5 = new Comparat(5,"Shiva");
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		for(Comparat com:ts) {
			System.out.println(com.id+" "+com.name);
		}
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Comparat c) {
		return  Comparator.comparingInt(Comparat::getId).thenComparing(Comparat::getName).compare(this, c);
	}

	
	

	

}
