package com.cg.pb.bean;

public class Customer {
	private String name;
	private String aadhar;
	private String DOB;
	private String PAN;
	private String gender;
	private String addressLine1;
	private String addressLine2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
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
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", aadhar=" + aadhar + ", DOB=" + DOB + ", PAN=" + PAN + ", gender=" + gender
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + "]";
	}
	
	
	
}
