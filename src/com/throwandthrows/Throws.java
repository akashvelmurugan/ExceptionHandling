package com.throwandthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {

	private static void throwException()  {

		File file= new File("D:");
		try {
		FileInputStream fileInputStream=new FileInputStream(file);
	}	
	catch(FileNotFoundException e) {
		System.out.println(e);
	}
	}	
	public static void main(String[] args)  {
			throwException();
		
			//Thread.sleep(2000);
	}
}
