package org.fi.boot.rest.bootresthiber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="user1")
@NamedQueries({@NamedQuery(name="authenticate",query="select OBJECT(oUser) from User oUser where oUser.userName=?1 and oUser.password=?2")})
public class User {
   
	@Id
	@Column(name="username")
	String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Column(name="city")
	String city;

	public User() {
		
	}

	public User(String userName, String password, String name, String email, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.city = city;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
}
