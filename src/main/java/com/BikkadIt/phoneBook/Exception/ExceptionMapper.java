package com.BikkadIt.phoneBook.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapper {
	
	@ExceptionHandler(DataNotFound.class)
	public ExceptionMessage handelDatanotfoundException(DataNotFound dataNotFound) {
		
		ExceptionMessage eMessage=new ExceptionMessage();
		
		eMessage.setErrorCode(404);
		eMessage.setMessage("contact data nor found");
		
		return eMessage;
	}

}
