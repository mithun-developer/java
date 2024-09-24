package com.collect;
import java.util.*;


class RollNums{
	
}
public class TreeSetDemo {

	public static void main(String args[]) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(55);
		ts.add(23);
		ts.add(21);
		ts.add(10);
		ts.add(5);
		
	    Iterator itr = ts.descendingIterator(); // Display  values from highest to lowset
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    	
	    	
	    }
	    
	    System.out.println("First value :"+ts.first());  //Display first value
	
	TreeSet ts1 = (TreeSet) ts.headSet(21);   //Display values below 21
	
	System.out.println();
	
	System.out.println(ts1);
	
	TreeSet ts2 = (TreeSet) ts.tailSet(21); //Display values above 21 along with 21 value
	System.out.println(ts2);
	
	TreeSet ts3 = (TreeSet) ts.subSet(10, 55); // Display values between 10 and 55 along with 10 value
	System.out.println(ts3);
	
	
	
	
	}
	
}
