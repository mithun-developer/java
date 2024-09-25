package tryy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("username");
		String pw = request.getParameter("password");
		
		if(u.equalsIgnoreCase("mithun")&&(pw.equalsIgnoreCase("mithun"))) {
			response.sendRedirect("labTrack.jsp");
		}else {
			
			PrintWriter pww = response.getWriter();
			pww.println("Please enter correct userid and password");
			
			
		}
		
	}

	

}
