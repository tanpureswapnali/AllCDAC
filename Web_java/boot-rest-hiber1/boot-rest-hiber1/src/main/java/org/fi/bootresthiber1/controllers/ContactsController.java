package org.fi.bootresthiber1.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.fi.bootresthiber1.dto.ContactsDTO;
import org.fi.bootresthiber1.entity.Contacts;
import org.fi.bootresthiber1.repository.ContactsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
	
	@Autowired
	ContactsRepository contactsRepository;
	
	@GetMapping("all")
	public Iterator<ContactsDTO> all()
	{
		Iterator<Contacts> iter= contactsRepository.findAll().iterator();
		ArrayList<ContactsDTO> list=new ArrayList<>();
		while(iter.hasNext())
		{
			Contacts objContacts=iter.next();
			ContactsDTO dto=new ContactsDTO();
			BeanUtils.copyProperties(objContacts, dto);
			list.add(dto);
		}
	
	   return list.iterator();
    }
	
	@GetMapping("/deatails/{cid}")
	public ContactsDTO getDetails(@PathVariable("cid") int contactId)
	{
		Optional<Contacts> optional = contactsRepository.findById(contactId);
		   if(optional.isPresent()) {
			   Contacts objContacts=optional.get();
			   ContactsDTO dto=new ContactsDTO();
			   BeanUtils.copyProperties(objContacts, dto);
			   return dto;
		   }
		   
		   return null;
	} 
	
}






