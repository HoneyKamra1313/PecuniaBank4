package com.cg.pb.bean;

public class Passbook {
	double accNo;
	int startDate;
	int endDate;
	public double getAccNo() {
		return accNo;
	}
	public void setAccNo(double accNo) {
		this.accNo = accNo;
	}
	public long getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public long getEndDate() {
		return endDate;
	}
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}
	public String getPassBook() {
		return "PassBook Printed";	
	}
}
	
	


