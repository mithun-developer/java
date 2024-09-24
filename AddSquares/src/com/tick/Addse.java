package com.tick;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/acting")
public class Addse extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		//Request Dispatcher
		
		/*req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("Square");
		rd.forward(req, res);*/
		
		// URL re-writing
		
	//	res.sendRedirect("Square?k="+k);
		
		
		// Session management
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("Square");
		
		// Cookie
		
		Cookie cookie = new Cookie("k",k+"");
		
		
	}

}
