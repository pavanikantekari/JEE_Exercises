package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.dao.PersonDao;

@WebServlet("/DelServlet")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int value = Integer.parseInt(request.getParameter("no"));
		PersonDao persondao = new PersonDao();
		if (persondao.deletePerson(value)) {
			response.sendRedirect("./ListPerson");

		} else {
			pw.println("<h2 style=color:red> deleted sucessfully </h2>");
		}
	}

}