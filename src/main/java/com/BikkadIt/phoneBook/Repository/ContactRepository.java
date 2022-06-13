package com.BikkadIt.phoneBook.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Integer, Serializable>{

	
}
