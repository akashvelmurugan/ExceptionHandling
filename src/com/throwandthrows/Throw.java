package com.throwandthrows;

import com.exceptionhandling.ArithMAricException;

public class Throw {
	public static void main(String[] args) {


		int a=10;
		int b=0;
		//int c;
		try {
			if (a==b) {
				System.out.println("A and B is Equal");
			} else {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException e) {
			System.out.println("A and B is Not Equal");
		}


	}
}
