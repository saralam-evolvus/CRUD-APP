package com.example.crud.customException;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends Exception {

	public ResourceNotFoundException(String s) {
		super(s);
	}

}
