	package com.userdefindexceptionbank;

public class InvalidAmountException extends Exception {
	double amount;
	public InvalidAmountException(int rupee) {

	amount =rupee;
	}

	
}
