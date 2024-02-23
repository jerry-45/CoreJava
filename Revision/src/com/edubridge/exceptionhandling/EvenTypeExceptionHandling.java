package com.edubridge.exceptionhandling;

public class EvenTypeExceptionHandling {
	
	void even() {
		int no = 10;
		
		if(no % 2 == 0)
			throw new ArithmeticException("Entered number is even");
		else
			System.out.println("odd number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenTypeExceptionHandling e = new EvenTypeExceptionHandling();
		e.even();
	}

}
