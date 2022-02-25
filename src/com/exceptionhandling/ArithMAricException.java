package com.exceptionhandling;

public class ArithMaricException extends RuntimeException{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);	
		} catch (ArithmeticException e) {
			System.out.println("Enter Valid Value ...........");
		}
	}	
}
