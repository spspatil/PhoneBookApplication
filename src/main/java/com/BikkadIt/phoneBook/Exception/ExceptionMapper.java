package com.BikkadIt.phoneBook.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionMapper {
	
	@ExceptionHandler(value = DataNotFound.class)
	public ResponseEntity<ExceptionMessage> handleDatanotfound(DataNotFound dataNotFound){
		
		ExceptionMessage eMessage=new ExceptionMessage();
		
		eMessage.setErrorCode("PHN001");
		eMessage.setMessage(dataNotFound.getMessage());
		eMessage.setDate(new Date());
		
		return new ResponseEntity<ExceptionMessage>(eMessage,HttpStatus.NOT_FOUND);
		
	}

}
