package com.harshil.banking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentAccount extends Account{
	private double overDraft;
}