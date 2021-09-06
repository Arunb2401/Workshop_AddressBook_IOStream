package com.wokshop.iostreams;

import java.util.Scanner;

public class AddressBookMain {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	long phoneNumber;
	String email;
	long zipcode;

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws Exception {
		System.out.println(" <<<< Welcome to Address Book Program >>>>\n ");
		System.out.println("\n <<< Add the Contact Details first >>>");
		AddressBookOperations addressBookOperationobj = new AddressBookOperations();
		addressBookOperationobj.addContatcs();
		System.out.println("\n 1.Edit the Contact details \n 2.Delete the Contact details");
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			addressBookOperationobj.updateDetails();
			break;
		case 2:
			addressBookOperationobj.deleteContact();
			break;
		}

		ReadJSON ReadJSONobj = new ReadJSON();
		ReadJSONobj.readJson();
		ReadJSONobj.JavaIOWrite();

		ReadCSV ReadCSVobj = new ReadCSV();
		ReadCSVobj.readcsv();
	}
}
