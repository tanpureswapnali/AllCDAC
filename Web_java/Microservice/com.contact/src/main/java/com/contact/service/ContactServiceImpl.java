package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list=List.of(
			new Contact(1001L,"Sumit.ama@gmail.com","ssk",101L),
			new Contact(1002L,"Atu.ama@gmail.com","Atul",102L),
			new Contact(1003L,"sg@gmail.com","snehal",103L),
			new Contact(1004L,"Swap@gmail.com","swap",104L)
			
			);
	
	
	
	
	
	@Override
	public List<Contact> getContactsofUser(Long userId) {
		
		return list.stream().filter(contact ->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
	
	
	
	

}
