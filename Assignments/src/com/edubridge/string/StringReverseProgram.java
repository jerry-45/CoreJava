package com.edubridge.string;

import java.util.Scanner;

/*
	Date: 25th January 2024

	String - Reverse
	Write a program to find the reverse of the given without string using string library functions:

	Input Format:
	Input consist of 1 string.

	Sample Input:
	hello

	Sample & Output:
	olleh
*/

public class StringReverseProgram {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the Scanner to prevent resource leak (optional)
        scanner.close();

        // Reverse the string and print the result
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    // Function to reverse a string without using string library functions
    private static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the character array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            // Swap characters at positions i and j
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}