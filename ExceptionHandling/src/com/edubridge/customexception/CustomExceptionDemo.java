package com.edubridge.customexception;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String email_id = s.nextLine();
		String password = s.nextLine();
		
		try {
			if(email_id.equals("trainer21@edubridge.com") && password.equals("abc@123"))
				System.out.println("Logged In Successfully.");
			else
				throw new LoginCredentials("Invalid Credentials");
		}
		catch (LoginCredentials e) {
			System.out.println();
		}
	}
}