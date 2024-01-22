package com.edubridge.assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = s.nextInt();

        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
	}
}