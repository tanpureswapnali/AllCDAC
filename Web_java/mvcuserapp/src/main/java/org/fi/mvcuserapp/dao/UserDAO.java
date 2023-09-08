package org.fi.mvcuserapp.dao;

import org.fi.mvcuserapp.beans.User;

public interface UserDAO {
	public boolean authenticate(String userName, String password);
	public boolean newUser(User objUser);

}
