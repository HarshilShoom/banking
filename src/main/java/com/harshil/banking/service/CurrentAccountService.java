package com.harshil.banking.service;

import com.harshil.banking.model.CurrentAccount;

public class CurrentAccountService extends AccountService{
	@Override
	public void withdraw(double amount) {
		double balance = super.getBalance() + ((CurrentAccount)super.account).getOverDraft();
		if(balance < amount) {
			return;
		}
		super.withdraw(amount);
	}
}