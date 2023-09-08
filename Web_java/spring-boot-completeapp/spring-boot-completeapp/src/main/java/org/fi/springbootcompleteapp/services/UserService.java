package org.fi.springbootcompleteapp.services;

import org.fi.springbootcompleteapp.dto.UserDTO;

public interface UserService {
	boolean registerUser(UserDTO userDTO);
	boolean changePassword(String userName, String password);
	UserDTO getUserDetails(String userName);

}
