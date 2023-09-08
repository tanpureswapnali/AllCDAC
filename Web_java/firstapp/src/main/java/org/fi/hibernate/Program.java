package org.fi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Program {
     public static void main(String[] args) {
    	 Configuration hibernateConfiguration=new Configuration();
    	 hibernateConfiguration.configure("first-hibernate.cfg.xml");
    	 
    	 try(SessionFactory hibernateFactory= hibernateConfiguration.buildSessionFactory();
    			 Session hibernateSession= hibernateFactory.openSession();)
    	 {
    		 Users objUsers =new Users("saisha","sahil","sai","saisha@gmail.com","sangmner");
    		hibernateSession.beginTransaction();
    		hibernateSession.save(objUsers);
    		hibernateSession.getTransaction().commit();
    		System.out.println("Record saved");
    		 
    		 
    		 
    	 }
    	 
    	 
     }
     
}

