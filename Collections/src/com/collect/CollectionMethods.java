package com.collect;
import java.util.*;


public class CollectionMethods {
	

	
	
	public static void main(String args[]) {
		
		
		// Creating an Array list - 1
		ArrayList al = new ArrayList();
		//System.out.println(al);
		
		// Adding elements to the Array list -1
		
	
		
	
		al.add("Mithun");  // add() method is used to add elements
		al.add("Anand");
		al.add("goverdhan");
		al.add("shiva");
		al.add("Maruthi");
    	al.remove("Anand"); // Removes element from list
	
    	
al.sort(Comparator.naturalOrder()); // sorting method using natural order (Displaying elements starts with capital letters first and then small letters)
		
	al.sort(String.CASE_INSENSITIVE_ORDER);
	
	
		// Creating an Array list - 2
		ArrayList al2 = new ArrayList();
		//System.out.println(al2);
		
		// Adding elements to the Array list -2
	
		al2.add("Keerthana");
		al2.add("Sirisha");
		al2.add("Sai");
		al2.add(1, "vidya"); // add() method is used to add elements at specified position
		al2.add("Mithun");
		
		 
		al2.sort(String.CASE_INSENSITIVE_ORDER); // sorting method using case sensitive (Display elements in alphabetical order)
		
		
		// Adding Array list - 2 to Array list - 1
		
		al.addAll(al2);
		//System.out.println(al);
		
		
		// Removing Array list - 2 to Array list - 1
		al.removeAll(al2);
		
		
		// Adding elements of Array list - 2 to Array list - 1 at specified position
		 
				 al.addAll(1, al2) ;
				//System.out.println(al);
				 
				
				
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i)); // It is used to fetch the element from particular position of list
		}
		
		System.out.println("************************");
		
		 //clearing all elements from Array list - 2 
		
		 al2.clear();
		 System.out.println(al2);

		 // Returns true if list contains specified value

		 System.out.println(al.contains("Mithun"));
		
		// Returns true if list is empty

				 System.out.println(al.isEmpty());
				 
				// Returns last index of specified value
				 
				 System.out.println(al.lastIndexOf("Mithun"));
				 
// Returns first index of specified value
				 
				 System.out.println(al.indexOf("Mithun"));
				 
		
				
				
				System.out.println(al.subList(2, 5)); // Displays elements between specified index value
				
				
				//It displays elements in alphabetical order
				Collections.sort(al);
				System.out.println(al);
				
				
				//It displays elements in reverse order
				Collections.reverse(al);
				System.out.println(al);
		
				
				//It swaps elements and displays
				
				Collections.swap(al, 1, 5);
				System.out.println(al);
				
//It displays minimum value of element from list 
				
			
				System.out.println(Collections.min(al));
				
				
				//It displays maximum value of element from list
				
				
				System.out.println(Collections.max(al));
	}

}
