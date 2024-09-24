package com.programmes1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Add_Days_To_Date {

	public static void main(String[] args) {
		
		
		  //Joining date
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -365);

String joinDate = sdf.format(cal.getTime());


   // current date
Calendar call = Calendar.getInstance();
cal.add(Calendar.DATE, 0);

String toDate = sdf.format(call.getTime());

   //comparison
 if(joinDate.equals(toDate)) {
	
	System.out.println("Both are same");
}else {
	System.out.println("Both are not same");
}


	}
	
	

}
