package com.BikkadIt.phoneBook.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.phoneBook.Model.Contact;
import com.BikkadIt.phoneBook.ServiceIMPL.PhoneBookServiceIMPL;


@RestController
public class PhoneBookController {
	
	@Autowired
	private PhoneBookServiceIMPL phoneBookServiceIMPL;
	
	@PostMapping(value = "/saveContact" ,consumes = "application/json")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		
		System.out.println(contact);
		
		boolean saveContact = phoneBookServiceIMPL.saveContact(contact);
		
		if(saveContact) {
			return new ResponseEntity<String>("Contact saved Sucessfully", HttpStatus.CREATED);
			
		}else {
			return new ResponseEntity<String>("Contact  Not saved", HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	@GetMapping(value = "/viewContact")
	public ResponseEntity<List<Contact>> viewContact(){
		
		List<Contact> viewContacts = phoneBookServiceIMPL.viewContacts();
		
		if(viewContacts!=null) {
			return new ResponseEntity<List<Contact>>(viewContacts, HttpStatus.OK);
		}else
		{
			String msg="Data Not found";
		return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
	
	@GetMapping(value = "/contactByid/{id}")
	public ResponseEntity<Optional<Contact>> viewContactByID(@PathVariable Integer id){
		
		Optional<Contact> viewByid = phoneBookServiceIMPL.viewByid(id);
		
		return new ResponseEntity<Optional<Contact>>(viewByid, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = "/deleteByID/{id}")
	public ResponseEntity<String> deleteContactById(@PathVariable Integer id){
		
		String deleteById = phoneBookServiceIMPL.deleteById(id);
		
		return new ResponseEntity<String>(deleteById, HttpStatus.OK);
	}

	
	@DeleteMapping(value = "/deleteContact")
	public ResponseEntity<String> deleteContact(@RequestBody Contact contact){
		 String deletecontact = phoneBookServiceIMPL.deletecontact(contact);
		
		 return new ResponseEntity<String>(deletecontact, HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateContact")
	public ResponseEntity<String> upadteContact(@RequestBody Contact contact){
		
		String updateContact = phoneBookServiceIMPL.updateContact(contact);
		
		 return new ResponseEntity<String>(updateContact, HttpStatus.OK);
		
	}
}
