package com.userdefindexceptionbank;

public class BankMain {
	public static void main(String[] args) {
		int bal=500;
		int withDraw=700;
		try {
			if (bal<withDraw) {
				throw new InvalidAmountException(withDraw-bal);
			}}
		catch (InvalidAmountException e) {
			System.out.println("Enter Valid Amount");
		}
	}
}
