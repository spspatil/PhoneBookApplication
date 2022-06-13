package com.BikkadIt.phoneBook.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	
	@Id
	private Integer contact_Id;
	
	private String contact_Name;
	
	private String contact_MailId;
	
	private String contact_Number;
	
	private LocalDate createdDate;
	
	private LocalDate updatedDate;

	public Integer getContact_Id() {
		return contact_Id;
	}

	public void setContact_Id(Integer contact_Id) {
		this.contact_Id = contact_Id;
	}

	public String getContact_Name() {
		return contact_Name;
	}

	public void setContact_Name(String contact_Name) {
		this.contact_Name = contact_Name;
	}

	public String getContact_MailId() {
		return contact_MailId;
	}

	public void setContact_MailId(String contact_MailId) {
		this.contact_MailId = contact_MailId;
	}

	public String getContact_Number() {
		return contact_Number;
	}

	public void setContact_Number(String contact_Number) {
		this.contact_Number = contact_Number;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
	

}
