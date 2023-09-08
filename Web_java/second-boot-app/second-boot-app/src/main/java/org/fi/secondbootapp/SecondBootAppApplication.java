package org.fi.secondbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondBootAppApplication implements CommandLineRunner{
    
	@Autowired
	ApplicationContext applicationContext;
	public static void main(String[] args) {
		SpringApplication.run(SecondBootAppApplication.class, args);
	}
     
	
	@Override
	public void run(String... args)throws Exception
	{
		User objUser=(User)applicationContext.getBean("objUser");
		objUser.setUserName("swap");
		objUser.setPassword("swap");
		System.out.println("objuser");
		
	}
}
