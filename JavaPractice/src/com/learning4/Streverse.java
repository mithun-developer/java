package com.learning4;


import java.text.SimpleDateFormat;

import java.util.Calendar;


public class Streverse {

	
	public static void main(String args[]) {
		Streverse.dates(-90);

	}
	
	
 public static void dates(int n) {
		
	  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
   
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, n);
	
	String res = formatter.format(cal.getTime());
	System.out.println(res);

}
 

 	public void abc(int a) {
	 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	 
	 Calendar cal = Calendar.getInstance();
	 cal.add(Calendar.DATE, a);
	 String aa= sdf.format(cal.getTime());
	 System.out.println(aa);
	 
 }

	
}

