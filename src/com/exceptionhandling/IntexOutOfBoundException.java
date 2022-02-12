package com.exceptionhandling;

public class IntexOutOfBoundException {
	public static void main(String[] args) {

		int array[]= {0,1,2,3,4,5};

		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter Valid Index ................");
		}

	}
}
