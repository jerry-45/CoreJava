package com.edubridge.loopingstatements;

// program to demonstrate on to print 1 to n numbers
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value for n:");
		int n = s.nextInt();
		
		System.out.println("Using Incrementer:");
		for(int i = 0; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nUsing Decrementer:");
		for(int i = n; i >=0; i--) {
			System.out.print(i + " ");
		}
	}
}
