package com.redhat.aml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlRootElement(name = "transaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transaction {

	@XmlElement
	@XmlSchemaType(name = "string")
	String accountNo;
	
	@XmlElement
	@XmlSchemaType(name = "int")
	Integer amount;
	
	@XmlElement
	@XmlSchemaType(name = "int")
	Integer averageDailyDebit;
	
	@XmlElement
	@XmlSchemaType(name = "int")
	Integer averageDailyDeposit;
	
	@XmlElement
	@XmlSchemaType(name = "int")
	Integer averageDailytransfers;
	
	@XmlElement
	@XmlSchemaType(name = "int")
	Integer averageIncomeYearly;
	
	@XmlElement
	@XmlSchemaType(name = "int")
	Integer averageWeeklyDeposit;

	@XmlElement
	@XmlSchemaType(name = "string")
	String country;

	@XmlElement
	@XmlSchemaType(name = "string")
	String deviceType;

	@XmlElement
	@XmlSchemaType(name = "string")
	String firstName;

	@XmlElement
	@XmlSchemaType(name = "string")
	String fromZipCode;

	@XmlElement
	@XmlSchemaType(name = "string")
	String ipAddress;

	@XmlElement
	@XmlSchemaType(name = "string")
	String lastName;

	@XmlElement
	@XmlSchemaType(name = "string")
	String notes;

	@XmlElement
	@XmlSchemaType(name = "string")
	String state;
	
	@XmlElement
	@XmlSchemaType(name = "boolean")
	Boolean status;

	@XmlElement
	@XmlSchemaType(name = "string")
	String toZipCode;

	@XmlElement
	@XmlSchemaType(name = "string")
	String transactionID;
	
	@XmlElement
	@XmlSchemaType(name = "int")
	Integer transactionScore;

	@XmlElement
	@XmlSchemaType(name = "string")
	String transactionType;

	public Transaction() {
	}

	public Transaction(String accountNo, Integer amount,
			Integer averageDailyDebit, Integer averageDailyDeposit,
			Integer averageDailytransfers, Integer averageIncomeYearly,
			Integer averageWeeklyDeposit, String country, String deviceType,
			String firstName, String fromZipCode, String ipAddress,
			String lastName, String notes, String state, Boolean status,
			String toZipCode, String transactionID, Integer transactionScore,
			String transactionType) {
		super();
		this.accountNo = accountNo;
		this.amount = amount;
		this.averageDailyDebit = averageDailyDebit;
		this.averageDailyDeposit = averageDailyDeposit;
		this.averageDailytransfers = averageDailytransfers;
		this.averageIncomeYearly = averageIncomeYearly;
		this.averageWeeklyDeposit = averageWeeklyDeposit;
		this.country = country;
		this.deviceType = deviceType;
		this.firstName = firstName;
		this.fromZipCode = fromZipCode;
		this.ipAddress = ipAddress;
		this.lastName = lastName;
		this.notes = notes;
		this.state = state;
		this.status = status;
		this.toZipCode = toZipCode;
		this.transactionID = transactionID;
		this.transactionScore = transactionScore;
		this.transactionType = transactionType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getAverageDailyDebit() {
		return averageDailyDebit;
	}

	public void setAverageDailyDebit(Integer averageDailyDebit) {
		this.averageDailyDebit = averageDailyDebit;
	}

	public Integer getAverageDailyDeposit() {
		return averageDailyDeposit;
	}

	public void setAverageDailyDeposit(Integer averageDailyDeposit) {
		this.averageDailyDeposit = averageDailyDeposit;
	}

	public Integer getAverageDailytransfers() {
		return averageDailytransfers;
	}

	public void setAverageDailytransfers(Integer averageDailytransfers) {
		this.averageDailytransfers = averageDailytransfers;
	}

	public Integer getAverageIncomeYearly() {
		return averageIncomeYearly;
	}

	public void setAverageIncomeYearly(Integer averageIncomeYearly) {
		this.averageIncomeYearly = averageIncomeYearly;
	}

	public Integer getAverageWeeklyDeposit() {
		return averageWeeklyDeposit;
	}

	public void setAverageWeeklyDeposit(Integer averageWeeklyDeposit) {
		this.averageWeeklyDeposit = averageWeeklyDeposit;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFromZipCode() {
		return fromZipCode;
	}

	public void setFromZipCode(String fromZipCode) {
		this.fromZipCode = fromZipCode;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getToZipCode() {
		return toZipCode;
	}

	public void setToZipCode(String toZipCode) {
		this.toZipCode = toZipCode;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public Integer getTransactionScore() {
		return transactionScore;
	}

	public void setTransactionScore(Integer transactionScore) {
		this.transactionScore = transactionScore;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}
