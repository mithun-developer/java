package com.collect;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Empolye{
	int empid;
	String name, location;
	
}



public class HashMapDemo {

	public static void main(String args[]) {
		
		ConcurrentHashMap  hm = new ConcurrentHashMap();
		
		hm.put("name", "Mithun");
		hm.put("DOB", "1st Jan");
		hm.put("Job", "Java Developer");
		hm.put("location", "Hyderabad");
		
		
		
		
		
		
		//System.out.println(hm.get("DOB"));
		
		/*System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		*/
		
		
		/*Set s =  hm.keySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
		
			
			Object obj =  itr.next();
			String str = (String) obj;
			System.out.println(str+":"+hm.get(str));
			
			
		}*/
		// ************************************************************************
	/*	Set s = hm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			String str = (String) obj;
			System.out.println(str+":"+hm.get(str));
		}*/
		
		//**********************************************************************
		
		Set s= hm.keySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			String str = (String) obj;
			System.out.println(str+" : "+hm.get(str));
			hm.put("", "");
		}
		
		
		
	}
}
