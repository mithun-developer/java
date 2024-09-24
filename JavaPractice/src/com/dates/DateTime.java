package com.dates;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import com.learning.ExwriteCollect;

import java.util.Calendar;

public class DateTime   {
	
	
	

	public static void main(String args[]) {
		
		
		// 1st way
		//To get current date
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		//To get current time
		
		LocalTime lt = LocalTime.now();
		System.out.println("Current time is - "+lt);
		
		
		//2nd way
		
		Date d = new Date();
		System.out.println(d);

		//3rd way
		
		Calendar c =  Calendar.getInstance();
		System.out.println(c.getTime());
		
		
	}

}
