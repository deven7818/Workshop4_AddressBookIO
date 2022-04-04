package com.workshop4addressbook;

public class AddressBookException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new Custom exceptions.
	 *
	 * @param errorMessage the error message
	 */
	public AddressBookException(String errorMessage) {
		super(errorMessage);
	}

}
