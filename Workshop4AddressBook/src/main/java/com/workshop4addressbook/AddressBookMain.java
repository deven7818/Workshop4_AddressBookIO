package com.workshop4addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Address book System :");

		List<Person> person = new ArrayList<Person>();

		Person newPerson = new Person("Deven", "Mali", "On nagar", "Dhule", "Maharastra", "424005", "9405828376",
				"deven@gmail.com");
		/*
		 * adding contact to list
		 */
		person.add(newPerson);
		/**
		 * Printing the person Information
		 */
		System.out.println(person);

		AddNewContact addNew = new AddNewContact();
		addNew.addContact(person);
		System.out.println(person);
	}

}
