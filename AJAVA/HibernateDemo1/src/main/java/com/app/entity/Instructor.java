package com.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_details_id")
	private InstructorDetails instructorDetails;

	public Instructor(String lastName, String email, String string, InstructorDetails instructorDetails) {
		super();
		this.lastName = lastName;
		this.email = email;
		this.instructorDetails = instructorDetails;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", lastName=" + lastName + ", email=" + email + ", instructorDetails="
				+ instructorDetails + "]";
	}
	
	
}
