package org.fi.mvcuserapp.beans;
import javax.persistence.Entity;

import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="user1")
public class User {
	
	@Id
	@Column(name="userName")
	String userName;
	@Column(name="password")
	String password;
	@Column(name="name")
	String name;
	@Column(name="email")
	String email;
	
	@Column(name="city")
	String city;

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
