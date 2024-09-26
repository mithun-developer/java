package com.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Add_Days_To_Date {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 2);
		
		System.out.println(sdf.format(cal.getTime()));

	}

}
