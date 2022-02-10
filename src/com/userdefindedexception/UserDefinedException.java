package com.userdefindedexception;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class UserDefinedException {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Name :");
	String enterName = scanner.nextLine();
	System.out.println("Enter SureName :");
	String sureName = scanner.nextLine();

	try {
		if (enterName.equals(sureName)) {
			System.out.println("Name And SureName Verified!!!");
		}else {
			throw new InvalidNameException();
		}

	} catch (InvalidNameException e) {
		System.out.println("Enter Same Name And SureName !!!");
	}
}
}
