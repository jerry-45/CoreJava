package com.edubridge.uncheckedexception;

import java.io.IOException;
import java.util.Scanner;

// Program to demonstrate on throw and throws Keyword

public class ThrowKeywordDemo {
	// throws keyword is used to declare a checked exception
	public static void donate(int age, int weight) throws IOException {
		if(age > 18 && weight > 45)
			System.out.println("eligible to donate blood");
		else
			// throw keyword is used to throw an exception explicitly
			throw new IOException("Not Eligible");
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age and weight: ");
		int age = s.nextInt();
		int weight = s.nextInt();
		try {
			ThrowKeywordDemo.donate(age, weight);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
}