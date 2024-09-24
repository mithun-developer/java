package com.coll;
import java.util.*;

public class ArrayListDemo {

	int id;
	String name;
	
	ArrayListDemo(int id, String name){
		
		this.id=id;
		this.name=name;
		
	}
	
	public static void main(String args[]) {
		
		ArrayList<ArrayListDemo> al = new ArrayList();
		
		ArrayListDemo ald1 = new ArrayListDemo(1,"Mithun");
		ArrayListDemo ald2 = new ArrayListDemo(2,"Maruthi");
		ArrayListDemo ald3 = new ArrayListDemo(3,"Shiva");
		ArrayListDemo ald4 = new ArrayListDemo(1,"Mithun");
		
		al.add(ald1);
		al.add(ald2);
		al.add(ald3);
		al.add(ald4);
		
		     //Datatype    :  //where values are stored/present   
		/*for(ArrayListDemo a: al) {
			System.out.println(a.id+" "+a.name);
	
		}*/
		
		//*************************************************
		
	/*	Iterator<ArrayListDemo> itr = al.iterator();
		while(itr.hasNext()) {
			ArrayListDemo aa = 	itr.next();
			System.out.println(aa.id+" "+aa.name);
		
		}*/
		
		//**************************************
		
		/*Iterator<ArrayListDemo> itr = al.iterator();
		al.forEach(a->{
			System.out.println(a.id+" "+a.name);
		});
		
		*/
		
		//******************************************************
		
		
		/*Iterator<ArrayListDemo> itr = al.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a.id+" "+a.name);
		});*/
		
		
		//**************************************************
		
		
	/*	System.out.println("In forward direction");
		ListIterator<ArrayListDemo> itr = al.listIterator();
		while(itr.hasNext()) {
			ArrayListDemo a = itr.next();
			System.out.println(a.id+" "+a.name);
		}
		
		
		
		System.out.println("In backward direction");
		
	while(itr.hasPrevious()) {
		ArrayListDemo aa = itr.previous();
		System.out.println(aa.id+" "+aa.name);
	}*/
		
	//**************************************************************
		
		
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).id+" "+al.get(i).name);
		}
		
		
		
		
	}
	
	
}
