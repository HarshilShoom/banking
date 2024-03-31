package com.harshil.banking.service;

import com.harshil.banking.controller.IAccountService;
import com.harshil.banking.model.*;

public class AccountService implements IAccountService{

	protected Account account;
	
	public void createAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public double getBalance() {
		return account.getBalance();
	}

	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
	}

	@Override
	public void withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
	}
}