package com.BikkadIt.phoneBook.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONTACT_ID")
	private Integer contact_Id;
	
	@Column(name = "CONTACT_NAME")
	private String contact_Name;
	
	@Column(name = "CONTACT_MAILD")
	private String contact_MailId;
	
	@Column(name = "CONTACT_NUMBER")
	private String contact_Number;
	
	@Column(name = "ACTIVE_SWITCH")
	private Character activeSwitch;
	
	@Override
	public String toString() {
		return "Contact [contact_Id=" + contact_Id + ", contact_Name=" + contact_Name + ", contact_MailId="
				+ contact_MailId + ", contact_Number=" + contact_Number + ", activeSwitch=" + activeSwitch
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public Character getActiveSwitch() {
		return activeSwitch;
	}

	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}

	@CreationTimestamp()
	@Column(name = "CREATED_DATE", updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE" , insertable = false)
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
