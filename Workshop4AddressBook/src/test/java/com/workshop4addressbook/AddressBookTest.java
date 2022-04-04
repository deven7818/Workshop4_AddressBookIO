package com.workshop4addressbook;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Address Book service
 */
public class AddressBookTest {
	
	AddressBookService address = new AddressBookService();
	
	Person person = new Person("Devendra", "Mali", "Om nagar", "Dhule", "Maharastra", "425005", "91 9405828376", "deven@gmail.com");
	
	@Test
	public void contactValidation() {
		Assert.assertEquals( person, address.addContact());
	}
	
	@Test
	public void contactNotValidation() {
		Assert.assertNotEquals( person, address.addContact());
	}
	
	
	
}
