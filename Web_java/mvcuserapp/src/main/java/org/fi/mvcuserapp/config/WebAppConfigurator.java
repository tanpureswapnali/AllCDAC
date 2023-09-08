package org.fi.mvcuserapp.config;

import org.fi.mvcuserapp.dao.CategoryDAO;
import org.fi.mvcuserapp.dao.CategoryDAOImpl;
import org.fi.mvcuserapp.dao.UserDAO;
import org.fi.mvcuserapp.dao.UserDAOImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@org.springframework.context.annotation.Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"org.fi.mvcuserapp.controllers"})
public class WebAppConfigurator {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		 return viewResolver;
	}

	@Bean
	public Configuration configuration() {
		Configuration hibernateConfiguration =new Configuration();
		hibernateConfiguration.configure("hibernate.cfg.xml");
		return hibernateConfiguration;
	}
	
	@Bean
	public SessionFactory hibernateFactory(Configuration configuration)
	{
		return configuration.buildSessionFactory();
	}
	
	@Bean
	public UserDAO userDao() {
		{
			return new UserDAOImpl();
		}
	}
	
}
