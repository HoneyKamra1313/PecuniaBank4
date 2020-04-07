package com.cg.pb.service;

import com.cg.pb.bean.Transaction;
import com.cg.pb.dao.TransactionDAOImpl;

public class TransactionServiceImpl implements TransactionService{
	
	TransactionDAOImpl dao = new TransactionDAOImpl();

	@Override
	public void addTransaction(long accNo, Transaction transaction) {
		dao.addTransaction(accNo, transaction);
	}

	@Override
	public void creditUsingSlip(long accNo, double amount) {
		dao.creditUsingSlip(accNo, amount);
	}

	@Override
	public void debitUsingSlip(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditUsingCheque() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debitUsingCheque() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
