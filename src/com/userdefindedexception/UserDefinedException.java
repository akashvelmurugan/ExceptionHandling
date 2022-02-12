package com.userdefindedexception;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class UserDefinedException {
	public static void main(String[] args) throws InvalidUserNameException {

		UserDefinedException userDefinedException= new UserDefinedException();
		
		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.println("Enter UserName :");
		String enterName = scanner.nextLine();
		System.out.println("Enter SureName :");
		String sureName = scanner.nextLine();

		try {
			if (enterName.equals(sureName)) {
				System.out.println("Name And SureName Verified!!!");
			}else {
				throw new InvalidUserNameException();
			}

		} catch (InvalidUserNameException e) {
			System.out.println("Invalid Name !!!!!!!!!!!");
		}
	}
}
