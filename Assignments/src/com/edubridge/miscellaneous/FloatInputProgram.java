package com.edubridge.miscellaneous;

import java.util.Scanner;

/*
	Float Input
	Write a program to get float as input and print it. 
	The Scanner class reads formatted input from the keyboard. 
	When the user enters the float value, it is stored in variable testFloat. 
	Use '%.2f' in the System.out.printf() to display float value with 2 precisions.

	Sample Input - 1:
	56.2425
	
	Sample Output - 1:
	56.24
	
	Sample Input - 2:
	92.00
	
	Sample Output - 2:
	92.00
*/

public class FloatInputProgram {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a float
		System.out.println("Enter a float value: ");
		
		// Read the float input from the user
		float testFloat = scanner.nextFloat();
		
		// Close the Scanner to prevent resource leak (optional)
		scanner.close();
		
		// Display the dloat value with 2 decimal places
		System.out.printf("%.2f%n", testFloat);
	}
}