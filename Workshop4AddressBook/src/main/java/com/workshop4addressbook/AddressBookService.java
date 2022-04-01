package com.workshop4addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {
	Scanner sc = new Scanner(System.in);
	List<Person> contacts = new ArrayList<Person>();

	/**
	 * Method to add new contact to Contact list
	 * 
	 * @param person - person details
	 */
	public void addContact() {
		System.out.println("Please Enter the first Name : ");
		String firstName = sc.next();

		System.out.println("Please Enter the last Name : ");
		String lastName = sc.next();

		System.out.println("Please Enter the address : ");
		String address = sc.next();

		System.out.println("Please Enter the city : ");
		String city = sc.next();

		System.out.println("Please Enter the state : ");
		String state = sc.next();

		System.out.println("Please Enter the zip : ");
		String zip = sc.next();

		System.out.println("Please Enter the phone Number : ");
		String phoneNumber = sc.next();

		System.out.println("Please Enter the email : ");
		String email = sc.next();

		Person newPerson = new Person(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contacts.add(newPerson);
	}

	/**
	 * Method to find Contact 1.Find person in address book with first name 2.If
	 * there are multiple persons with same name then find person with email
	 * 
	 * @return - person
	 */
	public Person findPerson() {
		System.out.println("\n Enter the first name of the person to edit: ");
		String name = sc.next();
		int duplicate = 0; // will increment the duplicate if found multiple contacts with same name
		Person temp = null;
		for (Person person : contacts) {
			if (person.getFirstName().equals(name)) {
				duplicate++;
				temp = person;
			}
		}
		if (duplicate == 1) {
			return temp;

		} else if (duplicate > 1) {
			System.out.print(" There are multiple persons with given name.\n Please enter their email id: ");
			String email = sc.next();
			for (Person person : contacts) {
				if (person.getFirstName().equals(name) && person.getEmail().equals(email)) {
					return person;
				}
			}
		} else {
			System.out.println("No contact with the given first name. Please enter the correct first name");
			findPerson();
		}
		return temp;
	}

	/**
	 * Method to edit contact
	 */
	public void editPersonInfo() {

		Person person = findPerson();
		System.out.println("Enter your choice to edit person"
				+ "1.Edit firstName"
				+ "2.Edit LastName"
				+ "3.Edit address"
				+ "4.Edit city"
				+ "5.edit state"
				+ "6.edit zopCode"
				+ "7.Edit phoneNumber"
				+ "8. Edit email");

		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Enter new first name");
			String newFirstName = sc.next();
			person.setFirstName(newFirstName);
			System.out.println("new first name updated");

			break;

		case 2:
			System.out.println("Enter new Last nmna");
			String newLastName = sc.next();
			person.setLastName(newLastName);
			System.out.println("new last name uodated");
			break;

		case 3:
			System.out.println("Enter new address");
			String newAddress = sc.next();
			person.setAddress(newAddress);
			System.out.println("new last name uodated");
			break;

		case 4:
			System.out.println("Enter new City");
			String newCity = sc.next();
			person.setCity(newCity);
			System.out.println("new last name uodated");
			break;

		case 5:
			System.out.println("Enter new State");
			String newState = sc.next();
			person.setState(newState);
			System.out.println("new State uodated");
			break;

		case 6:
			System.out.println("Enter new zip code");
			String newZip = sc.next();
			person.setZip(newZip);
			System.out.println("new Zip code uodated");
			break;
		
		case 7:
			System.out.println("Enter new Phone Number");
			String newPhoneNumber = sc.next();
			person.setPhoneNumber(newPhoneNumber);
			System.out.println("new Phone Number  uodated");
			break;
			
		case 8:
			System.out.println("Enter new Email");
			String newEmail = sc.next();
			person.setEmail(newEmail);
			System.out.println("new Email uodated");
			break;
			
			default:
				System.out.println("Enter your choice");
				break;
		}
		System.out.println("Edited person information is "+person);
	}
	/**
	 * Method to display person 
	 */
	public void displayPersonInfo() {
		System.out.println(contacts);
	}
}
