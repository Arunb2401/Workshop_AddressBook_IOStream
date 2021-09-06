package com.wokshop.iostreams;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookOperations {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	long phoneNumber;
	String email;
	long zipcode;
	ArrayList<Contacts> list = new ArrayList<>();
	Contacts data;
	Scanner scan = new Scanner(System.in);

	@SuppressWarnings({ "resource" })
	public void addContatcs() {

		System.out.println("PLEASE ENTER YOUR DETAILS IN THE ADDRESS BOOK");
		System.out.println("How many contacts you want to add: ");
		Scanner userinput = new Scanner(System.in);
		int user = userinput.nextInt();
		for (int i = 0; i < user; i++) {
			getUserDetails();
		}
		System.out.println("\nContacts in the Address Book are: ");
		for (int i = 0; i < user; i++) {
			data = list.get(i);
			System.out.println(data.firstname + " " + data.lastname + " " + data.address + " " + data.city + " "
					+ data.state + " " + data.email + " " + data.zipcode + " " + data.phoneNumber);
		}
	}

	@SuppressWarnings({ "resource", "unused" })
	public void getUserDetails() {

		System.out.println("Enter your First Name: ");
		firstname = scan.nextLine();
		System.out.println("Enter your Last Name: ");
		lastname = scan.nextLine();
		System.out.println("Enter your Address : ");
		address = scan.nextLine();
		System.out.println("Enter your City : ");
		city = scan.nextLine();
		System.out.println("Enter your State : ");
		Scanner State = new Scanner(System.in);
		state = scan.nextLine();
		System.out.println("Enter your Phone Number : ");
		phoneNumber = scan.nextLong();
		System.out.println("Enter your Email Id : ");
		email = scan.next();
		System.out.println("Enter your Zip Code : ");
		zipcode = scan.nextLong();
		list.add(new Contacts(firstname, lastname, address, city, state, phoneNumber, email, zipcode));

	}

	@SuppressWarnings("resource")
	public void deleteContact() {
		System.out.println();
		System.out.println("Enter first name to delete:");
		firstname = scan.next();
		int flag = 0;
		for (int i = 0; i < list.size(); i++) {
			data = list.get(i);
			if (firstname.equals(data.firstname)) {
				list.remove(data);
				flag = 1;
				System.out.println();
				System.out.println("Contact has been deleted...");
			}
		}
		if (flag == 0) {
			System.out.println();
			System.out.println("First name is not found in address book..");
		}
	}

	@SuppressWarnings("resource")
	public void updateDetails() {

		Scanner userChoice = new Scanner(System.in);
		System.out.println("Which details you want to change?");
		System.out.println(
				"PRESS 1 FirstName\nPRESS 2 LastName\nPRESS 3 Address\nPRESS 4 City\nPRESS 5 State\nPRESS 6 Phone Number\nPRESS 7 Email ID\nPRESS 8 ZIPCODE\nIF Done PRESS 9 EXIT");
		Scanner detailsinput = new Scanner(System.in);
		int Choice = detailsinput.nextInt();
		switch (Choice) {
		case 1:
			System.out.println("Edit Firstname: ");
			this.firstname = userChoice.nextLine();
			break;
		case 2:
			System.out.println("EDIT THE LAST NAME TO: ");
			this.lastname = userChoice.nextLine();
			break;
		case 3:
			System.out.println("EDIT THE ADDRESS TO: ");
			this.address = userChoice.nextLine();
			break;
		case 4:
			System.out.println("EDIT THE CITY TO: ");
			this.city = userChoice.nextLine();
			break;
		case 5:
			System.out.println("EDIT THE STATE TO: ");
			this.state = userChoice.nextLine();
			break;
		case 6:
			System.out.println("EDIT THE PHONE NUMBER TO: ");
			this.phoneNumber = userChoice.nextLong();
			break;
		case 7:
			System.out.println("EDIT THE EMAIL TO:");
			this.email = userChoice.nextLine();
			break;
		case 8:
			System.out.println("EDIT THE ZIP CODE TO:");
			this.zipcode = userChoice.nextLong();
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return ("\nFIRST NAME: " + firstname + "\nLAST NAME: " + lastname + "\nADDRESS: " + address + "\nCITY: " + city
				+ "\nSTATE: " + state + "\nPHONE NUMBER: " + phoneNumber + "\nEMAIL ID: " + email + "\nZIP CODE:"
				+ zipcode);
	}

}
