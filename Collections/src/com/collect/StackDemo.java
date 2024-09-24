package com.collect;
import java.util.*;

public class StackDemo {
	
	int num;
	String name;
	
	StackDemo(int num, String name){
		this.num=num;
		this.name=name;
		
	}
	
public static void main(String  args[]) {
	Stack<StackDemo>s = new Stack();
	
	StackDemo sd1 = new StackDemo(1,"Mithun");
	StackDemo sd2 = new StackDemo(2,"Keerthana");
	StackDemo sd3 = new StackDemo(3,"Sai");
	StackDemo sd4 = new StackDemo(4,"Sirisha");
	
	s.push(sd1);
	s.push(sd2);
	s.push(sd3);
	s.push(sd4);
	
	for(StackDemo ss:s) {
		System.out.println(ss.num+" "+ss.name);
	}
	
	System.out.println("**********");
	
	System.out.println(s.search(sd4)); // It will consider bottom value as 1st and top
	System.out.println(s.peek().name); // It will consider bottom value as 1st and it is topmost (peek)
	System.out.println(s.pop().name); // LIFO - Last inserted first out, so it will pop out the first element
	
	
}
	
	
}
