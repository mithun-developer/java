package com.learning;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServelet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		int i= Integer.parseInt(req.getParameter("Num1"));
		int j= Integer.parseInt(req.getParameter("Num2"));
		
		int k = i+j;
		System.out.println("Result is"+" "+k);
		
		
	}
	
	

}
