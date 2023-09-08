package org.fi.mvc1hiberbootapp.controllers;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	
	@Autowired
	SessionFactory hibernateFactory;
	
	@RequestMapping("/category")
	public ModelAndView showAllCategories()
	{
		try(Session hibernateSession=hibernateFactory.openSession())
		{
			Query query=hibernateSession.getNamedQuery("allCategory");
			List<Category>listCategory=query.getResultList();
			return new ModelAndView("showCategory","data",listCategory);
			
		}
		
	}

}
