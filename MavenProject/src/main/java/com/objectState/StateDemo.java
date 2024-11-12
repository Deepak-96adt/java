package com.objectState;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student std1 = new Student();
		std1.setId(103);
		std1.setName("student Demo");
		std1.setCity("new York");
		std1.setCerti(new Certificate("demo course","3-month"));
//		Transient state - local
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(std1);
//		Persistent state - session,database
		
		std1.setName("new StuD");		
		tx.commit();

		s.close();
//		Detached state - database
		factory.close();
	}
}
