package org.fi.boot.rest.bootresthiber.dao;

import org.fi.boot.rest.bootresthiber.dto.UserDTO;

public interface UserDAO {
	public boolean authenticateuser(String userName,String password);
	public void createUser(UserDTO objUser);

}
