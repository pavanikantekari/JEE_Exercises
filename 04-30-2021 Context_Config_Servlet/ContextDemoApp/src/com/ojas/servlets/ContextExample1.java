package com.ojas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextExample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContextExample1() {
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
		context.setAttribute("goldrate", "45000.00");
		pw.println("<h3 style = color:green> Gold Rate: " + context.getAttribute("goldrate"));
		pw.println("Servlet Version = " + context.getMajorVersion() + "." + context.getMajorVersion() + "</h3>");
	}

}
