package com.edubridge.miscellaneous;

import java.util.Scanner;

/*
	Date: 19th January 2024
	Unicode Values-I
	Write a program to get a character as input and print its Unicode value. 
	When a character is entered, the character itself is not stored. 
	Instead, a numeric value(Unicode value) is stored.

	Sample Input :
	g
	
	Sample Output:
	103

	Case 1
	Input (stdin)
	G

	Output (stdout)
	71

	Case 2
	Input (stdin)
	B

	Output (stdout)
	66
*/

public class UnicodeValueProgram {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a character
		System.out.println("Enter a character: ");
		
		// Read the character input from the user
		char inputChar = scanner.next().charAt(0);
		
		// Close the Scanner to prevent resource leak (optional)
		scanner.close();
		
		// Display the Unicode value of the entered character
		int unicodeValue = (int) inputChar;
		System.out.println(unicodeValue);
	}
}