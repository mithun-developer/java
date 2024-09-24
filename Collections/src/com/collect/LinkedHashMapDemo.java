package com.collect;
import java.util.*;

public class LinkedHashMapDemo {
	
	public static void main(String args[]) {
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put("Name", "Mithun");
		lhm.put("DOB", "1st Jan");
		lhm.put("Job", "Java Developer");
		lhm.put("location", "Hyderabad");
		
	   Set s = lhm.keySet();
	   Iterator itr = s.iterator();
	   
	   while(itr.hasNext()) {
		   Object obj = itr.next();
		   String str = (String) obj;
		   System.out.println(str+" : "+lhm.get(str));
		   
	   }
	}

}
