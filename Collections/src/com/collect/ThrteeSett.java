package com.collect;
import java.util.*;
public class ThrteeSett implements Comparable <ThrteeSett>{
	
	int num;
	String name;
	
	
	ThrteeSett(int num, String name){
		
		this.num=num;
		this.name=name;
		
	}
	
	public static void main(String args[]) {
		
		Set<ThrteeSett> ts = new TreeSet();
		
		ThrteeSett thh1 = new ThrteeSett(1,"Mithun");
		ThrteeSett thh2= new ThrteeSett(2,"Sirisha");
		ThrteeSett thh3 = new ThrteeSett(3,"Keerthana");
		ThrteeSett thh4 = new ThrteeSett(4,"Sai");
		ThrteeSett thh5 = new ThrteeSett(5,"Maruthi");
		
		ts.add(thh1);
		ts.add(thh2);
		ts.add(thh3);
		ts.add(thh4);
		ts.add(thh5);
		
		for(ThrteeSett t:ts) {
			System.out.println(t.num+" "+t.name);
		}
		
		
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
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

	
	public int compareTo(ThrteeSett t) {
		
		return Comparator.comparingInt(ThrteeSett::getNum).compare(this, t);
	}

}
