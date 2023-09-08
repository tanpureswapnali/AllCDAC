package org.fi.mvcuserapp.controllers;

import org.fi.mvcuserapp.beans.Category;
import org.fi.mvcuserapp.dao.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	
	@Autowired
	CategoryDAO  catDAO;
	
	
	@RequestMapping("/addcategory")
	public void newcategory(Model data) {
		data.addAttribute("objCat", new Category());
	}
	
	
	@RequestMapping("/addcategory")
	public String registeraddCategory(@ModelAttribute("objCat")Category objCat)
	{
		boolean added=catDAO.addCategory(objCat);
		if(added)
			return "registred";
		else
			return "Fail";
	}
}
