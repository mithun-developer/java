package com.collect;

public class WrapperClassDemo {
	
	public static void main(String args[]) {
		/*int x= 3;
		Integer y = x;
		System.out.println(y);
		*/
		
		byte b = 4;         // Byte declaration
		Byte bb = new Byte(b); //Byte object
		byte bbb=bb;          // Changing Byte object to primitive data type
		System.out.println(bbb);
		
		
		
	//*****************************************************************************	
		short s=5;            // Short declaration
		Short ss = new Short(s);  // Short object
		short sss=ss;            // Changing Short object to primitive data type
		System.out.println(sss);
		
	//*****************************************************************************	
		
		Integer x = new Integer(6);  //Integer object
		int xx = x;   // Changing Integer object to primitive data type
		System.out.println(xx);
		
	//*****************************************************************************	
		
		long l = 6;  // Long declaration
		Long ll = new Long(l); // Long object
		long lll = ll; // Changing Long object to primitive data type
		System.out.println(lll);
	
    //******************************************************************************
		
		Float f = new Float(2.6); // Float object
		float was=f;             //Changing Float object to primitive data type
		System.out.println(was);
	//*****************************************************************************	
		
		Double d = new Double(22); // Double object
		double were=d;             //Changing Double object to primitive data type
		System.out.println(were);
		
	//******************************************************************************
		
		Character ch = new Character('a'); // Character object
		char c = ch; // Changing Character object to primitive data type
		System.out.println(c);
		
	//******************************************************************************
		
		Boolean bl = new Boolean(true) ; // Boolean object
		boolean bool = bl; // Changing boolean object to primitive data type
		System.out.println(bool);
		
		
		
	}

}
