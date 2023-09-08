package org.fi.mvcuserapp.dao;

import org.fi.mvcuserapp.beans.Category;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class CategoryDAOImpl implements CategoryDAO {
       
	@Autowired
	SessionFactory hibernateFactory;
	
	
	@Override
	public boolean addCategory(Category objCat)
	 {
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			hibernateSession.beginTransaction();
			hibernateSession.save(objCat);
			hibernateSession.getTransaction().commit();
			return true;
		}catch(HibernateException he) {
			he.printStackTrace();
		}
	
		return false;
	}

}
