package com.edubridge.miscellaneous;

// (Online Class)
// Take 10 integer inputs from user and store them in an array. 
// Again ask user to give a number. Now, tell user whether that number 
// is present in array or not.

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int numbers[] = new int[10];
		
		System.out.println("Enter 10 integers: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter number #" + (i+1) + ": ");
			numbers[i] = s.nextInt();
		}
		
		System.out.println("Enter a number to be searched in an array: ");
		int searchNumber = s.nextInt();
		
		boolean numberFound = false;
		for(int i = 0; i < 10; i++) {
			if(numbers[i] == searchNumber) {
				numberFound = true;
				break;
			}
		}
		
		if(numberFound == true) {
			System.out.println(searchNumber + " is present in the array.");
		}
		else {
			System.out.println(searchNumber + " is not present in the array.");
		}
	}

}
