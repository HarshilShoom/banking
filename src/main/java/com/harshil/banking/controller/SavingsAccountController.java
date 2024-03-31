package com.harshil.banking.controller;

import com.harshil.banking.service.SavingsAccountService;

public class SavingsAccountController extends AccountController{
	public SavingsAccountController() {
		super.accountService = new SavingsAccountService();
	}
}