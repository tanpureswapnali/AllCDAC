package org.fi.spring.MySecondSpringApp.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.fi.spring.MySecondSpringApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("userDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Environment env;
	
	RowMapper<User> rowMapper;
	
	String sqlAddUser;
	String sqlDeleteUser;
	String sqlUpdateUser;
	String sqlChangePassword;
	String sqlAllUser;
	String sqlUserByUserName;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
   @PostConstruct
   public void initialize() 
   {
	    sqlAddUser=env.getProperty("sql.addUser");
	    sqlDeleteUser=env.getProperty("sql.deleteUser");
	    sqlUpdateUser=env.getProperty("sql.updateUser");
	    sqlChangePassword=env.getProperty("sql.changePassword");
	    sqlAllUser=env.getProperty("sql.allUser");
	    sqlUserByUserName=env.getProperty("sql.userByUserName");
	    
	    rowMapper=(result,rowNo) ->{
	    	User objUser = new User();
	    	objUser.setUserName(result.getString(1));
	    	objUser.setPassword(result.getString(2));
	    	objUser.setName(result.getString(3));
	    	objUser.setEmail(result.getString(4));
	    	objUser.setCity(result.getString(5));
	    	return objUser;
	    	
	    };
	    
   }
   
   @Override
   public boolean addUser(String userName, String password, String name, String email,String city)
   {
	   int count = jdbcTemplate.update(sqlAddUser,userName,password,name,email,city);
         if(count>0)
        	 return true;
         else 
        	 return false;
     }
   
   @Override
   public List<User> allUser()
   {
	   return jdbcTemplate.query(sqlAllUser,rowMapper);
			   
   }   
   
   @Override
   public User getUserByUserName(String userName) {
	   return jdbcTemplate.queryForObject(sqlUserByUserName, rowMapper,userName);
	  
   }
   
   @Override
   public boolean changePassword(String userName, String password)
   {
	   
	   int count= jdbcTemplate.update(sqlChangePassword,userName,password);
	   if(count>0)
	   return true;
	   else
	    return false;
   }
   
   @Override
   public boolean deleteUser(String userName) {
	   int count = jdbcTemplate.update(sqlDeleteUser,userName);
	   if(count>0)
		   return true;
		   else
		    return false;
	   
   }
   

@Override
   public boolean updateUser(String userName, String password, String name, String email,String city) {
	int count = jdbcTemplate.update(sqlUpdateUser,userName,password,name,email,city);
	if(count>0)
		   return true;
		   else
			return false; }
}

































