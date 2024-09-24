package com.learning1;
import java.util.*;

public class MaximmumCharinStreengh {
	
	public static void main(String args[]) {
		String name="mmmmithun";
		
		
		char[]a=name.toCharArray();
		int size=a.length;
		
		Map <Character, Integer> hm = new LinkedHashMap();
		
		int i=0;
		while(i !=size){
			if(hm.containsKey(a[i])==false) {
				hm.put(a[i], 1);
			}else {
				
				int oldval = hm.get(a[i]);
				int newval = oldval+1;
				hm.put(a[i], newval);
				
			}
		i++;
		}
		
		
		int maxval=0;
		char maxchar=' ';
		Set<Map.Entry<Character, Integer>> sett= hm.entrySet();
		
		for(Map.Entry<Character, Integer>abc:sett) {
			
			
			if(abc.getValue()>maxval) {
				maxval = abc.getValue();
				maxchar=abc.getKey();
			}
			
			
			
			
		}
		System.out.println(maxchar);
			
	}

}
