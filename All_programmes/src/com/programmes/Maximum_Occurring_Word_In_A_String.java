package com.programmes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maximum_Occurring_Word_In_A_String {

	public static void main(String[] args) {
		
		
		String name = "mithun learning java in his way of learning";
		
		
		String words[] = name.split(" ");
		int size = words.length;
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap();
		
		int i=0;
		while(i !=size) {
			if(map.containsKey(words[i])==false) {
				map.put(words[i], 1);
			}else {
				int oldval = map.get(words[i]);
				int newval = oldval+1;
				map.put(words[i], newval);
			}
			
			i++;
		}

		Set<Map.Entry<String,Integer>> sett = map.entrySet();
		
		for(Map.Entry<String,Integer> data:sett) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
			}
		}
		
	}

}
