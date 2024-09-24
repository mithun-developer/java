package com.che;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Squaring extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		// Request Dispatcher
		
		//int k = (int) req.getAttribute("k");
		
		
		//Send Redirect - url Rewrite
		
		//int k = Integer.parseInt(req.getParameter("k"));
		
		//Send Redirect - Session
		
		/*HttpSession session = req.getSession();
		int k = (int)  session.getAttribute("k");*/
		
		//Send Redirect - Cookie
		
		int k=0;
		Cookie cookie [] = req.getCookies();
		
		for(Cookie c: cookie) {
			
			if(c.getName().equals("k")) {
				k= Integer.parseInt(c.getValue());
			}
			
		}
		
		k=k*k;
		
		PrintWriter pw = res.getWriter();
		pw.println(k);
		
}

}
