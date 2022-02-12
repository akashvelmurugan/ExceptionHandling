package com.exceptionhandling;

import java.util.Scanner;
import java.util.StringJoiner;

//NullPointerException

public class NullPointerException {
	public static void main(String[] args) {

		String string="";

		try {
			char charAt = string.charAt(0);
		} catch (Exception e) {
			System.out.println("Enter Valid Input ...........");
		}
		System.out.println();
	}
}

