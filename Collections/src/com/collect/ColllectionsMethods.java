package com.collect;
import java.util.*;

public class ColllectionsMethods {

	
	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add(103);
		al.add(55);
		al.add(27);
		al.add(66);
		al.add(15);
		
		System.out.println(al);
		// sort method
		Collections.sort(al);
		System.out.println(al);
		
		
		//Reverse methode
		Collections.reverse(al);
		System.out.println(al);
		
		
		//swap method
		Collections.swap(al, 0, 4);
		System.out.println(al);
		
		//minimum method
		
		System.out.println(Collections.min(al));
		
		//maximum method
		
		
		System.out.println(Collections.max(al));
		
	}
}
