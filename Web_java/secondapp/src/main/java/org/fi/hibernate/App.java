package org.fi.hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Locale.Category;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App 
{   
	public static void main(String[] agrs) {
		Configuration hibernateConfiguration = new Configuration();
		hibernateConfiguration.configure("second-hibernate.cfg.xml");
	 try(SessionFactory hibernateFactory=hibernateConfiguration.buildSessionFactory();
			 Session hibernateSession= hibernateFactory.openSession();
			 Scanner scanner = new Scanner(System.in))
	 {
		 
		/* Users objUsers=new Users("swapnali1","swap","swapna","swap@asw.com","pune");
	           hibernateSession.beginTransaction();
	           hibernateSession.save(objUsers);
	           hibernateSession.getTransaction();
	           System.out.println("Record saved");
	 */
	   // Query queryAllUsers = hibernateSession.createQuery("from Users");
	     
		/* Query queryAllUsers= hibernateSession.createQuery("select OBJECT(objUser)from Users objUser");
		 
		 
		 Iterator<Users> iter=queryAllUsers.getResultList().iterator();
	      while(iter.hasNext())
	      {
	    	  Users objUser=iter.next();
	    	  System.out.println(objUser);
	      }
	      
	      List<Users> list = queryAllUsers.getResultList();
	      for(Users objUser:list) {
	    	  System.out.println(objUser);
	      }
	      */
		/* Query queryNameCity= hibernateSession.createQuery("select objUser.userName,objUser.city from Users objUser");
	          List<Object []> list = queryNameCity.getResultList();
	          for(Object [] data:list) {
	        	  System.out.println("username:"+ data[0]);
	        	  System.out.println("city:"+ data[1]);
               System.out.println("   ");	        	  
	        	  
	          }
	      */
	 
		/* Query queryNameCity= hibernateSession.createQuery("select objUser.name,objUser.city from Users objUser where objUser.userName='swap'");
	            Object [] data=(Object[])queryNameCity.getSingleResult();
	            {
	            	System.out.println("Username: "+data[0]);
	            	System.out.println("Username: "+data[1]);
	            }
	   */
		 
		/* System.out.println("Enter the username to search");
		 String userName= scanner.nextLine();
		 Query queryNameCity= hibernateSession.createQuery("select objUser.name,objUser.city from Users objUser where objUser.userName=:uname");
		 queryNameCity.setParameter("uname", userName);
		   Users data = (Users)queryNameCity.getSingleResult();
		   System.out.println(data);
	 */
		 
		/* System.out.println("Enter the username to search");
		 String userName= scanner.next();
		 Query queryNameCity= hibernateSession.createQuery("select Object(objUser) from Users objUser where objUser.userName=:?1");
		 queryNameCity.setParameter(1, userName);
		   Users data = (Users)queryNameCity.getSingleResult();
		   System.out.println(data);
		 */
		 //NNNNNNNNNNNNaive QQQQuery
		   
		 /* Query query=hibernateSession.createNativeQuery("select * from user1");
		   List<Object[]> list = query.getResultList();
		   for(Object[] data:list) {
			   System.out.println(data[0]);
			   System.out.println(data[1]);
			   System.out.println(data[2]);
			   System.out.println(data[3]);
			   System.out.println(data[4]);
			   
		   
		   }
		   */
		   Query query=hibernateSession.getNamedNativeQuery("allUsers");
		   List<Object[]> list = query.getResultList();
		   for(Object[] data:list) {
			   System.out.println(data[0]);
			   System.out.println(data[1]);
			   System.out.println(data[2]);
			   System.out.println(data[3]);
			   System.out.println(data[4]);
			   
		   
		   }
		 
		 Query city = hibernateSession.getNamedQuery("userByCity");
		 		city.setParameter("cityname","sangmner");
		 		List<Object[]> list1=city.getResultList();
		 		
		      for(Object[] data:list1) {
		    	
		    	  System.out.println(data[0]);
		    	  System.out.println(data[1]);
		    	  System.out.println(data[2]);
		    	  System.out.println(data[3]);
		    	  System.out.println(data[4]);
		    	  
		      }
		 
	 }
	
	
	
	
	}
	
}
