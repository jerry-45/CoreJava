package com.edubridge.customexception;

// Program to demonstrate on custom exception

@SuppressWarnings("serial")
public class LoginCredentials extends Exception{
	// for error message
	private String str;

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
}
