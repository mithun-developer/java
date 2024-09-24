package com.collect;
import java.util.*;

public class TreeMapDemo {
	public static void main(String args[]) {
		
		TreeMap tm =new TreeMap();
		
		tm.put("name", "Mithun");
		tm.put("DOB", "1st Jan");
		tm.put("Job", "Java Developer");
		tm.put("location", "Hyderabad");
		
		Set s = tm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			String str = (String) obj;
			System.out.println(str+" : "+tm.get(str));
			
		}
		
	}

}
