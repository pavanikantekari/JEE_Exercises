package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		if(uname.equalsIgnoreCase("ojas") && upass.equalsIgnoreCase("java")){
			pw.println("<h1 style=color:green>Valid User</h1>");
		}
		else {
			pw.println("<h1 style=color:red>Invalid User</h1>");
		}
	}

}
