package com.SpringBoot.crm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.crm.data.repository.ContactRepository;
import com.SpringBoot.crm.domain.Contact;
import com.SpringBoot.crm.model.ContactUser;

@RestController
@RequestMapping("/user")
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepo;
	
	@PostMapping
	public ContactUser create(@RequestBody ContactUser contactUser) {
		Contact contact= new Contact();
		contact.setFullName(contactUser.getFullName());
		contact.setGender(contactUser.getGender());
		contact=contactRepo.save(contact);
		return contactUser;
	}
	
	@GetMapping("{/contactId}")
	public ContactUser getUser(@PathVariable Integer contactId) {
		Optional<Contact> cnt= contactRepo.findById(contactId);
		ContactUser contactUser=new ContactUser(cnt.get().getContactId());
		contactUser.setFullName(cnt.get().getFullName());
		contactUser.setGender(cnt.get().getGender());
		
		return contactUser;
	}
	
	@DeleteMapping("{/contactId}")
	public String deleteUser(@PathVariable Integer contactId) {
		contactRepo.deleteById(contactId);
		return "User deleted with id: "+contactId;
	}
	
	@PutMapping("{/contactId}")
	public ContactUser updateUser(@RequestBody ContactUser contactUser) {
		Optional<Contact> cnt=contactRepo.findById(contactUser.getContactId());
		Contact contact=cnt.get();		
		contact.setFullName(contactUser.getFullName());
		contact.setGender(contactUser.getGender());
		contact=contactRepo.save(contact);
		
		return contactUser;
	}
	
	@GetMapping("/specific/{gender}")
	public List<ContactUser> getUser(@PathVariable("gender")String gender){
		List<ContactUser> femaleUsers=contactRepo.returnUserByGender(gender);
		return femaleUsers;
	}
	
}
