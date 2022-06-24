package com.BikkadIt.phoneBook.ServiceIMPL;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIt.phoneBook.Model.Contact;
import com.BikkadIt.phoneBook.Repository.ContactRepository;
import com.BikkadIt.phoneBook.serviceI.PhoneBookService;
@Service
public class PhoneBookServiceIMPL implements PhoneBookService{
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		
		Contact save = contactRepository.save(contact);
		
		if (save!=null) {
			return true;
		}else {
			return false;
		}
		
		
	}

	@Override
	public List<Contact> viewContacts() {
		// TODO Auto-generated method stub
		List<Contact> findAll = contactRepository.findAll();
		
		return findAll;
	}

	@Override
	public Optional<Contact> viewByid(Integer id) {
		// TODO Auto-generated method stub
		Optional<Contact> findById = contactRepository.findById(id);
		return findById;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	Optional<Contact> findById = contactRepository.findById(id);
	
	if(findById.isPresent()) {
		
		contactRepository.deleteById(id);
		return true;
	}
		return false;
	}

	@Override
	public String deletecontact(Contact contact) {
		// TODO Auto-generated method stub
		
		contactRepository.delete(contact);
		return "deleted contact";
	}

	@Override
	public String updateContact(Contact contact) {
		// TODO Auto-generated method stub
		
		Contact save = contactRepository.save(contact);
		return "contact upadted";
	}
	
	
	
	

}
