package com.modifiers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
		//create an object using class
		Class c = Class.forName("com.modifiers.Class_A");
		
		
		//create an object for Class_A using newInstance (Not by new keyword)
		Class_A ca = (Class_A)c.newInstance(); 
		
		//create an object for Method class using getDeclaredMethod
        Method m = c.getDeclaredMethod("show", null);
        
      
		    //set method as accessible       
            m.setAccessible(true);
		           
		           
		     //invoke the method by passing parameters (classname and null)     
		     m.invoke(ca, null);
		           
		        
		     
		     
		     
		
	}

}
