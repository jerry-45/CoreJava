package com.edubridge.loopingstatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value for n:");
		int n = s.nextInt();
		
		System.out.println("Using Incrementer:");
		while(i <= n) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\nUsing Decrementer:");
		while(n >= 0) {
			System.out.print(n + " ");
			n--;
		}
	}
}