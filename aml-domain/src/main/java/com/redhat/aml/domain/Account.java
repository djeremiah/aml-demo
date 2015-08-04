package com.redhat.aml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlRootElement(name="account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
	
	@XmlElement
	@XmlSchemaType(name="string")
	String accountNo;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String accountType;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String age;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String city;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String firstName;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String lastName;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String marritialStatus;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String occupation;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String sex;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String state;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String street;
	
	@XmlElement
	@XmlSchemaType(name="string")
	String zipCode;

	public Account() {
	}

	public Account(String accountNo, String accountType, String age,
			String city, String firstName, String lastName,
			String marritialStatus, String occupation, String sex,
			String state, String street, String zipCode) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.age = age;
		this.city = city;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marritialStatus = marritialStatus;
		this.occupation = occupation;
		this.sex = sex;
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMarritialStatus() {
		return marritialStatus;
	}

	public void setMarritialStatus(String marritialStatus) {
		this.marritialStatus = marritialStatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
