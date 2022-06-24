package com.BikkadIt.phoneBook.serviceI;

import java.util.List;
import java.util.Optional;

import com.BikkadIt.phoneBook.Model.Contact;

public interface PhoneBookService {
	
	boolean saveContact(Contact contact);
	List<Contact> viewContacts();
	Optional<Contact>  viewByid(Integer id);
	
	boolean deleteById(Integer id);
	String deletecontact(Contact contact);
	String updateContact(Contact contact);

}
