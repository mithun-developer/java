package com.collect;
import java.util.*;



class Empoyee{
	
	
}

public class HashSetDemo {

	public static void main(String ...args) {
		
		HashSet hs = new HashSet();
		hs.add("Mithun");
		hs.add("Anand");
		hs.add("Goverdhan");
		hs.add("Anand");
		hs.add("Goverdhan");
		
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
				
				
	}
}
