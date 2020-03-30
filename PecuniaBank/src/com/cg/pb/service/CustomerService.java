package com.cg.pb.service;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Customer;

public interface CustomerService {
	public void addCustomerDetails(Customer customer);
	public boolean updateCustomer(Account account,Customer customer);
	public String deleteCustomer();
	public Customer getCustomer();

}
