package com.learning3;
import java.util.*;


public class LinkedListDemo {
	
   String name,loc;
	
 public LinkedListDemo(String name, String loc) {
		this.name = name;
		this.loc = loc;
	}
	
	
	public static void main(String[] args) {
		
		LinkedList<LinkedListDemo> ll = new LinkedList();
		
		LinkedListDemo lld1 = new LinkedListDemo("Mithun","Hyd");
		LinkedListDemo lld2 = new LinkedListDemo("Keerthana","Hyd");
		LinkedListDemo lld3 = new LinkedListDemo("Sirisha","Hyd");
		
		ll.add(lld1);
		ll.add(lld2);
		ll.add(lld3);
		
		for(int i=0;i<ll.size();i++) {
			
			System.out.println(ll.get(i).name+" "+ll.get(i).loc);
			
		}
		
	}

}
