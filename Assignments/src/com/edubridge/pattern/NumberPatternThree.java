package com.edubridge.pattern;

import java.util.Scanner;

/*
	Date: 29th January 2024
	
	Pattern 3
	Write a program to print the given pattern.

	Input format:
	The input containing an integer which denotes 'n'

	Output format:
	Refer the sample output for formatting. There is a trailing space at the end of each line.
	
	Sample Input:
	5

	Sample Output:
	1 3 5 7 9
	3 5 7 9
	5 7 9
	7 9
	9

	Case 1
	Input (stdin)
	3

	Output (stdout)
	1 3 5
	3 5
	5
*/
public class NumberPatternThree {
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
            for (int j = 0; j < n - i; j++) {
                // Print the odd numbers in the pattern
                System.out.print((2 * j + 1 + 2 * i) + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}