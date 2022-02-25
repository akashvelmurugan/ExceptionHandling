package com.exception;

public class NullPoiterException {
	public static void main(String[] args) {
		
		String string =null;
		
		int length = string.length();
		System.out.println(length+1);
		
	}
	
}
