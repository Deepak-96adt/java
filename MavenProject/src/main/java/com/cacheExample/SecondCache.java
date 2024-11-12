package com.cacheExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SecondCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session1 = factory.openSession();
		Student std1 = session1.get(Student.class, 100);
		System.out.println(std1);
		session1.close();
			
		Session session2 = factory.openSession();
		Student std2 = session2.get(Student.class, 100);
		System.out.println(std2);
		session2.close();
		
		factory.close();
	}
}
