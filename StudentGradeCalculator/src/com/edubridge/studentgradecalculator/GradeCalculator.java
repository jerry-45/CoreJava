package com.edubridge.studentgradecalculator;

/*
 * A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 * */

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the marks in English: ");
		int eng = s.nextInt();
		
		System.out.println("Enter the marks in Marathi: ");
		int mar = s.nextInt();
		
		System.out.println("Enter the marks in Hindi: ");
		int hin = s.nextInt();
		
		System.out.println("Enter the marks in Maths: ");
		int math = s.nextInt();
		
		System.out.println("Enter the marks in Science: ");
		int sci = s.nextInt();
		
		int total = eng + mar + hin + math + sci;
		
		double percentage = (double)((total/500)*100);
		
		System.out.println(percentage);
		
		char grade = calculateGrade(percentage);
		
		System.out.println("Grade of a student is " + grade);
	}

	private static char calculateGrade(double percentage) {
		// TODO Auto-generated method stub
		char grade;
		
		if(percentage < 25)
			grade = 'F';
		else if(percentage >= 25 && percentage <45)
			grade = 'E';
		else if(percentage >= 45 && percentage < 50)
			grade = 'D';
		else if(percentage >= 50 && percentage < 60)
			grade = 'C';
		else if(percentage >= 60 && percentage < 80)
			grade = 'B';
		else
			grade = 'A';
		
		return grade;
	}

}
