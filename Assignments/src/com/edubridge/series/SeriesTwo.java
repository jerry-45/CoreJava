package com.edubridge.series;

import java.util.Scanner;

/*
	Date: 24th January 2024
	
	Series II
	Write a program to generate the following series --- 6,11,21,36,56,...
	
	Input format:
	The input containing an integer which denotes 'n'

	Output format:
	Print the series and refer the sample output for formatting.

	Sample Input:
	6

	Sample Output:

	6 11 21 36 56 81

	Case 1
	Input (stdin)
	5

	Output (stdout)
	6 11 21 36 56

	Case 2
	Input (stdin)
	7

	Output (stdout)
	6 11 21 36 56 81 111
*/

public class SeriesTwo {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of 'n'
        System.out.println("Enter the value of 'n': ");
        int n = scanner.nextInt();

        // Close the Scanner to prevent resource leak (optional)
        scanner.close();

        // Generate and print the series
        generateSeries(n);
    }

    // Function to generate and print the series
    private static void generateSeries(int n) {
        int currentTerm = 6;

        // Print the first 'n' terms in the series
        for (int i = 0; i < n; i++) {
            System.out.print(currentTerm + " ");

            // Update the current term for the next iteration
            currentTerm += (5 + i * 5);
        }
	}
}