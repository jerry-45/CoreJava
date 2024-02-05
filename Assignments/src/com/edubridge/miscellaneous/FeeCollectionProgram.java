package com.edubridge.miscellaneous;

import java.util.Scanner;

/*
	Date: 24th January 2024
	
	Fee collection
	Write a program to determine the fee amount to be collected from a student.  
	Refer the table below for fee details. Student Type Student Type denoted as Fee Details Merit Seat 
	Day Scholar MSDS Tuition fee + Bus fee Merit Seat Hosteller MSH Tuition fee + Hostel fee Management 
	Seat Day Scholar MGSDS 150% of Tuition fee + Bus fee Management Seat Hosteller MGSH 150% of Tuition fee + 
	Hostel fee

	Input format:
	- The first input corresponds to the student type
	- The second input corresponds to the tuition fee
	- The third input corresponds to the bus fee
	- The fourth input corresponds to the hostel fees

	Output format:
	Print the total fee amount of the corresponding student with 2 decimal places. 

	Refer below sample output for formatting
	Sample Input:
	MSH
	40000
	12000
	50000

	Sample Output:
	90000.00

	Case 1
	Input (stdin)
	MSDS
	50000
	15000
	60000

	Output (stdout)
	65000.00

	Case 2
	Input (stdin)
	MSDS
	50000
	12000
	20000

	Output (stdout)
	62000.00

	Case 3
	Input (stdin)
	MSGH
	5000
	3000
	2000

	Output (stdout)
	Invalid
*/

public class FeeCollectionProgram {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student type
        System.out.println("Enter the student type (MSDS, MSH, MGSDS, MGSH): ");
        String studentType = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitivity

        // Prompt the user to enter the tuition fee
        System.out.println("Enter the tuition fee: ");
        double tuitionFee = scanner.nextDouble();

        // Prompt the user to enter the bus fee
        System.out.println("Enter the bus fee: ");
        double busFee = scanner.nextDouble();

        // Prompt the user to enter the hostel fee
        System.out.println("Enter the hostel fee: ");
        double hostelFee = scanner.nextDouble();

        // Close the Scanner to prevent resource leak (optional)
        scanner.close();

        // Calculate the total fee based on the student type
        double totalFee;
        switch (studentType) {
            case "MSDS":
                totalFee = tuitionFee + busFee;
                break;
            case "MSH":
                totalFee = tuitionFee + hostelFee;
                break;
            case "MGSDS":
                totalFee = 1.5 * tuitionFee + busFee;
                break;
            case "MGSH":
                totalFee = 1.5 * tuitionFee + hostelFee;
                break;
            default:
                System.out.println("Invalid");
                return; // Exit the program if the student type is invalid
        }

        // Display the total fee with 2 decimal places
        System.out.printf("%.2f%n", totalFee);
	}
}