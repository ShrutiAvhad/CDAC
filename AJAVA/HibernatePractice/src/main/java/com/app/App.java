package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;

public class App {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Student st = new Student();
		
		System.out.println("Enter firstname : ");
		st.setFirstname(s.next());
		
		System.out.println("Enter lastname : ");
		st.setLastname(s.next());
		
		System.out.println("Enter Email :");
		st.setEmail(s.next());
		
		session.persist(st);
		
		//GET STUDENT
		System.out.println("Emter Student id : ");
		int id = s.nextInt();
		
		st = session.get(Student.class, id);
		
		//DELETE STUDENT
		System.out.println(st);
		
		System.out.println("Enter Student id : ");
		int id1 = s.nextInt();
		
		st = session.get(Student.class, id);
		session.remove(st);
		
		//DISPLAY ALL STUDENTS
		Query<Student> query = session.createQuery("from student", Student.class);
		
		List<Student> list = query.getResultList();
		
		list.forEach(x -> System.out.println(x));
		
		session.getTransaction().commit();
		
		System.out.println("Done");
		
		session.close();
		factory.close();
		s.close();
	}
}
