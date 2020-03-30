package com.cg.pb.pl;

import java.util.Scanner;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Customer;
import com.cg.pb.service.CustomerServiceImplementation;

public class BankDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Customer customer=new Customer();
		Account account=new Account();
		CustomerServiceImplementation csi = new CustomerServiceImplementation();
		while(true) {
			System.out.println("1. add Customer\n"
					+ "2. View Customer\n"
					+ "3. For Update");
			int opt=scr.nextInt();
			switch(opt) {
				case 1:
					System.out.println("Enter Customer Name");
					String name=scr.next();
					System.out.println("Enter Customer Aadhar");
					String aadhar=scr.next();
					System.out.println("Enter Customer DOB");
					String dob=scr.next();
					System.out.println("Enter Customer PAN");
					String pan=scr.next();
					System.out.println("Enter Customer Gender");
					String gender=scr.next();
					System.out.println("Enter Customer Address line 1");
					String address1=scr.next();
					System.out.println("Enter Customer Address line 2");
					String address2=scr.next();
					
					
					customer.setName(name);
					customer.setAadhar(aadhar);
					customer.setDOB(dob);
					customer.setPAN(pan);
					customer.setGender(gender);
					customer.setAddressLine1(address1);
					customer.setAddressLine2(address2);
					csi.addCustomerDetails(customer);
					break;
				case 2:
					csi.getCustomer();
					break;
				case 3:
					System.out.println("Enter Name:");
					String name1=scr.next();
					customer.setName(name1);
					csi.updateCustomer(account, customer);
					}
			
		
	}
	}
}
