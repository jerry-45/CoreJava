package com.edubridge.countdigit;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		int count_digits = 0;
		Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();
        
        if(number == 0) {
        	System.out.println(count_digits+1);
        }
        
        while(number != 0) {
        	number /= 10;
        	count_digits++;
        }
        
        System.out.println("Number of digits: " + count_digits);

	}

}
