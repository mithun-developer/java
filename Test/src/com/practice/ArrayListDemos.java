package com.practice;
import java.text.SimpleDateFormat;
import java.util.*;

public class ArrayListDemos {
	String name;
	int num;
	
	ArrayListDemos(String name, int num){
		
	this.name=name;
	this.num=num;
		
	}
	
	public static void main(String args[]) {
		
		ArrayList <ArrayListDemos>al = new ArrayList<>();
		
		ArrayListDemos ald1 = new ArrayListDemos("mm",1);
		ArrayListDemos ald2 = new ArrayListDemos("ss",2);
		ArrayListDemos ald3 = new ArrayListDemos("vv",3);
		ArrayListDemos ald4 = new ArrayListDemos("aa",4);
		ArrayListDemos ald5 = new ArrayListDemos("bb",5);
		
		
		
	  al.add(ald1);
	  al.add(ald2); 
	  al.add(ald3);
	  al.add(ald4);
	  al.add(ald5);
	  
	ListIterator <ArrayListDemos> li = al.listIterator();
	
	while (li.hasNext()) {
		
	ArrayListDemos ae=	li.next();
	System.out.println(ae.name+" "+ae.num);
	
	
	
	}
	
	

	}
	 
	
	}
		
	
	
	

