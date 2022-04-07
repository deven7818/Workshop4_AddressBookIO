package com.workshop4addressbook;

import java.util.Scanner;

/**
 * 1. Create address book system to add new person 
 * 2. Edit person in address book 
 * 3. Display Contacts in Address book 
 * 4. Delete person in address book 
 * 5. Add Multiple person in address book 
 * 6. Refactor to add multiple address Book to the system
 * 7. Ensure there is no Duplicate Entry of the same Person in a particular Address Book
 * 8. search Person in a City or State across the multiple Address Book
 * 9. view Persons by City or State 
 */
public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program...!!!");
		Scanner sc = new Scanner(System.in);
		
		//AddressBookService addNew = new AddressBookService();

		/**
		 * creating object of UniqueMultipleAddressBook for adding Unique name address
		 * book
		 */
		UniqueMultipleAddress unique = new UniqueMultipleAddress();

		while (true) {
			System.out.println("Enter \n    1. Add the new AddressBook \n "
										+  "2. Add new contact \n "
										+  "3. Edit the contact \n "
										+  "4. Delete the contact \n "
										+  "5. Delete the AddressBook \n "
										+  "6. Print the AddressBook \n "
										+  "7. Print the contacts \n "
										+  "8. Search By city \n "
										+  "9. Search By state \n "
										+  "10. View Person By City \n "
										+  "11. view Person By state \n "
										+  "0. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				unique.addAddress();
				break;
			case 2:
				unique.addContact();
				break;

			case 3:
				unique.editContact();
				break;

			case 4:
				unique.deleteContact();
				break;
				
			case 5:
				unique.deleteAddressBook();
				break;
			case 6:
				unique.printBook();
				break;
			case 7:
				unique.printContacts();
				break;
			case 8:
				unique.searchByCity();
				break;
			case 9:
				unique.searchByState();
				break;
			case 10:
				unique.viewPerson(AddressBookService.personByCity);
				break;
			case 11:
				unique.viewPerson(AddressBookService.personByState);
				break;
			case 0:
				System.exit(8);
				break;
			default:
				System.out.println("Wrong Input");
			}
			sc.close();
		}
	}
}