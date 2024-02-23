package com.edubridge.exceptionhandling;

public class PositiveNumber {
	
	void positiveNumber() throws PositiveNumberException {
		int i = 4;
		if(i > 0)
			throw new PositiveNumberException("Entered number is positive");
		else
			System.out.println("number is negative");
	}

	public static void main(String[] args) throws PositiveNumberException {
		// TODO Auto-generated method stub
		PositiveNumber pn = new PositiveNumber();
		pn.positiveNumber();
	}

}
