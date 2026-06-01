package com.app;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;

@Column(name = "first-name")
private String firstName;

@Column(name = "last-name")
private String lastName;

@Column
private String email;


public Student(String firstName, String lastName, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}


@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
}





	
}
