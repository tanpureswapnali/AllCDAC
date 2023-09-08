package org.fi.servlets;

import java.io.IOException;
import org.fi.hibernate.entity.Products;
import org.fi.hibernate.entity.ProductPrimaryKey;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 101,urlPatterns= {"/AddProduct"})
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
        SessionFactory hibernateFactory;
        public void init(ServletConfig config) throws ServletException{
        	super.init(config);
        	hibernateFactory= (SessionFactory)getServletContext().getAttribute("hibernateFacteory");
        }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tmp = request.getParameter("categoryId");
		int categoryId=Integer.parseInt(tmp);
		
		tmp=request.getParameter("productId");
		int productId= Integer.parseInt(tmp);
				
		String productName= request.getParameter("productName");
		String productDescription = request.getParameter("productDescription");
		String productImageUrl=request.getParameter("productImageUrl");
		tmp=request.getParameter("productPrice");
		float productPrice= Float.parseFloat(tmp);
		
		ProductPrimaryKey pid=new ProductPrimaryKey(categoryId, productId);
		
		Products objProduct=new Products(pid,productName,productDescription,productPrice,productImageUrl);
		 
		
		
		try (Session hibernateSession =hibernateFactory.openSession())
		{
			
			
			
			hibernateSession.beginTransaction();
			hibernateSession.save(objProduct);
			
			hibernateSession.getTransaction().commit();
			
		}
		
				
		
		
		
		
	}

}
