package org.fi;

import org.fi.spring.Users;
import org.fi.spring.config.AppConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfiguration.class)) 
		{
			Users objUser=(Users)applicationContext.getBean("objUser");
			System.out.println(objUser);
		}catch(BeansException e) {
			e.printStackTrace();
		}
	
	
	}

}
