package com.ojas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextExample2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContextExample2() {
		super();

	}
	ServletContext context = null;
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h3 style = color:red> Gold Rate: " + context.getAttribute("goldrate")+"</h3>");
	}

}
