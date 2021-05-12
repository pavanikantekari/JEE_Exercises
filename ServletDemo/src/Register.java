

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String Name=request.getParameter("Name");
		int age = Integer.parseInt(request.getParameter("age"));
		if(age > 18) {
			pw.println("<h1>Welcome to fashion show</h1>");
		}
		else 
			pw.println("<h1>Welcome to cartoon show</h1>");
	}

}
