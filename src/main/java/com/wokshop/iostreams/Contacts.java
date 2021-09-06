package com.wokshop.iostreams;

public class Contacts {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	long phoneNumber;
	String email;
	long zipcode;
	
	Contacts(String firstname,String lastname, String address, String city, String state, long phoneNumber, String email, long zipcode){
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.zipcode = zipcode;
	}
}
