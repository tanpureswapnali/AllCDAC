package org.fi.mvcuserapp.controllers;

import org.fi.mvcuserapp.beans.User;
import org.fi.mvcuserapp.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/login")
	public void prepareLogin(Model data) {
		data.addAttribute("objUser",new User());
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView authenticateUser(@ModelAttribute("objUser")User objUser)
	{
		if(objUser.getUserName().equals("swapnali") && objUser.getPassword().equals("swap"))
			return new ModelAndView("welcome","message","Welcome" + objUser.getUserName()+ ",to the world");
		else 
			return new ModelAndView("failure","message","Authentication failed");
	}
	
	@RequestMapping("/newUser")
	public void prepareNewUser(Model data)
	{
		data.addAttribute("objUser", new User());
	}
	@RequestMapping("/registerUser")
	public String registerNewUser(@ModelAttribute("objUser")User objUser)
	{
		boolean status=userDAO.newUser(objUser);
		if(status)
			return "registred";
		else
			return "Fail";
	}
}
