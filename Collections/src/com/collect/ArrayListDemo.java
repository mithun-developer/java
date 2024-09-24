package com.collect;

import java.util.*;

class Employee {
	
	 int empid;
	String name,location;
	
	Employee(int empid,String name,String location){
		this.empid=empid;
		this.name=name;
		this.location=location;
		
	}

	
}


public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		List<Employee> emp = new ArrayList();
		
		Employee emp1 = new Employee(1,"Mithun","Hyderabad");
		Employee emp2 = new Employee(2,"Anand","Hyderabad");
		Employee emp3 = new Employee(3,"Goverdhan","Hyderabad");
	
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		
		
		//1st way to print values
		
	/*	System.out.println(emp1.empid+" "+emp1.name+" "+emp1.location);
		System.out.println(emp2.empid+" "+emp2.name+" "+emp2.location);
		System.out.println(emp3.empid+" "+emp3.name+" "+emp3.location);
		
		//*********************************************************************
		
		     //2nd way to print values
		
		/*for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i).empid+" "+emp.get(i).name+" "+emp.get(i).location);
		}*/
		
		//*****************************************************************************
		         //3rd way to print values
	
		/*for(Employee e:emp) {
			System.out.println(e.empid+" "+e.name+" "+e.location);
		}
		
		*/
		
		
		
		
		//*****************************************************************************
		//          4th way to print values
		
		 Iterator<Employee> itr = emp.iterator();
		 while(itr.hasNext()) {
			 Employee e = itr.next();
			 System.out.println(e.empid+" "+e.name+" "+e.location);
		 }
		 
		
		
		
		//**********************************************************************
		//     5th way to print values
		
		/* System.out.println("In forward direction");
		 System.out.println();
		ListIterator<Employee> lt = emp.listIterator();
		while(lt.hasNext()) {
			Employee e =lt.next();
			System.out.println(e.empid+" "+e.name+" "+e.location);
		}
		
		System.out.println("***********************");
		
		 System.out.println("In Reverse direction");
		System.out.println();
		 while(lt.hasPrevious()) {
				Employee e =lt.previous();
				System.out.println(e.empid+" "+e.name+" "+e.location);
			}*/
		
		
		//*********************************************************************
		 //6th way to print values
		 
		/* Iterator<Employee> itr = emp.iterator();
		 itr.forEachRemaining(a->{
			 System.out.println(a.empid+" "+a.name+" "+a.location);
		 });*/
		 
		 
		 //*******************************************************************
		 
		// 7th way to print values
		
		/* emp.forEach(a->{
		System.out.println(a.empid+" "+a.name+" "+a.location);
	});*/
		 
		//***************************************************************
		 
		 
		 
		 
		 
		
		/*for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i).empid+" "+emp.get(i).name+" "+emp.get(i).location);
		}
		*/
	
		
	//	******************************************************************************************
		/*for(Employee e:emp) {
			System.out.println(e.empid+" "+e.name+" "+e.location);
		}
		*/
		
		
		
		
//********************************************************	
/*int x[] = new int[6];
		
		List<String> al = new ArrayList();
		
		al.add("Mithun");
		al.add("Anand");
		al.add("goverdhan");
		al.add("Maruthi");
		al.add("Shiva");
		
		
		
		List <String>acc = new ArrayList();
		acc.add("Sirisha");
		acc.add("Sai");
		acc.add("Keerthana");
		acc.add("Niranjan");
		acc.add("Amrutha");
		
		
		Iterator itr = al.iterator();
	itr.forEachRemaining(a->{
		System.out.println(a);
	});
	*/
		
//*************************************************************
		/*Iterator itr = al.iterator();
		Iterator itra = acc.iterator();
		
		
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
		
		System.out.println();
	
	itra.forEachRemaining(a->{
		System.out.println(a);
	});
	
	*/
		
//****************************************************************
		
		
		
		
	}
	
	

}
