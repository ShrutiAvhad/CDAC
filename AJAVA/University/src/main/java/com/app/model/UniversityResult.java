package com.app.model;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class UniversityResult {

	private int prn;
	private String name;
	private int math;
	private int english;
	private int physics;
	private int chemistry;
	private int total;
	private double percentage;

}