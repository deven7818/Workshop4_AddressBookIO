package com.workshop4addressbook;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Address Book service
 */
public class AddressBookTest {
	
	AddressBookService address = new AddressBookService();
	
	@Test
	public void firstNameValidation() {
		Assert.assertEquals(true, address);
	}
}
