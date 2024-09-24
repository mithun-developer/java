package com.programmes;

public class String_Rotation {

	public static void main(String[] args) {
		
		String name="JavaJ2eeStrutsHibernate";
		String newname=name.concat(name);
		String keyString="StrutsHibernateJavaJ2ee";
		
		
		if(newname.contains(keyString)) {
			System.out.println("Rotational String");
		}else {
			System.out.println("Non Rotational String");
		}
		
		
		
		
		
		
	}

}
