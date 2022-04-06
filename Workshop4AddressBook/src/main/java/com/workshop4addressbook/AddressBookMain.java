package com.workshop4addressbook;

import java.util.Scanner;


/**
 * 1. Create address book system to add new person 
 * 2. Edit person in address book
 * 3. Display Contacts in Address book
 * 4. Delete person in address book
 * 5. Add Multiple person in address book
 *
 */
public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address book System :");
		Scanner sc = new Scanner(System.in);
		AddressBookService address = new AddressBookService();
		address.addMultipleContact();
		address.addContact();

		while (true) {
			System.out.println("Enter your choice \n "
									+ "1.Add new Person \n "
									+ "2.Edit  \n "
									+ "3.Display \n "
									+ "4.Delete Person"
									+ "5. close");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the contact detais to add in the Address Book: ");
				address.addContact();

				break;
			case 2:
				System.out.println("Enter pserson details to edit");
				address.editPersonInfo();
			case 3:
				System.out.println("The list of persons in addressbook");
				address.displayPersonInfo();

			case 4:
				System.out.println("The list of persons in addressbook");
				address.deleteContat();

			case 5:
				System.out.println("Exit");
				sc.close();
				return;
			}
		}
	}

}
