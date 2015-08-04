package com.redhat.antimoneylaundering;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("transactionID")
   private java.lang.String transactionID;
   @org.kie.api.definition.type.Label("accountNo")
   private java.lang.String accountNo;
   @org.kie.api.definition.type.Label("firstName")
   private java.lang.String firstName;
   @org.kie.api.definition.type.Label("lastName")
   private java.lang.String lastName;
   @org.kie.api.definition.type.Label("amount")
   private int amount;
   @org.kie.api.definition.type.Label("transactionType")
   private java.lang.String transactionType;
   @org.kie.api.definition.type.Label("fromZipCode")
   private java.lang.String fromZipCode;
   @org.kie.api.definition.type.Label("toZipCode")
   private java.lang.String toZipCode;
   @org.kie.api.definition.type.Label("ipAddress")
   private java.lang.String ipAddress;
   @org.kie.api.definition.type.Label("deviceType")
   private java.lang.String deviceType;
   @org.kie.api.definition.type.Label("country")
   private java.lang.String country;
   @org.kie.api.definition.type.Label("state")
   private java.lang.String state;
   @org.kie.api.definition.type.Label("averageIncomeYearly")
   private int averageIncomeYearly;
   @org.kie.api.definition.type.Label("averageDailyDeposit")
   private int averageDailyDeposit;
   @org.kie.api.definition.type.Label("averageDailytransfers")
   private int averageDailytransfers;
   @org.kie.api.definition.type.Label("averageDailyDebit")
   private int averageDailyDebit;
   @org.kie.api.definition.type.Label("averageWeeklyDeposit")
   private int averageWeeklyDeposit;
   @org.kie.api.definition.type.Label("transactionScore")
   private int transactionScore;
   @org.kie.api.definition.type.Label("status")
   private boolean status;
   @org.kie.api.definition.type.Label("notes")
   private java.lang.String notes;

   public Transaction()
   {
   }

   public java.lang.String getTransactionID()
   {
      return this.transactionID;
   }

   public void setTransactionID(java.lang.String transactionID)
   {
      this.transactionID = transactionID;
   }

   public java.lang.String getAccountNo()
   {
      return this.accountNo;
   }

   public void setAccountNo(java.lang.String accountNo)
   {
      this.accountNo = accountNo;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.String getTransactionType()
   {
      return this.transactionType;
   }

   public void setTransactionType(java.lang.String transactionType)
   {
      this.transactionType = transactionType;
   }

   public java.lang.String getFromZipCode()
   {
      return this.fromZipCode;
   }

   public void setFromZipCode(java.lang.String fromZipCode)
   {
      this.fromZipCode = fromZipCode;
   }

   public java.lang.String getToZipCode()
   {
      return this.toZipCode;
   }

   public void setToZipCode(java.lang.String toZipCode)
   {
      this.toZipCode = toZipCode;
   }

   public java.lang.String getIpAddress()
   {
      return this.ipAddress;
   }

   public void setIpAddress(java.lang.String ipAddress)
   {
      this.ipAddress = ipAddress;
   }

   public java.lang.String getDeviceType()
   {
      return this.deviceType;
   }

   public void setDeviceType(java.lang.String deviceType)
   {
      this.deviceType = deviceType;
   }

   public java.lang.String getCountry()
   {
      return this.country;
   }

   public void setCountry(java.lang.String country)
   {
      this.country = country;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public boolean isStatus()
   {
      return this.status;
   }

   public void setStatus(boolean status)
   {
      this.status = status;
   }

   public java.lang.String getNotes()
   {
      return this.notes;
   }

   public void setNotes(java.lang.String notes)
   {
      this.notes = notes;
   }

   public int getAmount()
   {
      return this.amount;
   }

   public void setAmount(int amount)
   {
      this.amount = amount;
   }

   public int getAverageDailyDebit()
   {
      return this.averageDailyDebit;
   }

   public void setAverageDailyDebit(int averageDailyDebit)
   {
      this.averageDailyDebit = averageDailyDebit;
   }

   public int getAverageWeeklyDeposit()
   {
      return this.averageWeeklyDeposit;
   }

   public void setAverageWeeklyDeposit(int averageWeeklyDeposit)
   {
      this.averageWeeklyDeposit = averageWeeklyDeposit;
   }

   public int getTransactionScore()
   {
      return this.transactionScore;
   }

   public void setTransactionScore(int transactionScore)
   {
      this.transactionScore = transactionScore;
   }

   public int getAverageIncomeYearly()
   {
      return this.averageIncomeYearly;
   }

   public void setAverageIncomeYearly(int averageIncomeYearly)
   {
      this.averageIncomeYearly = averageIncomeYearly;
   }

   public int getAverageDailyDeposit()
   {
      return this.averageDailyDeposit;
   }

   public void setAverageDailyDeposit(int averageDailyDeposit)
   {
      this.averageDailyDeposit = averageDailyDeposit;
   }

   public int getAverageDailytransfers()
   {
      return this.averageDailytransfers;
   }

   public void setAverageDailytransfers(int averageDailytransfers)
   {
      this.averageDailytransfers = averageDailytransfers;
   }

   public Transaction(java.lang.String transactionID, java.lang.String accountNo,
         java.lang.String firstName, java.lang.String lastName, int amount,
         java.lang.String transactionType, java.lang.String fromZipCode,
         java.lang.String toZipCode, java.lang.String ipAddress,
         java.lang.String deviceType, java.lang.String country,
         java.lang.String state, int averageIncomeYearly,
         int averageDailyDeposit, int averageDailytransfers,
         int averageDailyDebit, int averageWeeklyDeposit, int transactionScore,
         boolean status, java.lang.String notes)
   {
      this.transactionID = transactionID;
      this.accountNo = accountNo;
      this.firstName = firstName;
      this.lastName = lastName;
      this.amount = amount;
      this.transactionType = transactionType;
      this.fromZipCode = fromZipCode;
      this.toZipCode = toZipCode;
      this.ipAddress = ipAddress;
      this.deviceType = deviceType;
      this.country = country;
      this.state = state;
      this.averageIncomeYearly = averageIncomeYearly;
      this.averageDailyDeposit = averageDailyDeposit;
      this.averageDailytransfers = averageDailytransfers;
      this.averageDailyDebit = averageDailyDebit;
      this.averageWeeklyDeposit = averageWeeklyDeposit;
      this.transactionScore = transactionScore;
      this.status = status;
      this.notes = notes;
   }

}