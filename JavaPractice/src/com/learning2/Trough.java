package com.learning2;

import java.util.Iterator;
import java.util.*;

public class Trough {
	
	public static void main(String args[]) {
		
		LinkedList<String> list = new LinkedList();
		
		PriorityQueue pq= new PriorityQueue();
		
		
		 ArrayList<String> arrayList = new ArrayList<String>();
		 
	        arrayList.add("SIX");
	 
	        arrayList.add("SEVEN");
	 
	        arrayList.add("EIGHT");
	 
	        arrayList.add("NINE");
		 
	    //Adding elements at the end of the list

	    list.add("JAVA");

	    list.add("J2EE");

	    list.add("JSP");

	    list.add("SERVLETS");

	    list.add("JDBC");
	    
	    list.add("STRUTS");

	   
	    String s="STRUTS";
	    
	    if(list.contains(s)) {
	    	int i=list.indexOf(s);
	    	System.out.println("Yes element is there! and it is at"+" "+i);
	    }else {
	    	System.out.println("No such element is there!");
	    }
	    
	    Iterator it= list.descendingIterator();
	    it.forEachRemaining(a->{
	    	System.out.println(a);
	    });
	    
	   list.addAll(arrayList);
	   System.out.println(list);
	}
}
