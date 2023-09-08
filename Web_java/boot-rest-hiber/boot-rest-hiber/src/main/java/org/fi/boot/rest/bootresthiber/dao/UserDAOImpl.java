package org.fi.boot.rest.bootresthiber.dao;

import org.fi.boot.rest.bootresthiber.dto.UserDTO;
import org.fi.boot.rest.bootresthiber.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDAOImpl implements UserDAO {
 
	@Autowired
	SessionFactory hibernateFactory;
	
	@Override
	public boolean authenticateuser(String userName, String password) {
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			Query<User> query=hibernateSession.getNamedQuery("authenticate");
				query.setParameter(1,userName);
				query.setParameter(2, password);
				query.getSingleResult();
				return true;
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void createUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			User objUser=new User();
			BeanUtils.copyProperties(userDTO, objUser);
			hibernateSession.beginTransaction();
			hibernateSession.save(objUser);
			hibernateSession.getTransaction().commit();
		}

	}

}
