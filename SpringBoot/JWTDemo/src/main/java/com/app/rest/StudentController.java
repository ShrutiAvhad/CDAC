package com.app.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	List<Student> list = new ArrayList<>(List.of(
			new Student(1, "Shruti", "Java"),
			new Student(2, "Adi", "OOP"),
			new Student(3, "Vartika", "IOP")
		));
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return list;
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student theStudent)
	{
		list.add(theStudent);
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCSRFToken(HttpServletRequest request)
	{
		return (CsrfToken) request.getAttribute("_csrf");
	}
}