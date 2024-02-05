package com.edubridge.string;

import java.util.Scanner;

/*
	Date: 2nd February 2024
	
	String - Palindrome
	Write a program to find whether the given string is palindrome or 
	not without using string library functions:

	Input Format:
	Input consist of 1 string.

	Output Format:
	If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.

	Sample Input:
	computer

	Sample Output:
	Not a Palindrome

	Case 1
	Input (stdin)
	amma

	Output (stdout)
	Palindrome
*/

public class StringPalindromeProgram {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the Scanner to prevent resource leak (optional)
        scanner.close();

        // Check whether the string is a palindrome and print the result
        if (isPalindrome(inputString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    // Function to check whether a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Check for palindrome by comparing characters from both ends
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            if (charArray[i] != charArray[j]) {
                return false; // If characters don't match, it's not a palindrome
            }
            i++;
            j--;
        }

        return true; // If the loop completes without returning false, it's a palindrome
    }
}