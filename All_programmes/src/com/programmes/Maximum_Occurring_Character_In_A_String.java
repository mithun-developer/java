package com.programmes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maximum_Occurring_Character_In_A_String {

	public static void main(String[] args) {
		
		
		String name = "mithun learning java";
		
		char []a = name.toCharArray();
		int size=a.length;
		
		LinkedHashMap <Character,Integer>map = new LinkedHashMap();
		
		int i=0;
		while(i !=size) {
			if(map.containsKey(a[i])==false) {
				map.put(a[i], 1);
			}else {
				int oldval= map.get(a[i]);
				int newval = oldval+1;
				map.put(a[i], newval);
			}
				
			i++;
			}
		
		
		Set<Map.Entry<Character,Integer>>sett = map.entrySet();
		int maxval=0;
		char maxkey=' ';
		for(Map.Entry<Character,Integer>data:sett) {
			if(data.getValue()>maxval) {
				maxval =data.getValue();
				maxkey = data.getKey();
			}
		}
		
		System.out.print(maxkey+" "+maxval);
		
		
		
		



		
		
		
		
		
		
		
		
		}

	}


