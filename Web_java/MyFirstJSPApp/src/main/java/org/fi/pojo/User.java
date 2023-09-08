package org.fi.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
	String userName;
	String password;
	String name;
	String email;
	String city;
	public void save() {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		try(
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_ee","root","Swap@123")){
				PreparedStatement psCreateUser = connection.prepareStatement("INSERT INTO user1 (username, password, name, email, city) VALUES (?, ?, ?, ?, ?)");
				
		
				
				psCreateUser.setString(1, userName);
				psCreateUser.setString(2, password);
				psCreateUser.setString(3, name);
				psCreateUser.setString(4, email);
				psCreateUser.setString(5, city);
				
				psCreateUser.executeUpdate();
				
				
	              }catch(SQLException e) {
		               e.printStackTrace();
	                 }
               }catch(ClassNotFoundException e) {
            	   e.printStackTrace();
               }
	
}				
	public String getUserName() {
		return userName;
	}
    public void setUserName(String userName) {
    	this.userName=userName;
    }
    public String getPassword() {
		return password;
	}
    public void setPassword(String password) {
    	this.password=password;
    }
    public String getName() {
		return name;
	}
    public void setName(String name) {
    	this.name=name;
    }
    public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
    	this.email=email;
    }
    public String getCity() {
		return city;
	}
    public void setCity(String city) {
    	this.city=city;
    }
    
}
