package com.che;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addition extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		
		
		/*req.setAttribute("k", k);
		
		//*******Request Dispatcher
		RequestDispatcher rd = req.getRequestDispatcher("Sq");
		rd.forward(req, res);*/
		
		
		
		//******Send Redirect - url Rewrite
		
		// res.sendRedirect("Sq?k="+k);
		
		//******Send Redirect - Session
		
		/*HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
		
		res.sendRedirect("Sq");*/
		
		//******Send Redirect - Cookie
		
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("Sq");
		
	}

}
