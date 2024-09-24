package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Add extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		
		//Request Dispatcher
		/*req.setAttribute("k", k);
		RequestDispatcher rd= req.getRequestDispatcher("sq");
		rd.forward(req, res);
		*/
		
		// Send Redirect - URL rewrite
		
	//	res.sendRedirect("sq?k="+k);
		
		
		// Send Redirect - Session
		
	/*	HttpSession session = req.getSession();
		session.setAttribute("k", k);*/
		
		// Send Redirect - Cookie
		
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
	}

}
