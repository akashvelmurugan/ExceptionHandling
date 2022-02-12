package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatException {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number :");
		try {
			int number = scanner.nextInt();
			System.out.println(number);
		} catch (InputMismatchException e) {
			System.out.println("Enter Valid Number");
		}
	}
}