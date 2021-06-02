package com.hbuddy.beans;

import lombok.Data;

@Data
public class Address {

	private String id;
	private AddressType type;
	private String house;
	private String street;
	private String locality;
	private String city;
	private String pin;

}
