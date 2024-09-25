package tryy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/act")
public class Logg extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String u = req.getParameter("username");
		String pw = req.getParameter("password");
		
		if(u.equalsIgnoreCase("mithun")&&(pw.equalsIgnoreCase("mithun"))) {
			res.sendRedirect("labTrack.jsp");
		}
		
		
	}

}
