package com.redhat.aml.model;
import javax.xml.bind.annotation.XmlRootElement;


public class Transaction {
	String accountNo;
	int amount;
	int averageDailyDebit;
	int averageDailyDeposit;
	int averageDailytransfers;
	int averageIncomeYearly;
	int averageWeeklyDeposit;
	String country;
	String deviceType;
	String firstName;
	String fromZipCode;
	String ipAddress;
	String lastName;
	String notes;
	String state;
	Boolean status;
	String toZipCode;
	String transactionID;
	int transactionScore;
	String transactionType;
	public Transaction(String accountNo, int amount, int averageDailyDebit,
			int averageDailyDeposit, int averageDailytransfers,
			int averageIncomeYearly, int averageWeeklyDeposit, String country,
			String deviceType, String firstName, String fromZipCode,
			String ipAddress, String lastName, String notes, String state,
			Boolean status, String toZipCode, String transactionID,
			int transactionScore, String transactionType) {
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAverageDailyDebit() {
		return averageDailyDebit;
	}
	public void setAverageDailyDebit(int averageDailyDebit) {
		this.averageDailyDebit = averageDailyDebit;
	}
	public int getAverageDailyDeposit() {
		return averageDailyDeposit;
	}
	public void setAverageDailyDeposit(int averageDailyDeposit) {
		this.averageDailyDeposit = averageDailyDeposit;
	}
	public int getAverageDailytransfers() {
		return averageDailytransfers;
	}
	public void setAverageDailytransfers(int averageDailytransfers) {
		this.averageDailytransfers = averageDailytransfers;
	}
	public int getAverageIncomeYearly() {
		return averageIncomeYearly;
	}
	public void setAverageIncomeYearly(int averageIncomeYearly) {
		this.averageIncomeYearly = averageIncomeYearly;
	}
	public int getAverageWeeklyDeposit() {
		return averageWeeklyDeposit;
	}
	public void setAverageWeeklyDeposit(int averageWeeklyDeposit) {
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
	public int getTransactionScore() {
		return transactionScore;
	}
	public void setTransactionScore(int transactionScore) {
		this.transactionScore = transactionScore;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
}
