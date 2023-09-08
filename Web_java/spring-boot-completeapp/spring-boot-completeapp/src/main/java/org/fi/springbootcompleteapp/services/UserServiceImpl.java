package org.fi.springbootcompleteapp.services;

import java.util.Optional;

import org.fi.springbootcompleteapp.dto.UserDTO;
import org.fi.springbootcompleteapp.entity.User;
import org.fi.springbootcompleteapp.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
     UserRepository userRepository;
     
     @Autowired
     MailService mailService;
     
	@Override
	public boolean registerUser(UserDTO userDTO) {
	    User userEntity = new User();
	    BeanUtils.copyProperties(userDTO, userEntity);
	    userRepository.save(userEntity);
	    String contents = "<html><body><h3>youe account has been created</h3><br/><br/>";
	    contents="Account details<br/><br/>";
	    contents+="Username :"+userDTO.getUserName();
	    contents+="name:"+userDTO.getName();
	    contents+="Email:"+userDTO.getEmail();
	    
	    mailService.sendMail("cadc-patna@frankelsinfotech.com", userDTO.getEmail(),"Account created", contents);
	    
		return true;
	}

	@Override
	public boolean changePassword(String userName, String password) {
		return userRepository.updatePassword(userName,password);
		
	}

	@Override
	public UserDTO getUserDetails(String userName) {
	  Optional<User> optUser= userRepository.findById(userName);
	  
	  if(optUser.isPresent())
	  {
		  UserDTO dto = new UserDTO();
		  BeanUtils.copyProperties(optUser.get(),dto);
		  return dto;
	  }
		return null;
	}

}
