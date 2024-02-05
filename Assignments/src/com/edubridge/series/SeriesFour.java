package com.edubridge.series;

import java.util.Scanner;

/*
	Date: 2nd February 2024
	Series IV
	Write a program to generate the following series --- 0.5,1.5,4.5,13.5,...

	Input format:
	The input containing an integer which denotes 'n'

	Output format:
	Print the series and refer the sample output for formatting.

	Sample Input:
	5

	Sample Output:
	0.5 1.5 4.5 13.5 40.5

	Case 1
	Input (stdin)
	8

	Output (stdout)
	0.5 1.5 4.5 13.5 40.5 121.5 364.5 1093.5

	Case 2
	Input (stdin)
	5

	Output (stdout)
	0.5 1.5 4.5 13.5 40.5
*/

public class SeriesFour {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of 'n'
        System.out.println("Enter the value of 'n': ");
        int n = scanner.nextInt();

        // Close the Scanner to prevent resource leak (optional)
        scanner.close();

        // Print the series
        printSeries(n);
    }

    // Function to generate and print the series
    private static void printSeries(int n) {
        double currentTerm = 0.5;

        // Print the first 'n' terms in the series
        for (int i = 0; i < n; i++) {
            System.out.print(currentTerm + " ");

            // Update the current term for the next iteration
            currentTerm *= 3;
        }
    }
}