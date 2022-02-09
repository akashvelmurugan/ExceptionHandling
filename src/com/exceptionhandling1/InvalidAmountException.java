	package com.exceptionhandling1;

public class InvalidAmountException extends Exception {
	double amount;
	public InvalidAmountException(int rupee) {

	amount =rupee;
	}

	
}
