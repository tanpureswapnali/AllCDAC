package org.fi.spring.rest.firstrestapp.controllers;

import org.fi.spring.rest.firstrestapp.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@PostMapping("/authenticate")
	public boolean authenticate(@RequestParam("userName")String userName,@RequestParam("password")String password)
	{
		if(userName.equals("swap")&& password.equals("swap@123"))
			return true;
		else
			return false;
	}
	
	@PostMapping("/authenticateUser")
	public UserDTO authenticateUser(@RequestParam("userName")String userName,@RequestParam("password")String password)
	{
		if(userName.equals("swap")&& password.equals("swap@123"))
		{
			UserDTO dto = new UserDTO();
			dto.setUserName(userName);
			dto.setPassword(password);
			dto.setName("swapnali");
			dto.setEmail("swap@gmail.com");
			dto.setCity("shirdi");
			return dto;
		}
		else
			return null;
	}
	@PostMapping("/authenticateRequest")
	public UserDTO authenticateRequest(@RequestBody UserDTO user)
	{
		UserDTO returnDTO =new UserDTO();
		returnDTO.setUserName(user.getUserName().toUpperCase());
		returnDTO.setPassword(user.getPassword().toUpperCase());
		returnDTO.setName(user.getName().toUpperCase());
		returnDTO.setEmail(user.getEmail().toUpperCase());
		returnDTO.setCity(user.getCity().toUpperCase());
		return returnDTO;
		
		
	}

}
