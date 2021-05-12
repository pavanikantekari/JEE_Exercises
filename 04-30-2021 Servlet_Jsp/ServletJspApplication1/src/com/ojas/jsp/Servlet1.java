package com.ojas.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
	        PrintWriter pw = response.getWriter();
	        String uname=request.getParameter("uname");
	        String upass=request.getParameter("upass");
	        request.setAttribute("username", uname);
	        request.setAttribute("password", upass);
	        RequestDispatcher rd = request.getRequestDispatcher("/LoginServlett2");
	        pw.println("<h3 style=color:blue>From First Servlet</h3>");
	        rd.include(request, response);
	        pw.println("<h4 style=color:green>Date: "+new java.util.Date() +"</h4>");
	}

}
