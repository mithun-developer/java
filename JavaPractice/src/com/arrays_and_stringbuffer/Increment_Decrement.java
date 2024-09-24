package com.arrays_and_stringbuffer;

public class Increment_Decrement {
	
	public static void main(String args[]) {
	
		
		/* a++ use and increment. so value used as 5 then incremented value it become 6 .
		 * ++a increment and use. so value incremented and become 7. Then it used as 7.
		 *                 5+7=12
		 */
		int a=5;
        int b = a++ + ++a;
		//        5+7
		
        
        /* --a Decrement and use. so value used as 4 
         * then a-- use the value 4 and decremented value it become 3 .
		 * again a-- use the value 3 and decremented value it become 2.
		 *                 4+3-2
		 */
        
        
	   //	 int b= --a + a-- - a--;
		//           4+3-2

	//	System.out.println("b :"+b);
        
		
        System.out.println("b :"+b);
	       // int b= ++a - --a + a--;
           // 6-5+5        
		
	}

}
