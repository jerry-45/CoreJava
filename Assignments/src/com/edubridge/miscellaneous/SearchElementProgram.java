package com.edubridge.miscellaneous;

import java.util.Scanner;

/*
	Date: 25th January 2024
	
	Search an element
	Arun's teacher gave him the following challenge. 
	Help him solve it. "Given an array with 'n' elements by a user, 
	you need to search if a particular element is present in the array or not. 
	The element to be searched for is also given by the user"

	Input Format:
	- Input consists of n+2 integers. 
	- The first integer corresponds to ‘n’, the size of the array. 
	- The next ‘n’ integers correspond to the elements in the array. 
	- The last integer corresponds to ‘a’, the element to be searched.

	Output Format:
	Refer to sample output for details.

	Sample Input:
	5
	2
	3
	6
	8
	1
	6

	Sample Output:
	6 is present in the array
*/

public class SearchElementProgram {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt the user to enter the element to be searched
        System.out.println("Enter the element to be searched (a): ");
        int targetElement = scanner.nextInt();

        // Close the Scanner to prevent resource leak (optional)
        scanner.close();

        // Search for the target element in the array
        searchElement(array, targetElement);
    }

    // Function to search for the target element in the array
    private static void searchElement(int[] array, int targetElement) {
        // Flag to check if the element is present or not
        boolean isPresent = false;

        // Iterate through the array to search for the element
        for (int i : array) {
            if (i == targetElement) {
                isPresent = true;
                break;
            }
        }

        // Display the result
        if (isPresent) {
            System.out.println(targetElement + " is present in the array");
        } else {
            System.out.println(targetElement + " is not present in the array");
        }
    }
}