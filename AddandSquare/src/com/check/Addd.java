package com.check;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addd extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("Square");
		rd.forward(req, res);
		
	}

}
