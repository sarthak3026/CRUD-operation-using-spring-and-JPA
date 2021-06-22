package com.SpringBoot.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Contact")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="contactId")
	Integer contactId;
	
	@Column(name="fullName")
	String fullName;
	@Column(name="gender")
	String gender;
	@Column(name="country")
	String country;
	@Column(name="countryCode")
	String countryCode;
	@Column(name="stateCode")
	String stateCode;
	@Column(name="city")
	String city;
	@Column(name="cityCode")
	String cityCode;
	
	@Column(name="address1")
	String address1;
	@Column(name="address2")
	String address2;
	@Column(name="adress3")
	String adress3;
	@Column(name="zip")
	String zip;
	@Column(name="langCode")
	String langCode;
	@Column(name="lang")
	String lang;
	@Column(name="primaryContact")
	String primaryContact;
	@Column(name="secondaryContact")
	String secondaryContact;
	
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return adress3;
	}
	public void setAddress3(String address3) {
		this.adress3 = address3;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getLangCode() {
		return langCode;
	}
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public String getSecondaryContact() {
		return secondaryContact;
	}
	public void setSecondaryContact(String secondaryContact) {
		this.secondaryContact = secondaryContact;
	}
}
