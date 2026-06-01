package com.app.bean;

import java.io.Serializable;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Student implements Serializable {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String course;

	public Student(String firstName, String lastName, int age, String course) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.course = course;
	}
}