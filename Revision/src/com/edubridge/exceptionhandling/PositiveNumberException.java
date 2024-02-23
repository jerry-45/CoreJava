package com.edubridge.exceptionhandling;

public class PositiveNumberException extends Exception{
	PositiveNumberException(String msg){
		System.out.println(msg);
	}
}
