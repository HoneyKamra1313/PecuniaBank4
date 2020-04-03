package com.cg.pb.utilities;

public class Utilities {
	public static boolean nameValidate(String name) {
		String pattern = "[A-Za-z]{3,10}";
		if(name.matches(pattern))
			return true;
		return false;
	}
	public static boolean accIdValidate(String customerID) {
		String pattern = "[0-9]{12}";
		if(customerID.matches(pattern))
			return true;
		return false;
	}
	public static boolean accNoValidate(String customerID) {
		String pattern = "[0-9]{12}";
		if(customerID.matches(pattern))
			return true;
		return false;
	}
	public static boolean contactValidate(String Amount) {
		String pattern = "[0-9]{10}";
		if(Amount.matches(pattern))
			return true;
		return false;
	}
	public static boolean aadharValidate(String Amount) {
		String pattern = "[0-9]{12}";
		if(Amount.matches(pattern))
			return true;
		return false;
	}
	public static boolean panValidate(String Amount) {
		String pattern = "[a-z]{5}[0-9]{6-9}[a-zA-Z]{10}";
		if(Amount.matches(pattern))
			return true;
		return false;
	}
	public static boolean amountValidate(int Amount) {
		if(Amount >= 1000 && Amount <= 100000) return true;
		return false;
	}
	public static boolean optionValidate(String option) {
		String pattern = "[1-4]{1}";
		if(option.matches(pattern)) return true;
		return false;
	}
	public static boolean noOfCustomerValidate(String n) {
		String pattern = "[0-9]{1,2}";
		if(n.matches(pattern)) return true;
		return false;
	}

}
