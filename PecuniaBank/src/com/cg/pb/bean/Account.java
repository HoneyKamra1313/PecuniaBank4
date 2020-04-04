package com.cg.pb.bean;

public class Account {
	private String accId;
	private int branchId;
	private String type;
	private double balance;
	private Customer customer;
	private Address address;
	private Double accNo;
	
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Double getAccNo() {
		return accNo;
	}
	public void setAccNo(Double accNo) {
		this.accNo = accNo;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", branchId=" + branchId + ", type=" + type + ", balance=" + balance
				+ ", \ncustomer=" + customer + ", \naddress=" + address + ", \naccNo=" + accNo + "]";
	}

	
}
	
