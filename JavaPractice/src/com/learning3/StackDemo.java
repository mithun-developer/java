package com.learning3;
import java.util.*;

public class StackDemo {
	
	 String name,loc;
		
	
	StackDemo(String name, String loc){
		this.name = name;
		this.loc = loc;
		
	}
	public static void main(String[] args) {
		
		Stack <StackDemo>st = new Stack();
		
		  StackDemo st1 = new StackDemo("Mithun","Hyd");
		    StackDemo st2 = new StackDemo("Keerthana","Hyd");
				StackDemo st3 = new StackDemo("Sirisha","Hyd");
				
				st.push(st1);
				st.push(st2);
				st.add(st3);
				
				System.out.println(st.peek().name+" "+st.peek().loc);
				System.out.println(st.search(st1));
				
				System.out.println(st.pop().name);
				
				
				System.out.println(st.isEmpty());
	}
}
