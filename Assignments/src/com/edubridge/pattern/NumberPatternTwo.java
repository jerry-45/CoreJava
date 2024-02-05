package com.edubridge.pattern;

import java.util.Scanner;

/*
	Date: 25th January 2024
	
	Pattern 2
	Write a program to print the given pattern.

	Input format:
	The input containing an integer which denotes the value of 'n'

	Output format:
	Refer the sample output for formatting.
	
	There is a trailing space at the end of each line.

	Sample Input:
	4

	Sample Output:
	1
	0 1
	1 0 1
	0 1 0 1
*/

public class NumberPatternTwo {
	 public static void main(String[] args) {
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the value of 'n'
	        System.out.println("Enter the value of 'n': ");
	        int n = scanner.nextInt();

	        // Close the Scanner to prevent resource leak (optional)
	        scanner.close();

	        // Print the pattern
	        printPattern(n);
	    }

	 // Function to print the given pattern
	 private static void printPattern(int n) {
		 for (int i = 0; i < n; i++) {
			 for (int j = 0; j <= i; j++) {
				 // Alternate between 0 and 1
	             System.out.print((i + j) % 2 + " ");
	         }
			 System.out.println();  // Move to the next line after each row
		 }
	 }
}