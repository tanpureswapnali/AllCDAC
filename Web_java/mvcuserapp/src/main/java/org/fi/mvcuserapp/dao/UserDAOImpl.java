package org.fi.mvcuserapp.dao;

import org.fi.mvcuserapp.beans.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory hibernateFactory;
	@Override
	public boolean authenticate(String userName,String password)
	{
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			User objUser=(User)hibernateSession.load(User.class,userName);
			if(objUser.getPassword().equals(password))
				return true;
			else
				return false;
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean newUser(User objUser) {
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			hibernateSession.beginTransaction();
			hibernateSession.save(objUser);
			hibernateSession.getTransaction().commit();
			return true;
		}catch(HibernateException he) {
			he.printStackTrace();
		}
		return false;
	}

}
