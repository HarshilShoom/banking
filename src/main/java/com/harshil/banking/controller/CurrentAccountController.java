package com.harshil.banking.controller;

import com.harshil.banking.service.CurrentAccountService;

public class CurrentAccountController extends AccountController{
	public CurrentAccountController() {
		super.accountService = new CurrentAccountService();
	}
}