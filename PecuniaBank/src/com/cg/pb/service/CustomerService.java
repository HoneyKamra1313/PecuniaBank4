package com.cg.pb.service;

import com.cg.pb.bean.*;

public interface CustomerService {
	public void addCustomerDetails(Customer customer,Address address);
	public boolean updateCustomerName(Account account,Customer customer);
	public boolean updateCustomerContact(Account account,Customer customer);
	public boolean updateCustomerAddress(Account account,Address address);

}
