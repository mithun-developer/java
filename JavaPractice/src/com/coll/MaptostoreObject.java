package com.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class MaptostoreObject {
	
	
	
	
	static class Emp{
		String name;
		String id;
		int sal;
		String lear;
		
		
		Emp(String name,String id,int sal,String lear){
			this.name=name;
			this.id=id;
			this.sal=sal;
			this.lear=lear;
		}
	}

	
	public static void main(String args[]) {
		
		
		
    /*Map<String, Student> students = new HashMap();		
		
		Student stu = new Student();
		//stu.setAge(20);
		stu.age=20;
		stu.name="phalguna";
		
		stu.students.put("phalguna", stu);*/
		Map<Integer, Emp> employ = new HashMap();
		
		Emp e1 = new Emp("Mithun","101",100000,"java");
		Emp e2 = new Emp("Phalguna","102",150000,"java");
		Emp e3 = new Emp("Shyam","103",200000,"java");
		
		employ.put(1, e1);
		employ.put(1, e2);
		employ.put(1, e3);
		
		/*for(int i=0;i<employ.size();i++) {
			System.out.print(e1.id+" "+e1.name+" "+e2.id+" "+e2.name+" "+e3.id+" "+e3.name);
		}
		*/
		
		Set s= employ.keySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
		
			Object ob = itr.next();
			System.out.println(employ.get(ob).id);
			
		}
		
	}
	
	
	
	class Salary{
		String empid;
		long salary;
		long accountnum;
	}

	class Learning{
		String empid;
		List<Course> courses;
	}

	class Course{
		String name;
		String duration;
	}

	class Student{
		String name;
		String course;
		
	}
}