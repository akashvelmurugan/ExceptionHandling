package com.exceptionhandling;

import java.util.Scanner;

public class VoterIdException extends Exception{
	
	public VoterIdException(int age) {
		System.out.println("Your Age Is : "+age);
	}
	public static void verifyAge(int age) {
		if (age<18) {
			try {
				throw new VoterIdException(age);

			} catch (Exception e) {
				System.out.println("Please Check Your Age !!!");
			}
		}
	}
}



