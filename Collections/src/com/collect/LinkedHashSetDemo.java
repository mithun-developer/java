package com.collect;
import java.util.*;

class Emkloyee{
	/*int empid;
	String name,location;
	
	Emkloyee(int empid,String name,String location){
		this.empid=empid;
		this.name=name;
		this.location=location;
	}*/
}





public class LinkedHashSetDemo {
	
	public static void main(String...args) {
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add("Mithun");
		ls.add("Anand");
		ls.add("Goverdhan");
		ls.add("Anand");
		ls.add("Goverdhan");
		
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}
	

}
