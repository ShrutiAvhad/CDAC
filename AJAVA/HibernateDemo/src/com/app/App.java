package com.app;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Get Session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//Get Session
		Session session = factory.openSession();
		
		//Begin a transaction
		session.beginTransaction();
		
		//Persist student
		Student st = new Student();
		st.setFirstName("Shruti");
		st.setLastName("Avhad");
		st.setEmail("shruti@gmail.com");
		
		//session.save(st);  //object-deprecated
		session.persist(st); //void
		
		//Get student on basis of id
		System.out.println("Enter id : ");
		int Id = s.nextInt();
		Student student = session.get(Student.class, Id);
		System.out.println(student);
		
//		//Update student
//		System.out.println("Enter Id : ");
//		int Id =s.nextInt();
//		Student student = session.get(Student.class, Id);
//		st.setEmail("shruti@gmail.com");
//		//session.update(Student);
//		session.merge(student);
		
//		//delete student
//		System.out.println("Enter Id : ");
//		int Id = s.nextInt();
//		Student student = session.get(Student.class, Id);
//		//session.delete(student);
//		session.remove(student);
		
//		//HQL
//		Query<Student>query = session.createQuery("from student");
//		List<Student>list = query.list();
//		list.forEach(x -> System.out.println(x));
		
//		List<Student> list = session.createQuery("from student").list();
//		list.forEach(x -> System.out.println(x));
		
//		Query<Student>query = session.createQuery("from student where lastName =: name");
//		query.setParameter("name", "Pawar");
//		List<Student>list= query.list();
//		list.forEach(x -> System.out.println(x));
//		
		//commit transaction
		session.getTransaction().commit();
		
		//close session
		session.close();
		
		//close the factory
		factory.close();
		s.close();
	}
	
}
