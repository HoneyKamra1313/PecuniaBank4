package com.cg.pb.bean;

public class Account {
	private String accountId;
	private Customer customer;
	private Address address;
	private Double accNo;
	private int balance;
	private int amount;
    private int chequeNum;
	private int ifsc;
	private String bankname;
	private String checkIssueDate;
	
	public String getAccountId() {
		return accountId; 
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Double getAccNo() {
		return accNo;
	}
	public void setAccNo(Double accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getChequeNum() {
		return chequeNum;
	}
	public void setChequeNum(int chequeNum) {
		this.chequeNum = chequeNum;
	}
	public int getIfsc() {
		return ifsc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getCheckIssueDate() {
		return checkIssueDate;
	}
	public void setCheckIssueDate(String checkIssueDate) {
		this.checkIssueDate = checkIssueDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", \ncustomer=" + customer + ",\naddress=" + address + ",\naccNo="
				+ accNo + ", balance=" + balance + ", amount=" + amount + ", chequeNum=" + chequeNum + ", ifsc=" + ifsc
				+ ", bankname=" + bankname + ", checkIssueDate=" + checkIssueDate + "]";
	}
	
	
}
