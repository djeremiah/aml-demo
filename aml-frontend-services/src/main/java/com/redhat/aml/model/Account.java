package com.redhat.aml.model;
//import javax.xml.bind.annotation.XmlRootElement;


public class Account {
	String accountNo;
	String accountType;
	String age;
	String city;
	String firstName;
	String lastName;
	String marritialStatus;
	String occupation;
	String sex;
	String state;
	String street;
	String zipCode;
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
