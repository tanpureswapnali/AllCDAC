package org.fi.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RetrvCookie")
public class RetrvCookie extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Cookie[] arrCookies = request.getCookies();
		if(arrCookies!=null) {
			for(Cookie objCookie :arrCookies) {
				out.println("<br/>Name: "+objCookie.getName());
				out.println("<br/>Value: "+objCookie.getValue());
				out.println("<br/>Max Age: "+objCookie.getMaxAge());
				out.println("<br/>Domain: "+objCookie.getDomain());
				out.println("<br/>Path: "+objCookie.getPath());
				out.println("<br/>Comment: "+objCookie.getComment());
				out.println("<hr/>");
				
			}
		}
		else 
			out.println("No Cookie sent by client browser");
		
		
	}

	

}
