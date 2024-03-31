package com.harshil.banking.service;

import com.harshil.banking.model.SavingsAccount;

public class SavingsAccountService extends AccountService{
	@Override
	public void withdraw(double amount) {
		double balance = super.getBalance() - ((SavingsAccount)super.account).getMinBalance();
		if(balance < amount) {
			return;
		}
		super.withdraw(amount);
	}
}