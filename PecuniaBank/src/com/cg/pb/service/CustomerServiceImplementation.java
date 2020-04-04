package com.cg.pb.service;

import java.util.ArrayList;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public class CustomerServiceImplementation implements CustomerService{
	Customer customer=new Customer();
	ArrayList<Customer> alc= new ArrayList<Customer>();
	ArrayList<Address> ala= new ArrayList<Address>();

	@Override
	public void addCustomerDetails(Customer customer, Address address) {
		
		alc.add(customer);
		ala.add(address);	
	}

	@Override
	public boolean updateCustomerName(Account account,Customer customer) {
		account.setCustomer(customer);
		return true;

	}
	@Override
	public boolean updateCustomerContact(Account account,Customer customer) {
		account.setAccNo(account.getAccNo());
		customer.setContact(customer.getContact());
		return true;

	}
	@Override
	public boolean updateCustomerAddress(Account account,Address address) {
		account.setAccNo(account.getAccNo());
		return true;

	}

	

	

}
