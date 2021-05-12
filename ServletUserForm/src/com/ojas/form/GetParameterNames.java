package com.ojas.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetParameterNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Enumeration<String> e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String fname = e.nextElement();
			String value = request.getParameter(fname);
			pw.println(fname+"="+value+"<br>");
		}
	}

}
