package com.learning;
import java.util.*;
public class Comparision implements Comparable<Comparision>{
	
	int id;String name;
	Comparision(int id,String name){
		this.id=id;
		this.name=name;
		
	}

	public static void main(String args[]) {
		TreeSet<Comparision> ts = new TreeSet();
		
		
		Comparision c1 = new Comparision(1,"Mithun");
		Comparision c2 = new Comparision(2,"Keerthana");
		Comparision c3 = new Comparision(3,"Sirisha");
		Comparision c4 = new Comparision(4,"Maruthi");
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		for(Comparision cc:ts) {
			System.out.println(cc.id+" "+cc.name);
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

	
	public int compareTo(Comparision c) {
		
		return Comparator.comparingInt(Comparision::getId).thenComparing(Comparision::getName).compare(this,c);
	}

	

	
}
