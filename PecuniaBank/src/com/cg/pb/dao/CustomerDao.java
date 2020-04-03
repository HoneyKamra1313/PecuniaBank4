package com.cg.pb.dao;

import com.cg.pb.bean.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer) throws Exception;
	void udpateCustomer();
	void fetchCustomers();
	void deleteCustomer();

}
