package com.cg.pb.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public class AccountServiceImplementation implements AccountService{
	 
	CustomerServiceImplementation csi= new CustomerServiceImplementation();
	ArrayList<Account> alacc= new ArrayList<Account>();
//	Account account=new Account();
	@Override
	public void addAccount(Account account, Customer customer, Address address) {
		
		alacc.add(account);
		csi.addCustomerDetails(customer, address);
	}
	@Override 
	public void getAccount(double accNo1) {
		
		alacc.stream().filter(c->c.getAccNo()==accNo1).forEach(System.out::println);		
	
	}
	@Override
	public String deleteAccount(int accNo) {
			if(alacc.removeIf(c -> c.getAccNo()==accNo)) {
				return "Successfully Delete";	
			}
			else{
				return "Account does not exist";
			}
		}		
	
}
