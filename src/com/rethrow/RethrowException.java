package com.rethrow;
public class RethrowException {
	public static void main(String[] args) {
		try {
			addition();	
		} catch (ArithmeticException e) {
			System.out.println("Enter Valid Input  !!!!!!!!!!!" );
		}
	}
	private static void addition() {
		int a=10;
		int b=0;
		int c;
		try {
			c=a/b;
		} catch (ArithmeticException e) {
			throw new ArithmeticException();
		}
	}
}
