package org.fi.servlets;

import java.io.IOException;
import org.fi.hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CategoryAdd
 */
@WebServlet(loadOnStartup = 100,urlPatterns= {"/AddCategory"})
public class AddCategory extends HttpServlet {
	SessionFactory hibernateFactory;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		Configuration hibernateConfiguration = new Configuration();
		hibernateConfiguration.configure("hibernet.cfg.xml");
		hibernateFactory =hibernateConfiguration.buildSessionFactory();
		ServletContext application = getServletContext();
		application.setAttribute("hibernateFactory",hibernateFactory);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(Session hibernateSession =hibernateFactory.openSession())
		{
		         String categoryName=request.getParameter("categoryName");
		         String categoryDescription=request.getParameter("categoryDescription");
		         String categoryImageUrl = request.getParameter("categoryImageUrl");
		         Category objCategory = new Category(categoryName,categoryDescription,categoryImageUrl);
		         hibernateSession.beginTransaction();
		         hibernateSession.save(objCategory);
		         hibernateSession.getTransaction().commit();
		         response.getWriter().println("Record stored in DB");
		         
		}
	}



		
	

}
