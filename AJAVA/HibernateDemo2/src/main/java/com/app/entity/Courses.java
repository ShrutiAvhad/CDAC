package com.app.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String title;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	
	@OneToMany(MappedBy="instructor", cascade = CascadeType.ALL)
	private List<Course> course;
}
