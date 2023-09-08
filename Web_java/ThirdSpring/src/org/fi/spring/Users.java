package org.fi.spring;

import org.springframework.stereotype.Component;

@Component("objuser")
public class Users {
	String userName="admin";
	 String password="admin@123";
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + "]";
	}
	
	 
	


}
