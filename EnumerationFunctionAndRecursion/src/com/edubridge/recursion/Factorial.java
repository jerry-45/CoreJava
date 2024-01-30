package com.edubridge.recursion;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n*factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = s.nextInt();
		System.out.println();
		
		System.out.println("Factorial of " + number + " is " + factorial(number));
	}

}
