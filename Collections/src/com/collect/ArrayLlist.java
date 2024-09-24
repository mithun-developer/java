package com.collect;
import java.util.*;
public class ArrayLlist {

	int num;
	String name,loc;
	
	ArrayLlist(int num, String name, String loc){
		this.num=num;
		this.name=name;
		this.loc=loc;
	}
	
	public static void main(String args[]) {
		
		Object  emp[] = {1,"Uday"};
		
		
		
		
		ArrayList <ArrayLlist>al = new ArrayList();
		
		
		
		al.add(new ArrayLlist(1,"MM","Hyd"));
		al.add(new ArrayLlist(2,"SS","Hyd"));
		al.add(new ArrayLlist(3,"KK","Hyd"));
		
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).num+" "+al.get(i).name+" "+al.get(i).loc);
		}*/
		
		
		/*for(ArrayLlist a: al ) {
			
			System.out.println(a.num+" "+a.name+" "+a.loc);
		}*/
		
		/*
		ListIterator <ArrayLlist>li = al.listIterator();
		System.out.println("Forward");
		while(li.hasNext()) {
		ArrayLlist a = li.next();
		System.out.println(a.num+" "+a.name+" "+a.loc);
		
		
	}
		System.out.println("Reverse");
		while(li.hasPrevious()) {
			ArrayLlist aa = li.previous();
			System.out.println(aa.num+" "+aa.name+" "+aa.loc);
		}*/
		
		
		/*Iterator itr = al.iterator();
		
		al.forEach(a->{
			System.out.println(a.num+" "+a.name+" "+a.loc);
		});*/
		
		
		/*
		Iterator<ArrayLlist> itr = al.iterator();
		
		itr.forEachRemaining(a->{
			System.out.println(a.num+" "+a.name+" "+a.loc);
		});
		*/
		
		Iterator<ArrayLlist> itr = al.iterator();
		while(itr.hasNext()) {
			ArrayLlist a = itr.next();
			System.out.println(a.num+" "+a.name+" "+a.loc);
		}
		
		
		
	}
	
	
}
