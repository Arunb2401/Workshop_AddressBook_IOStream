package com.wokshop.iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadJSON {

	public static void readJson() {
		try {
			Path path = Paths.get("src\\main\\resources\\readfile.json");
			System.out.println(new String(Files.readAllBytes(path)));
		} catch (Exception e) {
			System.out.println("Don't worry>>>Exceptions are handled here." + e);
		}
	}

	public static void JavaIOWrite() throws IOException {

		Path path = Paths.get("src\\main\\resources\\readfile.json");
		System.out.println(new String(Files.readAllBytes(path)));
		System.out.println("Enter content to store in file:- ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String str = bufferedReader.readLine();
		System.out.println("Content entered is: " + str);
		Files.write(path, str.getBytes());
	}
}
