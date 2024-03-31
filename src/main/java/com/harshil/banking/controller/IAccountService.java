package com.harshil.banking.controller;

public interface IAccountService {
	public double getBalance();
	public void deposit(double amount);
	public void withdraw(double amount);
}
