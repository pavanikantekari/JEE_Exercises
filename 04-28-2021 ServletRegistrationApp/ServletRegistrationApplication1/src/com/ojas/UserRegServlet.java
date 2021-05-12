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
import com.ojas.model.Persons;
@WebServlet("/UserRegServlet")
public class UserRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PersonDao personDao;

	public UserRegServlet() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {
		personDao = new PersonDao();
	}

	public void destroy() {

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String ename = request.getParameter("pname");
		String contactno = request.getParameter("contactno");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		Persons p = new Persons();
		p.setEname(ename);
		p.setContactno(contactno);
		p.setEmail(email);
		p.setGender(gender);
		p.setAddress(address);

		if (personDao.addPerson(p)) {
			pw.println("<h1 stye=background-color:maroon>Registration done</h1>");
		} else {
			pw.println("<h1 stye=background-color:maroon>Try again</h1>");
		}
	}
}
