package com.programmes1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Adding_Days_Practice_again {
	
	public static void main(String args[]) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy"); // creating SimpleDateFormat object
		Calendar cal = Calendar.getInstance(); // creating calendar instance
		cal.add(Calendar.DATE, 1); // adding dates to the calendar
		System.out.println(sdf.format(cal.getTime())); 
		
	}
	
	
		
	}

