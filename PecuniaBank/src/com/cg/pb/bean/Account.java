package com.cg.pb.bean;

public class Account {
	private String accountId;
	private Customer customer;
	
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
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customer=" + customer + "]";
	}
	
	
}
