package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaximumWord {

	public static void main(String[] args) {
		
		String name="keerthana is good keerthana";
		
		String words[] = name.split(" ");
		
		LinkedHashMap <String,Integer> map = new LinkedHashMap();
		
		int i=0;
		while(i !=words.length) {
			if(map.containsKey(words[i])==false) {
				map.put(words[i], 1);
			}else {
				int oldval = map.get(words[i]);
				int newval = oldval+1;
				map.put(words[i], newval);
			}
			i++;
			
		}
		
		Set <Map.Entry<String, Integer>> sett = map.entrySet();
		
		for(Map.Entry<String, Integer> data: sett) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
			}
		}
		

	}

}
