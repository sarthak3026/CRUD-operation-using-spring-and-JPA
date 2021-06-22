package com.SpringBoot.crm.model;

public class ContactUser {
	private String fullName;
	private String gender;
	private Integer contactId;
	
	public ContactUser() {}
	public ContactUser(Integer contactId) {
		this.contactId=contactId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getContactId() {
		return contactId;
	}
	@Override
	public String toString() {
		return "ContactUser [fullName=" + fullName + ", gender=" + gender + ", contactId=" + contactId + "]";
	}
}
