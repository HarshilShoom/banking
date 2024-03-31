package com.harshil.banking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingsAccount extends Account{
	private double minBalance;
}