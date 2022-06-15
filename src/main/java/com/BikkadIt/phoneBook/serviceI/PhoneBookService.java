package com.BikkadIt.phoneBook.serviceI;

import java.util.List;

import com.BikkadIt.phoneBook.Model.Contact;

public interface PhoneBookService {
	
	boolean saveContact(Contact contact);
	List<Contact> viewContacts();
	 Contact viewByid(Integer id);

}
