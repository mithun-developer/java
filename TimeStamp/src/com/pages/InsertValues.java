package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertValues
 */
@WebServlet("/InsertValues")
public class InsertValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertValues() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int sun= Integer.parseInt(request.getParameter("val1"));
	int mon= Integer.parseInt(request.getParameter("val2"));
	int tue= Integer.parseInt(request.getParameter("val3"));
	int wed= Integer.parseInt(request.getParameter("val4"));
	int thu= Integer.parseInt(request.getParameter("val5"));
	int fri= Integer.parseInt(request.getParameter("val6"));
	int sat= Integer.parseInt(request.getParameter("val7"));
	
	
	int sunday= Integer.parseInt(request.getParameter("val8"));
	int monday= Integer.parseInt(request.getParameter("val9"));
	int tuesday= Integer.parseInt(request.getParameter("val10"));
	int wednesday= Integer.parseInt(request.getParameter("val11"));
	int thursday= Integer.parseInt(request.getParameter("val12"));
	int friday= Integer.parseInt(request.getParameter("val13"));
	int saturday= Integer.parseInt(request.getParameter("val14"));
		
		int total = sun+mon+tue+wed+thu+fri+sat+sunday+monday+tuesday+wednesday+thursday+friday+saturday;
		
		
		int pid= Integer.parseInt(request.getParameter("projectid"));
		//String ename= request.getParameter("ename");
		
		
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver()");  
			
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system", "Oracle123");
			
			Statement st = c.createStatement();
			String sql= "insert into stamp values("+pid+", "+total+")";
			st.executeUpdate(sql);
			
			PrintWriter pw = response.getWriter();
			pw.println("Time Stamp Entered");
			c.close();
			
		}catch(Exception e) {
			
			
		}
	
	}

}
