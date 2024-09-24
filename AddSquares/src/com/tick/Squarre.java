package com.tick;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Square")
public class Squarre extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//int k = (int) req.getAttribute("k");
		
	//	int k = Integer.parseInt(req.getParameter("k"));
		
		HttpSession session = req.getSession();
		
		int k = (int) session.getAttribute("k");
		
		k=k*k;
		
		PrintWriter pw = res.getWriter();
		pw.println(k);
		
		
	
		
	}
	
}
