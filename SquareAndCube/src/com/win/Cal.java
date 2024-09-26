package com.win;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Cal extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j=0;
		PrintWriter pw = res.getWriter();
		String str = req.getParameter("ss");
		if(str.equals("Square")) {
			j=i*i;
		}else if(str.equals("Cube")) {
			j=i*i*i;
		}
		
		pw.println(j);
	}

	
}
