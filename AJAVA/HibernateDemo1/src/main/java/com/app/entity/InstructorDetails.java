package com.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class InstructorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String hobby;
	
	@Column
	private String youtubeChannel;

	public InstructorDetails(String hobby, String youtubeChannel) {
		super();
		this.hobby = hobby;
		this.youtubeChannel = youtubeChannel;
	}
	
	
}
