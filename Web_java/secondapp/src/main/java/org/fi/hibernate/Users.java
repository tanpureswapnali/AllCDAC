package org.fi.hibernate;
import javax.persistence.*;


@Entity
@Table(name="user1")
  /*@NamedQueries({
	
	@NamedQuery(name="userDetailsByUsername",query="select OBJECT(objUser) from Users objUser where objUser.userName=?1"),
  
	 @NamedQuery(name="alluser",query="select OBJECT(objUser) from Users objUser")
})
@NamedNativeQueries({
	@NamedNativeQuery(name="usersByCity",query="select * From user1 where city like :cityname")


})

*/


public class Users 
{
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
	public Users() {
		
	}
	

public Users(String userName, String password,String name, String email, String city)
{
	super();
	this.userName=userName;
	this.password=password;
	this.name=name;
	this.email=email;
	this.city=city;
	
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
public String toString() {
	return "Users[userName=" +userName+" , password=" +password+" , name=" +name+", email=" +email+", city=" +city+ "]";
    }
}