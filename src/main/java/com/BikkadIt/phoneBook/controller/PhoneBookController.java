package com.BikkadIt.phoneBook.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.phoneBook.Model.Contact;
import com.BikkadIt.phoneBook.ServiceIMPL.PhoneBookServiceIMPL;
import com.BikkadIt.phoneBook.serviceI.PhoneBookService;

@RestController
public class PhoneBookController {
	
	@Autowired
	private PhoneBookServiceIMPL phoneBookServiceIMPL;
	
	
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		
		boolean saveContact = phoneBookServiceIMPL.saveContact(contact);
		
		if(saveContact) {
			return new ResponseEntity<String>("Contact saved Sucessfully", HttpStatus.CREATED);
			
		}else {
			return new ResponseEntity<String>("Contact  Not saved", HttpStatus.BAD_REQUEST);
		}
		
		
	}

}
