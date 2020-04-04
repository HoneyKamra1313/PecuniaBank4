package com.cg.pb.service;

import com.cg.pb.bean.*;


public interface AccountService {
	
	public void addAccount(Account account,Customer customer,Address address);
	public void getAccount(double accNo);
	public String deleteAccount(int accNo);

}
