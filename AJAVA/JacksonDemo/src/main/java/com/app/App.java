package com.app;

import java.io.File;
import java.util.Scanner;

import tools.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("data/Sample.json"), Student.class);
		System.out.println(student);

		Scanner s = new Scanner(System.in);
		Student st = new Student();

		System.out.println("Enter Id : ");
		st.setId(s.nextInt());

		s.nextLine();

		System.out.print("Enter First Name: ");
		st.setFirstname(s.nextLine());

		System.out.print("Enter Last Name: ");
		st.setLastname(s.nextLine());

		System.out.print("Is Active (true/false): ");
		st.setActive(s.nextBoolean());

		// Write object to JSON file

		mapper.writeValue(new File("data/output.json"), st);

		System.out.println("Student saved successfully.");

		s.close();
	}
}
