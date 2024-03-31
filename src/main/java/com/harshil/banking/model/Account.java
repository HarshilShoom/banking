package com.harshil.banking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account{
	private String number;
	private String holderName;
	private Address holderAddress;
	private double balance;
	private String pin;
}