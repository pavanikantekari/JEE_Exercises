package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaScriptServlet
 */
public class JavaScriptServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JavaScriptServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("s1");
		if (name.equals("Andhrapradesh")) {
			pw.println("<h2 style=color:green>Your select state is : name  </h2><br>");
			pw.println("<h2 style=color:maroon>Capital = Amaravathi</h2>");
		} else if (name.equals("Telangana")) {
			pw.println("<h2 style=color:green>Your select state is :  name  </h2><br>");
			pw.println("<h2 style=color:maroon>Capital = Hyderabad</h2>");
		}
	}

}
