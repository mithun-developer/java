package com.collect;
import java.util.*;
import java.time.*;
import javax.lang.*;
import javax.xml.*;
import javax.sql.*;



class Student{
	int rno;
	String name,location;
	 
	
	
	Student(int rno,String name, String location){
		this.rno=rno;
		this.name=name;
		this.location=location;
		
	}
	
}




public class LinkedListDemo {

	public static void main(String args[]) {
		
		LinkedList<Student> ll = new LinkedList<>();
		ll.add(new Student(10,"Mithun","Hyderabad"));
		
		Student std = new Student(11,"Anand","Hyderabad");
		ll.add(std);
		
		
		
		
		/*Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		
			
		}
		*/
		
		
		
		for(Student s:ll) {
			System.out.println(s.rno+" "+s.name+" "+s.location);
		}
		
	}


}
	
	