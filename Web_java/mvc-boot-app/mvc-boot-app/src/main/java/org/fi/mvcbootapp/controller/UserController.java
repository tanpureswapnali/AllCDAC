package org.fi.mvcbootapp.controller;

import org.fi.mvcbootapp.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
   
	@RequestMapping("/login")
	public void prepareLogin(Model data)
	{
		data.addAttribute("objUser",new User());
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView authenticate(@ModelAttribute("objUser")User objUser)
	{
		if(objUser.getUserName().equals("swapnali") && objUser.getPassword().equals("swap"))
	       return new ModelAndView("welcome","message","you are user");
		else
			return new ModelAndView("failed","message","you are not user");
	
	
	}
}
