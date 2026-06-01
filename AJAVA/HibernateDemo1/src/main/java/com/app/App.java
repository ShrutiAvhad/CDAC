package com.app;

import java.util.List;
import java.util.function.Predicate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.app.entity.*;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		InstructorDetails instructorDetails = new InstructorDetails("Football","rahulJava.com");
		
		Instructor instructor = new Instructor("Rahul","Pawar","rahul@gmail.com", instructorDetails);
		
		session.persist(instructor);
		
		//Get instructor and instructorDetails object - NoArgsConstructor, Setters of both objects - persist
		
		//Get instructor object - param 3
		//Get instructorDetails object - param 2
		//Setter of instructorDetails on instructor persist
		
		//Instructor instructor = session.get(Instructor.class, 1);
		System.out.println(instructor);
		
		//Instructor instructor = session.get(instructor.class, 1);
		instructor.getInstructorDetails().setHobby("Painting");
		session.merge(instructor);
		
		//Instructor instructor = session.get(Instructor.class, 1);
		//session.remove(instructor);
		
		List<Instructor> list = session.createQuery("from Instructor", Instructor.class).list();
		Predicate<Instructor>p = (i) -> i.getInstructorDetails().getHobby().equals("Singing");
		list.forEach(x -> {if (p.test(x)) {System.out.println(x);}});
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
