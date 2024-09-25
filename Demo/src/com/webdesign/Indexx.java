package com.webdesign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Indexx extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("Num1"));
		int j = Integer.parseInt(req.getParameter("Num2"));
		
		int k=i+j;
		PrintWriter p = res.getWriter();
		
		p.println("Result is"+" "+k);
		
		/*req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("Square");
		rd.forward(req, res);*/
		
		res.sendRedirect("Square?k="+k);
		
	}
	
	

}
