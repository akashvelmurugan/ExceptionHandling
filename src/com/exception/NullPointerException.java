package com.exception;

import java.util.Scanner;

//StringIndexOutOfBoundsException
	//NullPointerException

public class NullPointerException {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		        int N = scanner.nextInt();
		       int temp=N;
		    if(N%2!=0){
		        System.out.println("Weird");   
		    }else if(2<=5){
		        System.out.println("Not Weird");
		    }else if(temp<20){
		        System.out.println("Weird");
		    }
		    else{
		        System.out.println("Not Weird");
		    }
		    scanner.close();
		    }

	}

