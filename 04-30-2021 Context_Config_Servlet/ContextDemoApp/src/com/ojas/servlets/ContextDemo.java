package com.ojas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext ctx = null;

	public ContextDemo() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {

		ctx = config.getServletContext();
	}

	public void destroy() {

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String driver = ctx.getInitParameter("driver");
		String url = ctx.getInitParameter("url");
		String user = ctx.getInitParameter("user");
		String password = ctx.getInitParameter("password");
		pw.println("<h3> style= color:blue> Driver Name :" + driver + "<br>");
		pw.println("Url = " + url + "<br>");
		pw.println("User Name = " + password + "<h3></h3>");
	}

}
