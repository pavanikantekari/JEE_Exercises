package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {

		System.out.println("in it method is called");
	}

	public void destroy() {

		System.out.println("Distroy method is invoked");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1 style=background-color:red;color:white;padding:400px;text-align:center;>"
				+ "Wishing you a Spectacular celebration and a fabulous year ahead "
				+              "HAPPY BIRTHDAY  to the smartest,funniest,melodious and most beautiful girl in the world....."
				+ "                                       "
				+ "Wait......"
				
				+ "did I Say {to} ?" + "            "
				
				+ "I mean {from}."
				
				+ "        " + "M@nY M@nY HaPpY ReTuRn$ Of ThE D@Y LIKITH@</h>");
		pw.close();

	}

}
