package com.win;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Double i = Double.parseDouble(req.getParameter("num1"));
		Double j = Double.parseDouble(req.getParameter("num2"));
		Double k=0.0;
		
		PrintWriter pw = res.getWriter();
		
		
	String cap =	req.getParameter("ss");
	if(cap.equals("Add")) {
		k=i+j;
	}else if(cap.equals("Sub")) {
		k=i-j;
	}else if(cap.equals("Mul")) {
		k=i*j;
	}else if(cap.equals("Div")) {
		k=i/j;
	}
	
	
		
	pw.println(k);
	}

}
