package com.cg.pb.service;

public interface TransactionService {
	void creditUsingSlip(int amount);
	void debitUsingSlip(int amount);
    void creditUsingCheque();
	void debitUsingCheque();
}
