package org.fi.mvcbootapp.dao;

import org.fi.mvcbootapp.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.websocket.Session;

@Repository
public class UserDAOImpl implements UserDAO {
	 @Autowired
	    SessionFactory hibernateFactory;
	@Override
	public boolean authenticate(String userName, String password) {
		try(Session hibernateSession=hibernateFactory.openSession())
		{
			User objUser=(User) hibernateSession.load( User.class,userName );
			if(objUser.getPassword().equals(password))
				return true;
			else
				return false;
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean newUser(User objUser) {
		try(Session hibernateSession=hibernateFactory.openSession())
		{
			hibernateSession.beginTransaction();
			hibernateSession.save(objUser);
			hibernateSession.getTransaction().commit();
			return true;
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}
		
	}