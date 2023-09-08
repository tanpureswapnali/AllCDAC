package org.fi.spring.MySecondSpringApp.dao;

import java.util.List;

import org.fi.spring.MySecondSpringApp.entity.User;

public interface UserDAO {
	
	public boolean addUser(String userName, String password, String name, String email, String city);
	public List<User> allUser();
	
	public User getUserByUserName(String username);
	public boolean changePassword(String userName,String password);
	public boolean deleteUser(String userName);
	public boolean updateUser(String userName,String password,String name,String email,String city);
	

}
