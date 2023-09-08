package org.fi.springbootcompleteapp.controllers;

import org.fi.springbootcompleteapp.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.persistence.NoResultException;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	SessionFactory hibernateFactory;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/login")
	public void prepareLogin(Model data) {
		data.addAttribute("objUser",new User());
	}
	@RequestMapping("/authenticate")
	public String authenticate(@ModelAttribute("objUser") User objUser)
	{
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			Query<User> query=hibernateSession.getNamedQuery("authenticate");
			
			query.setParameter(1,objUser.getUserName());
			query.setParameter(2,objUser.getPassword());
			User retrvUser= query.getSingleResult();
			session.setAttribute("userName", retrvUser.getUserName());
			 return "forword:category";
		}catch(NoResultException exp) {
			System.out.println(exp);
		}
		return "forword:failed";
	}
	@RequestMapping("/failed")
	public ModelAndView failed() {
		return new ModelAndView("failure","message","Authentication failed");
	}

}
