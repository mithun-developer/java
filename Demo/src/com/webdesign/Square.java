package com.webdesign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		/*int k = (int) req.getAttribute("k");
		
		k=k*k;
		
		PrintWriter pp = res.getWriter();
		pp.println("Result is"+" "+k);*/
		
		int k = Integer.parseInt(req.getParameter("k"));
		PrintWriter pp = res.getWriter();
		pp.println("Result is"+" "+k);
	}

}
