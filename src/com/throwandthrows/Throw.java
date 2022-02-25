package com.throwandthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		File file =new File("D:");
		FileInputStream fileInputStream = new FileInputStream(file);

		Thread.sleep(2000);
	}
}
