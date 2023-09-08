package org.fi.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/AddSession")
public class AddSession extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		session.setAttribute("information","this is the first session object");
		session.setAttribute("userName","swap@123");
		session.setMaxInactiveInterval(20);
		out.println("Session created for this user");
		out.println("<br/>Id :"+session.getId());
		out.println("<br/>Createion Time : "+new Date(session.getCreationTime()));
		out.println("<br/>Last Accessed Time : "+new Date(session.getLastAccessedTime()));
		out.println("<br/>Max Inactive Interval : "+ session.getMaxInactiveInterval());
		
	}

}