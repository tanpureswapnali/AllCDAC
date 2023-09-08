package org.fi.mvc1hiberbootapp.controllers;

import java.util.List;

import org.fi.mvc1hiberbootapp.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	SessionFactory  hibernateFactory;
	
	@RequestMapping("/product")
	public ModelAndView showProducts(@RequestParam("categoryId")int categoryId)
	{
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			Query<Product> query = hibernateSession.getNamedQuery("allProducts");
			query.setParameter(1,categoryId);
			List<Product> list=query.getResultList();
			return new ModelAndView("showproducts","data",list);
			
		}
	}

}
