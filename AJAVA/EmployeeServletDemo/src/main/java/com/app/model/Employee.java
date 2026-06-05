package com.app.model;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	
	private int id;
	private String firstName;
	private String password;
	private String email;
	private String gender;
	private String age;
	
}
