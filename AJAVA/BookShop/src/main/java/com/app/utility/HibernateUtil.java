package com.app.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Book;

public class HibernateUtil {

	private static SessionFactory factory;

	static {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
	}
	
	public static Object getSessionFactory() {
		// TODO Auto-generated method stub
		
		return factory;
	}

}