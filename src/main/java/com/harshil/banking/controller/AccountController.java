package com.harshil.banking.controller;

import com.harshil.banking.model.Account;
import com.harshil.banking.service.AccountService;

public class AccountController{
	protected AccountService accountService;
	
	public AccountController() {
		accountService = new AccountService();
	}
	
	public void createAccount(Account account) {
		this.accountService.createAccount(account);
	}
	
	public double getBalance() {
		return accountService.getBalance();
	}

	public void deposit(double amount) {
		accountService.deposit(amount);
	}

	public void withdraw(double amount) {
		accountService.withdraw(amount);
	}
}