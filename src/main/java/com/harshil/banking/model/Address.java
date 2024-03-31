package com.harshil.banking.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address{
	private String line1;
	private String line2;
	private String city;
	private String province;
	private String postalCode;
}