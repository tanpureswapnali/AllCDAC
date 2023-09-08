package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImpl implements UserService{


	List<User> list=List.of( 
			new User(101L,"Sumit Kumar","99872657"),
			new User(102L,"Atul Raj","9988678768"),
			new User(103L,"Swapnali","9988697768"),
			new User(104L,"Ashu","9965468768")
            );
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user ->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
