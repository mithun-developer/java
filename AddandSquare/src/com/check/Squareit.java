package com.check;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Squareit extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int k = (int) req.getAttribute("k");
		
		k=k*k;
		
		PrintWriter pw = res.getWriter();
		pw.println(k);
		
	}

}
