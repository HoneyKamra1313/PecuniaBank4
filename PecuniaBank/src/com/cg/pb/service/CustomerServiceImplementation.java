package com.cg.pb.service;

import java.util.ArrayList;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Customer;

public class CustomerServiceImplementation implements CustomerService{
	Customer customer=new Customer();
	ArrayList<Customer> al= new ArrayList<Customer>();
	@Override
	public void addCustomerDetails(Customer customer) {
		al.add(customer);
	}

	@Override
	public boolean updateCustomer(Account account,Customer customer) {
		account.setAccountId(account.getAccountId());
		customer.setName(customer.getName());
		return true;

	}

	@Override
	public String deleteCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer() {
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		return null;
		
	}

	

}
