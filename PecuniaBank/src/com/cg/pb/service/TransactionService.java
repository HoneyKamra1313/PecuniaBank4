package com.cg.pb.service;

public interface TransactionService {
	void creditUsingSlip(double amount);
	void debitUsingSlip(double amount);
    void creditUsingCheque();
	void debitUsingCheque();
}
