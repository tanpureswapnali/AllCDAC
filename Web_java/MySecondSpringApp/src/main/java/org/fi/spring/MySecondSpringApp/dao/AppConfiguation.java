package org.fi.spring.MySecondSpringApp.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfiguation
{

	@Autowired
	Environment env;
	
	@Bean
	public DataSource dataSource(@Value("${db.url}")String url,
			   @Value("${db.username}")String username,
			   @Value("${db.password}")String password,
			   @Value("${db.driver_class}")String driver_class)
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName(driver_class);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	@Bean
	public UserDAO userDAO() {
		return new UserDAOImpl();
	}
	
	
}
