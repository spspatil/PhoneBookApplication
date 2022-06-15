package com.BikkadIt.phoneBook.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.phoneBook.Model.Contact;
import com.BikkadIt.phoneBook.ServiceIMPL.PhoneBookServiceIMPL;
import com.BikkadIt.phoneBook.serviceI.PhoneBookService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
public class PhoneBookController {
	
	@Autowired
	private PhoneBookServiceIMPL phoneBookServiceIMPL;
	
	@PostMapping(value = "/saveContact" ,consumes = "application/json")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		
		boolean saveContact = phoneBookServiceIMPL.saveContact(contact);
		
		if(saveContact) {
			return new ResponseEntity<String>("Contact saved Sucessfully", HttpStatus.CREATED);
			
		}else {
			return new ResponseEntity<String>("Contact  Not saved", HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	@GetMapping(value = "/viewContact" ,consumes = "application/json")
	public ResponseEntity<List<Contact>> viewContact(){
		
		List<Contact> viewContacts = phoneBookServiceIMPL.viewContacts();
		
		return new ResponseEntity<List<Contact>>(viewContacts, HttpStatus.OK);
		
	}

}
