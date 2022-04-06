package com.workshop4addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddressBookService {
	Scanner sc = new Scanner(System.in);
	List<Person> contacts = new ArrayList<Person>();

	/**
	 * Method to add new contact to Contact list
	 * 
	 * @param person - person details
	 */
	public List<Person> addContact() {
		try {

			/**
			 * Getting firstName from user and validating with regex. if user enters invalid
			 * name then throw exception
			 */
			System.out.println("Please Enter the first Name : ");
			String firstName = sc.next();
			boolean fName = Pattern.matches("[A-Z][a-z]{2,}", firstName);
			if (fName) {
				System.out.println("Valid firstName");
			} else {
				throw new AddressBookException("Invalid... Please Enter Valid firstName");
				// System.out.println("Invalid... Please Enter Valid firstName");
			}

			/**
			 * Getting lastName from user and validating with regex. if user enters invalid
			 * name then throw exception
			 */
			System.out.println("Please Enter the last Name : ");
			String lastName = sc.next();
			boolean lName = Pattern.matches("[A-Z][a-z]{2,}", lastName);
			if (lName) {
				System.out.println("Valid lastName");
			} else {
				throw new AddressBookException("Invalid... Please Enter Valid firstName");
			}

			/**
			 * Getting Address from user and validating with regex. if user enters invalid
			 * address then throw exception
			 */
			System.out.println("Please Enter the address : ");
			String address = sc.next();
			boolean Address = Pattern.matches("[A-Za-z0-9]{2,}", address);
			if (Address) {
				System.out.println("Valid address");
			} else {
				throw new AddressBookException("Invalid... Please Enter valid address");
			}

			/**
			 * Getting City from user and validating with regex. if user enters invalid city
			 * then throw exception
			 */
			System.out.println("Please Enter the city : ");
			String city = sc.next();
			boolean City = Pattern.matches("[A-Za-z]{2,}", city);
			if (City) {
				System.out.println("Valid city");
			} else {
				throw new AddressBookException("Invalid... Please Enter Valid city");
			}

			/**
			 * Getting state from user and validating with regex. if user enters invalid
			 * state then throw exception
			 */
			System.out.println("Please Enter the state : ");
			String state = sc.next();
			boolean State = Pattern.matches("[A-Za-z]{2,}", state);
			if (State) {
				System.out.println("Valid State");
			} else {
				throw new AddressBookException("Invalid... Please Enter Valid State");
			}

			/**
			 * Getting ZipCode from user and validating with regex. if user enters invalid
			 * zip code then throw exception
			 */
			System.out.println("Please Enter the zip : ");
			String zip = sc.next();
			boolean zipCode = Pattern.matches("[0-9]{6}", zip);
			if (zipCode) {
				System.out.println("Valid Zip");
			} else {
				throw new AddressBookException("Invalid... Please Enter Valid Zip code");
			}

			/**
			 * Getting phone number from user and validating with regex. if user enters
			 * invalid phone number then throw exception
			 */
			System.out.println("Please Enter the phone Number : ");
			String phoneNumber = sc.next();
			boolean phone = Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", phoneNumber);
			if (phone) {
				System.out.println("Valid Phone number");
			} else {
				throw new AddressBookException("Invalid... Please Enter Valid Phone number");
			}

			/**
			 * Getting Email from user and validating with regex. if user enters invalid
			 * Email then throw exception
			 */
			System.out.println("Please Enter the email : ");
			String email = sc.next();
			boolean Email = Pattern.matches("^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$", email);
			if (Email) {
				System.out.println("Valid Email address");
			} else {
				throw new AddressBookException("Invalid... Please Enter Valid Email address");
			}

			Person newPerson = new Person(firstName, lastName, address, city, state, zip, phoneNumber, email);
			contacts.add(newPerson);
		} catch (AddressBookException ex) {
			System.out.println(ex.getMessage());
		}
		return contacts;
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
		System.out
				.println("Enter your choice to edit person"
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
		System.out.println("Edited person information is " + person);
	}

	/**
	 * Method to display person
	 */
	public void displayPersonInfo() {
		System.out.println(contacts);
	}
	
	/**
	 * Method to delete person using person's name
	 */
	public void deleteContat() {
		Person person = findPerson();
		try {
			if(person != null) {
				contacts.remove(person);
			}
		}catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
