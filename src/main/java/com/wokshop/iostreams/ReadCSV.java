package com.wokshop.iostreams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadCSV {
	public static void readcsv() {
		try {
			Path path = Paths.get("src\\main\\resources\\AddressBook.csv");
			System.out.println(new String(Files.readAllBytes(path)));
		} catch (Exception e) {
			System.out.println("Don't worry>>>Exceptions are handled here." + e);
		}
	}
}
