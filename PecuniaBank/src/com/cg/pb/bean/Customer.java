package com.cg.pb.bean;

public class Customer {
	private String name; 
	public double contact;
	private double aadhar;
	private String DOB;
	private String PAN;
	private String gender;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	public double getAadhar() {
		return aadhar;
	}
	public void setAadhar(double aadhar) {
		this.aadhar = aadhar;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", aadhar=" + aadhar + ", DOB=" + DOB + ", PAN="
				+ PAN + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
