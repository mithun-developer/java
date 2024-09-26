package com.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddDaysToDate {

	
	public static void main(String args[]) {
		AddDaysToDate.date(2);
		
	}
	
	
	public static void date(int a){
		
		//Creating object with Specific date format
		SimpleDateFormat sdf =  new SimpleDateFormat("MM/dd/yyyy");
		
		// Getting current Calendar instance
		Calendar cal = Calendar.getInstance();
	
		
		// Adding two days to the Calendar instance
		cal.add(Calendar.DATE,a);
	
		//Printing the newly added date in specified format
		System.out.print(sdf.format(cal.getTime()));
		
		
	}
}
